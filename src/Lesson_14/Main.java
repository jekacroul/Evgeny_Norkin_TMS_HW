package Lesson_14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Work.calculate();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
