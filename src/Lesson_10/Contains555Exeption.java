package Lesson_10;

public class Contains555Exeption extends Exception {
    String message;

    public Contains555Exeption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contains555Exeption{" +
                "message='" + message + '\'' +
                '}';
    }
}
