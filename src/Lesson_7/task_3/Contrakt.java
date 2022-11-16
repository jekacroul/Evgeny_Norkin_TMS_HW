package Lesson_7.task_3;

import java.util.Date;

public class Contrakt extends Document{
    String typeOfTovar;
    int countOfTovar;

    public Contrakt(int numberDock, Date dateOfDock, String typeOfTovar, int countOfTovar) {
        super(numberDock, dateOfDock);
        this.typeOfTovar = typeOfTovar;
        this.countOfTovar = countOfTovar;
    }

    @Override
    public String toString() {
        return "Contrakt{" +
                "typeOfTovar='" + typeOfTovar + '\'' +
                ", countOfTovar=" + countOfTovar +
                ", numberDock=" + numberDock +
                ", dateOfDock=" + dateOfDock +
                '}';
    }
}
