package Lesson_7.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double summPerimeter = 0;
        double summArea = 0;

        Treangle treangle = new Treangle("Треугольник");
        Rectangle rectangle = new Rectangle("Прямоугольник");
        Circle circle = new Circle("Круг");

        Figure figures[] = new Figure[4];
        figures[0] = treangle;
        figures[1] = rectangle;
        figures[2] = circle;


        for (int i = 0; i < figures.length; i++) {

            summArea += figures[i].getArea();
            summPerimeter += figures[i].getPerimeter();

        }
        System.out.println(summArea);
        System.out.println(summPerimeter);
    }
}
