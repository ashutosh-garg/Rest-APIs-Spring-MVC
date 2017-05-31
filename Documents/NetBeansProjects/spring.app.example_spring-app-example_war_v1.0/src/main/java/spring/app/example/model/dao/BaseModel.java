package spring.app.example.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class BaseModel implements Serializable {
  
  @Id
  @Column(name = "id")
  private Long id;
  
  protected BaseModel(Long id) {
    this.id = id;
  }
  
  @JsonIgnore
  public Long getId() {
    return this.id;
  }
  
  @JsonProperty
  public void setId(Long id) {
    this.id = id;
  }
}
