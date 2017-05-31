package spring.app.example.service;
 
import java.security.Timestamp;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.app.example.exception.NotFoundException;
import spring.app.example.model.dao.User;
import spring.app.example.repository.UserRepository;
import spring.app.example.resource.UserResource;
import spring.app.example.util.MessageSupport;

@Service
public class UserService {

  private final UserRepository userRepository;
  private final MessageSupport messageSupport;

  public UserService(UserRepository userRepository, MessageSupport messageSupport) {
    this.userRepository = userRepository;
    this.messageSupport = messageSupport;
  }

  @Transactional(rollbackFor = {Throwable.class})
  public User create(UserResource userResource) {
    String email=userResource.getEmail();
//  String uid=userResource.getUniqueId(); //system generated
    boolean status = isValidEmailId(email);
    User user = userResource.getModel();
    char uniqueId[]=new char[23];
    char[] uniarr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    List<char[]> charList = Arrays.asList(uniarr);
    Collections.shuffle(charList);
    Character[] shuffledarr = (Character[]) charList.toArray();
    for(int i=0;i<10;i++)
        uniqueId[i]=shuffledarr[i];
    String uniqueid=uniqueId.toString();
    String name=userResource.getName();
    if(name.equals(""))
        try {
            throw new NotFoundException(messageSupport.t("error.user.invalidUser"),messageSupport.t("error.code.user.invalidUser"));
        } catch (NotFoundException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    if(status==false)
            try {
            throw new NotFoundException(messageSupport.t("error.user.invalidEmail"),messageSupport.t("error.code.user.invalidEmail"));
        } catch (NotFoundException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    user.setName(name);
    user.setUniqueId(uniqueid);
    user.setEmail(email);
    return userRepository.save(user);
//    try{
//        Class.forName("org.postgresql.Driver");
//        Connection c = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/template1","postgres", "postgres");
//        System.out.println("Opened database successfully");
//        Statement stmt = (Statement) c.createStatement();
//        String sql="select uniqueId,name from users";
//        ResultSet rs = (ResultSet) stmt.executeQuery(sql);
//        while(rs.next()){
//            if(rs.getString(1).equals(uid))
//                throw new NotFoundException(messageSupport.t("error.user.alreadyExist"),messageSupport.t("error.code.user.alreadyExist"));
//            if(rs.getString(2).equals(""))
//                 throw new NotFoundException(messageSupport.t("error.user.invalidUser"),messageSupport.t("error.code.user.invalidUser"));
//        }
//        if(status==false)
//            throw new NotFoundException(messageSupport.t("error.user.invalidEmail"),messageSupport.t("error.code.user.invalidEmail"));
//    }
//    catch(Exception e){
//        System.out.println(e);
//    }
    
    }

  public User get(String uniqueId) throws NotFoundException {
    User user = getUserBy(uniqueId);
    return user;
  }

  @Transactional(rollbackFor = {Throwable.class})
  public User update(String uniqueId, UserResource userResource) {
    return null;
  }

  public Set<User> getAll() {
    Set<User> users = (Set<User>) userRepository.findAll();
    return users;
  }

  @Transactional(rollbackFor = {Throwable.class})
  public void delete(String uniqueId) throws NotFoundException {
    User user = getUserBy(uniqueId);
    userRepository.delete(user);
  }

  public User getUserBy(String uniqueId) throws NotFoundException {
    User user = userRepository.findByUniqueId(uniqueId);
    if (user == null) {
      throw new NotFoundException(messageSupport.t("error.user.notFound"),
        messageSupport.t("error.code.user.notFound"));
    }
    return user;
  }
  public static boolean isValidEmailId(String email) {
    String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
    Pattern p = Pattern.compile(emailPattern);
    Matcher m = p.matcher(email);
    return m.matches();
  }
}
