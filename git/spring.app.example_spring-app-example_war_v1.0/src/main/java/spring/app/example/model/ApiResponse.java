package spring.app.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
  private ApiStatus status;
  private Object body;
  
  public ApiResponse(ApiStatus status, Object body) {
    this.status = status;
    this.body = body;
  }
}
