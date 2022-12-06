package Lesson_7.task_2;

public class Buhgalter implements Profession{
    String dolzhnost;

    public Buhgalter(String dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    @Override
    public void Display() {
        System.out.println(dolzhnost);
    }
}
