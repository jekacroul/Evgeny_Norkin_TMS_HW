package Lesson_10_dop;

public class WrongLoginException extends Exception{
    String message;

    public WrongLoginException(String message) {
        this.message = message;
    }

    public WrongLoginException() {
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "message='" + message + '\'' +
                '}';
    }
}
