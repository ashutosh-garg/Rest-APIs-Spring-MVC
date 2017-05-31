package spring.app.example.exception;

public class NotFoundException extends CustomException {
  
  public NotFoundException(String message, String code) {
    super(message, code);
  }
}
