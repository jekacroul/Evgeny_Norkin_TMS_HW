package Lesson_10_dop;

public class WrongPasswordException extends Exception{
    String message;

    public WrongPasswordException(String message) {
        this.message = message;
    }

    public WrongPasswordException() {
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "message='" + message + '\'' +
                '}';
    }
}
