package spring.app.example.controller;

import java.util.Set;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import spring.app.example.exception.NotFoundException;
import spring.app.example.model.ApiResponse;
import static spring.app.example.model.ApiStatus.success;
import spring.app.example.model.dao.User;
import spring.app.example.resource.UserResource;
import spring.app.example.service.UserService;
import spring.app.example.util.MessageSupport;

@Controller
@RequestMapping("/users")
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @Autowired
  private MessageSupport messageSupport;
  
  @RequestMapping(method = POST)
  public ResponseEntity<ApiResponse> create(@RequestBody UserResource userResource, 
    HttpServletRequest request) {
    User user = userService.create(userResource);
    return new ResponseEntity<>(new ApiResponse(success, new UserResource(user)), CREATED);
  }
  
  @RequestMapping(method = GET, value = "/{uniqueId:.+}")
  public ResponseEntity<ApiResponse> get(@PathVariable String uniqueId, 
    HttpServletRequest request) throws NotFoundException {
    User user = userService.get(uniqueId);
    return new ResponseEntity<>(new ApiResponse(success, new UserResource(user)), OK);
  }
  
  @RequestMapping(method = PUT, value = "/{uniqueId:.+}")
  public ResponseEntity<ApiResponse> update(@PathVariable String uniqueId, 
    @RequestBody UserResource userResource, HttpServletRequest request) {
    User user = userService.update(uniqueId, userResource);
    return new ResponseEntity<>(new ApiResponse(success, new UserResource(user)), OK);
  }
  
  @RequestMapping(method = GET)
  public ResponseEntity<ApiResponse> getAll(HttpServletRequest request) {
    Set<User> users = userService.getAll();
    Set<UserResource> userResources = users.stream().map(user -> new UserResource(user)).collect(Collectors.toSet());
    return new ResponseEntity<>(new ApiResponse(success, userResources), OK);
  }
  
  @RequestMapping(method = DELETE, value = "/{uniqueId:.+}")
  public ResponseEntity<ApiResponse> delete(@PathVariable String uniqueId, 
    HttpServletRequest request) throws NotFoundException {
    userService.delete(uniqueId);
    return new ResponseEntity<>(new ApiResponse(success, 
      messageSupport.t("success.user.deleted")), OK);
  }
  
}