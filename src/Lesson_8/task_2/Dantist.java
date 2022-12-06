package Lesson_8.task_2;

public class Dantist {

    int numberOfDiseasedTeeth = 3;
    int teeth = 32;


    public Dantist(int numberOfDiseasedTeeth, int teeth) {
        this.numberOfDiseasedTeeth = numberOfDiseasedTeeth;
        this.teeth = teeth;
    }

    public int getNumberOfDiseasedTeeth() {
        return numberOfDiseasedTeeth;
    }

    public int getTeeth() {
        return teeth;
    }

    @Override
    public String toString() {
        return "Dantist{" +
                "numberOfDiseasedTeeth=" + numberOfDiseasedTeeth +
                ", teeth=" + teeth +
                '}';
    }
}
