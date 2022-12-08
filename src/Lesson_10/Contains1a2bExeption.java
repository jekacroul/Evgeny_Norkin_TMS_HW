package Lesson_10;

public class Contains1a2bExeption extends Exception{
    String message;

    public Contains1a2bExeption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contains1a2bExeption{" +
                "message='" + message + '\'' +
                '}';
    }
}
