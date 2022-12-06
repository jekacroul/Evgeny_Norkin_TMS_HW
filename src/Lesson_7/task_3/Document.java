package Lesson_7.task_3;

import java.util.Date;

public abstract class Document {
    int numberDock;
    Date dateOfDock;

    public Document(int numberDock, Date dateOfDock) {
        this.numberDock = numberDock;
        this.dateOfDock = dateOfDock;
    }
}
