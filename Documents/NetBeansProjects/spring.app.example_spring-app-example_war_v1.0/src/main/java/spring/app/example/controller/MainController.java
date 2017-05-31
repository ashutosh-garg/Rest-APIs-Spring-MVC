package spring.app.example.controller;

import javax.servlet.http.HttpServletRequest;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import spring.app.example.model.ApiResponse;
import static spring.app.example.model.ApiStatus.success;

@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping(method = GET)
  public ResponseEntity<ApiResponse> greet(HttpServletRequest request) {
    return new ResponseEntity<>(new ApiResponse(success, "Welcome!"), OK);
  }
}
