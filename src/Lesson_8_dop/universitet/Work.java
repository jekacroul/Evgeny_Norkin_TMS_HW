package Lesson_8_dop.universitet;

import Lesson_8_dop.Universitet;

public class Work{
    public static void addStudent(Universitet universitet,Facultet facultet , Prepod prepod,String name, String lastName, String middleName, Integer grade){
        Students students = new Students(universitet.getPredmet(), facultet, prepod,grade, name, lastName, middleName);
        Students [] student = new Students[universitet.getStudents().length + 1];
        for (int i = 0, b = 0; i < student.length; i++) {
            if (i >= universitet.getStudents().length) {
                student[i] = students;
            } else {
                student[i] = universitet.getStudents()[b];
                b++;
            }
        }
        universitet.setStudents(student);
    }
    public static void  deleteStudent(Universitet universitet,String name, String lastName, String middleName ){
        Students [] students1 = new Students[universitet.getStudents().length - 1];
        for (int i = 0, b = 0; i < students1.length; i++) {
            if (universitet.getStudents()[b].getName().equals(name) &&
                    universitet.getStudents()[b].getLastName().equals(lastName) &&
                    universitet.getStudents()[b].getMiddleName().equals(middleName)) {
                b++;
        }
                students1[i] = universitet.getStudents()[b];
                b++;
        }
        universitet.setStudents(students1);
    }
    public static void printArray(Students [] students1){
        for (int i = 0; i < students1.length; i++) {
            if (students1[i] != null){
                System.out.println(students1[i]);
            }
        }
    }
    public static void suchStudent(Universitet  universitet, String name, String lastName, String middleName, Facultet facultet){
        for (int i = 0; i < universitet.getStudents().length; i++) {
            if (universitet.getFacultet()[i].equals(facultet) &&
                    universitet.getStudents()[i].getName().equals(name) &&
            universitet.getStudents()[i].getLastName().equals(lastName) &&
            universitet.getStudents()[i].getMiddleName().equals(middleName)){
                System.out.println(universitet.getStudents()[i]);
            }
        }
    }
    public static void suchStudentToPrepod(Universitet universitet,String name ,String prepodName, String prepodLastName){
        for (int i = 0; i < universitet.getStudents().length; i++) {
            if (universitet.getStudents()[i].getName().equals(name) &&
                universitet.getPrepod()[i].getName().equals(prepodName) &&
                universitet.getPrepod()[i].getLastName().equals(prepodLastName)){
                System.out.println(universitet.getStudents()[i]);
            }
        }
    }
}
