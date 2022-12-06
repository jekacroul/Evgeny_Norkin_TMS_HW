package Lesson_7.task_3;

import java.util.Date;

public class FinanceDoc extends Document{
    double summOfMonth;
    int codeOfDepartament;

    public FinanceDoc(int numberDock, Date dateOfDock, double summOfMonth, int codeOfDepartament) {
        super(numberDock, dateOfDock);
        this.summOfMonth = summOfMonth;
        this.codeOfDepartament = codeOfDepartament;
    }

    @Override
    public String toString() {
        return "FinanceDoc{" +
                "summOfMonth=" + summOfMonth +
                ", codeOfDepartament=" + codeOfDepartament +
                ", numberDock=" + numberDock +
                ", dateOfDock=" + dateOfDock +
                '}';
    }
}
