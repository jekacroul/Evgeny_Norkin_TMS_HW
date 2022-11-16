package Lesson_7.task_2;

public class Director implements Profession{
    String dolzhnost;

    public Director(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    @Override
    public void Display() {
        System.out.println(dolzhnost);
    }
}
