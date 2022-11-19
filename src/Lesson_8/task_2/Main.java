package Lesson_8.task_2;

/*
Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */

public class Main {
    public static void main(String[] args) {

        Plan plan = new Plan();

        Pacient pacient = new Pacient("Евгений", "Кариес",1);
        Pacient pacient1 = new Pacient("Влад", "Операция",2);
        Pacient pacient2 = new Pacient("Маша", "Простуда",3);



        plan.savePacient(pacient);
        plan.savePacient(pacient1);
        plan.savePacient(pacient2);
        plan.Plan(pacient);
        plan.treatmentDantist(pacient);
        plan.Plan(pacient1);
        plan.treatmentSurgeon(pacient1);
        plan.Plan(pacient2);
        plan.treatmentTherapist(pacient2);
    }
}
