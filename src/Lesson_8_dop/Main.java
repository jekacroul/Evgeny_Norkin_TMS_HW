package Lesson_8_dop;
/*
сделать универ
в нём есть разные факультеты, студенты, преподы, предметы.
у факультетов списки преподов и предметов
у студентов списки предметов и оценок по ним
у преподов списки предметов и факультетов
у универа список студентов
у всех есть поле id
реализовать приём студентов, отчисление, поиск студента по имени, фамилии, отчеству
поиск студента по имени, фамилии, отчеству, факультету
поиск студента по имени студента и имени фамилии отчеству препода
 */
import Lesson_8_dop.universitet.*;

public class Main {
    public static void main(String[] args) {
        Predmet [] predmets = new Predmet[5];
        Prepod [] prepods = new Prepod[3];
        Facultet [] facultet = new Facultet[3];
        Students[] students = new Students[3];

        predmets[0] = new Predmet("Информатика", 0);
        predmets[1] = new Predmet("Информатика1", 1);
        predmets[2] = new Predmet("Информатика2", 2);
        predmets[3] = new Predmet("Информатика3", 3);
        predmets[4] = new Predmet("Информатика4",4);

        facultet[0] = new Facultet("Информатики", prepods, predmets, 0 );
        facultet[1] = new Facultet("Математики", prepods, predmets, 1);
        facultet[2] = new Facultet("Физики", prepods, predmets, 2);

        prepods[0] = new Prepod("Альберт","Энштейн", predmets, facultet, 0 );
        prepods[1] = new Prepod("Мари", "Кюри", predmets, facultet, 1);
        prepods[2] = new Prepod("Чарльз", "Дарвин", predmets, facultet, 2);

        students[0] = new Students(predmets,  facultet[0], prepods[0],7, "Норкин", "Евгений", "Александрович");
        students[1] = new Students(predmets,  facultet[1], prepods[1],8, "Бредихин", "Никита", "Юрьевич");
        students[2] = new Students(predmets,  facultet[2], prepods[2],7, "Ксеневич", "Владислав", "Геннадьевич");

        Universitet universitet = new Universitet(facultet, prepods, students, predmets, 0);

        Work.suchStudent(universitet,"Норкин", "Евгений", "Александрович" , facultet[0]);
        System.out.println();
        Work.suchStudentToPrepod(universitet, "Норкин", "Альберт", "Энштейн");
        System.out.println();
        Work.addStudent(universitet, facultet[0] , prepods[0],"Прокопьева", "Мария", "Владимировна", 6);
        System.out.println();
        Work.deleteStudent(universitet, "Норкин", "Евгений", "Александрович");
        Work.printArray(universitet.getStudents());
    }
}
