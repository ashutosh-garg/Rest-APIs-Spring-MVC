package spring.app.example.exception;

public class AlreadyExistException extends CustomException {
  
  public AlreadyExistException(String message, String code) {
    super(message, code);
  }
}
