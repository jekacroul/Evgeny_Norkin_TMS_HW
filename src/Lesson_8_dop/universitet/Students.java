package Lesson_8_dop.universitet;

import Lesson_8_dop.universitet.Predmet;

import java.util.Arrays;

public class Students {
   Predmet [] predmets;
   Facultet facultet;
   Prepod prepods;
   Integer grade;
   final Integer id;
   String name;
   String lastName;
   String middleName;
    int counter = 0;

    public Students(Predmet[] predmets, Facultet facultet, Prepod prepods, Integer grade,String name, String lastName, String middleName) {
        this.predmets = predmets;
        this.facultet = facultet;
        this.prepods = prepods;
        this.grade = grade;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = counter++;
    }

    public Predmet[] getPredmets() {
        return predmets;
    }

    public void setPredmets(Predmet[] predmets) {
        this.predmets = predmets;
    }

    public Facultet getFacultet() {
        return facultet;
    }

    public void setFacultet(Facultet facultet) {
        this.facultet = facultet;
    }

    public Prepod getPrepods() {
        return prepods;
    }

    public void setPrepods(Prepod prepods) {
        this.prepods = prepods;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

//    @Override
//    public String toString() {
//        return "Students{" +
//                "predmets=" + Arrays.toString(predmets) +
//                ", facultet=" + facultet +
//                ", prepods=" + prepods +
//                ", grade=" + grade +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", middleName='" + middleName + '\'' +
//                '}';
//    }

        @Override
    public String toString() {
        return "Студент: " +
                name + " " +
                lastName + " " +
                middleName + "\n " +
                Arrays.toString(predmets) +
                prepods +
                "оценка: " + grade ;

    }
}
