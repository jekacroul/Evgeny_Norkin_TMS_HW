package Test;

public class InputException extends Exception{
    private String message;
    public InputException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "InputException{" +
                "message='" + message + '\'' +
                '}';
    }
}
