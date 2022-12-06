package Lesson_8.task_2;

public class Surgeon {

    int NumberOfDiseasedOrgans = 1;

    public Surgeon(int numberOfDiseasedOrgans) {
        NumberOfDiseasedOrgans = numberOfDiseasedOrgans;
    }

    public int getNumberOfDiseasedOrgans() {
        return NumberOfDiseasedOrgans;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "NumberOfDiseasedOrgans=" + NumberOfDiseasedOrgans +
                '}';
    }
}
