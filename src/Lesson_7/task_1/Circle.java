package Lesson_7.task_1;

public class Circle extends Figure {
    double r = 5;
    int d = 10;
    public Circle(String name) {
        super(name);
    }

    @Override
    public double getArea() {
        double S = 3.14 * (r * r);
        System.out.println("Площадь круга: " + S);
        return S;
    }

    @Override
    public double getPerimeter() {
        double f = d * 3.14;
        double L = f = 2 * r * 3.14;
        System.out.println("Периметр круга: " + L);
        return L;
    }
}
