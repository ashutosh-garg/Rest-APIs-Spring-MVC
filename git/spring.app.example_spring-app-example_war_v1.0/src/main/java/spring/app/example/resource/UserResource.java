package spring.app.example.resource;

import spring.app.example.model.dao.User;

public class UserResource extends Resource<User> {
  
  public UserResource(User user) {
    super(user);
  }
  
  public UserResource() {
    super(new User());
  }
  
  public void setEmail(String email) {
    getModel().setEmail(email);
  }
  
  public void setName(String name) {
    getModel().setName(name);
  }
  
  public String getName() {
    return getModel().getName();
  }
  
  public String getEmail() {
    return getModel().getEmail();
  }
  
  public String getUniqueId() {
    return getModel().getUniqueId();
  }
  
}
