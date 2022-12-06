package Lesson_7.task_1;

public class Rectangle extends Figure {
    int a = 5;
    int d = 8;
    int b = 9;
    int c = 5;
    int e = 9;
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        double S = a * Math.abs((d * d) - (a * a));
        System.out.println("Площадь прямоугольника: " + S);
        return S;
    }

    @Override
    public double getPerimeter() {
        int P = a + b + c + e;
        System.out.println("Периметр прямоугольника: " + P);
        return P;
    }
}

