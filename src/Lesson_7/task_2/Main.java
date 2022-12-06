package Lesson_7.task_2;

import Lesson_6_v2.Work;

public class Main {
    public static void main(String[] args) {


        Director director = new Director("Директор");
        Buhgalter buhgalter = new Buhgalter("Бухгалтер");
        Worker worker = new Worker("Рабочий");

        director.Display();
        buhgalter.Display();
        worker.Display();
    }
}
