package Lesson_10;

public class AbcContainsExeption extends Exception{
    String message;

    public AbcContainsExeption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AbcContainsExeption{" +
                "message='" + message + '\'' +
                '}';
    }
}
