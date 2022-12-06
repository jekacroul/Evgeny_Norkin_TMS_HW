package Lesson_8_dop;

/*
в нём есть разные факультеты, студенты, преподы, предметы.
у факультетов списки преподов и предметов
у студентов списки предметов и оценок по ним
у преподов списки предметов и факультетов
у универа список студентов
у всех есть поле id
 */

import Lesson_8_dop.universitet.Facultet;
import Lesson_8_dop.universitet.Predmet;
import Lesson_8_dop.universitet.Prepod;
import Lesson_8_dop.universitet.Students;

import java.util.Arrays;

public class Universitet {
    Facultet[] facultet;
    Prepod[] prepod;
    Students[] students;
    Predmet[] predmet;
    Integer id;

    public Universitet(Facultet[] facultet, Prepod[] prepod, Students[] students, Predmet[] predmet, Integer id) {
        this.facultet = facultet;
        this.prepod = prepod;
        this.students = students;
        this.predmet = predmet;
        this.id = id;
    }

    public Universitet(Students[] students) {
        this.students = students;
    }

    public Universitet(Students[] students, Predmet[] predmet) {
        this.students = students;
        this.predmet = predmet;
    }

    public Facultet[] getFacultet() {
        return facultet;
    }

    public void setFacultet(Facultet[] facultet) {
        this.facultet = facultet;
    }

    public Prepod[] getPrepod() {
        return prepod;
    }

    public void setPrepod(Prepod[] prepod) {
        this.prepod = prepod;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Predmet[] getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet[] predmet) {
        this.predmet = predmet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Universitet{" +
                "facultet=" + Arrays.toString(facultet) +
                ", prepod=" + Arrays.toString(prepod) +
                ", students=" + Arrays.toString(students) +
                ", predmet=" + Arrays.toString(predmet) +
                ", id=" + id +
                '}';
    }
}

