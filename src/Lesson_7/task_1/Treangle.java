package Lesson_7.task_1;

public class Treangle extends Figure {
    int a = 5;
    int b = 6;
    int c = 6;


    public Treangle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        double p = 0.5 * (a + b + c);
        double S = Math.abs(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника: " + S);
        return S;
    }

    @Override
    public double getPerimeter() {
        double p = a + b + c;
        System.out.println("Периметр треугольника: " + p);
        return p;
    }
}
