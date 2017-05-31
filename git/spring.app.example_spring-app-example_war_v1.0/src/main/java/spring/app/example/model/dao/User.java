package spring.app.example.model.dao;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseModel {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "name")
  private String name;
  
  @Column(name = "uniqueId")
  private String uniqueId;
  
  @Column(name = "email")
  private String email;
}
