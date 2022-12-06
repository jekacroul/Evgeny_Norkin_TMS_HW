package Lesson_7.task_2;

public class Worker implements Profession{
    String dolzhnost;

    public Worker(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    @Override
    public void Display() {
        System.out.println(dolzhnost);
    }
}
