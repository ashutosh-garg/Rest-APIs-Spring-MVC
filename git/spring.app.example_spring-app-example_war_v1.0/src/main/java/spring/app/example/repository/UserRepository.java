package spring.app.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.app.example.model.dao.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  
  public User findByUniqueId(String uniqueId);
  
}
