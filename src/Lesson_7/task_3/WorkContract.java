package Lesson_7.task_3;

import java.util.Date;

public class WorkContract extends Document{
    Date dateOfContract;
    String nameOfOfficer;

    public WorkContract(int numberDock, Date dateOfDock, Date dateOfContract, String nameOfOfficer) {
        super(numberDock, dateOfDock);
        this.dateOfContract = dateOfContract;
        this.nameOfOfficer = nameOfOfficer;
    }

    @Override
    public String toString() {
        return "WorkContract{" +
                "dateOfContract=" + dateOfContract +
                ", nameOfOfficer='" + nameOfOfficer + '\'' +
                ", numberDock=" + numberDock +
                ", dateOfDock=" + dateOfDock +
                '}';
    }
}
