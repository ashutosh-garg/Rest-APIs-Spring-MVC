package spring.app.example.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

public class Resource<T> {
  
  @Getter
  @Setter
  @JsonIgnore
  private T model;
  
  public Resource(T model) {
    this.model = model;
  }
}
