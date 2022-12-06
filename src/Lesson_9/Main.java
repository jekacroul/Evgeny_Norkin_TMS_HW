package Lesson_9;
/*
Основное задание
1. Создайте класс, который описывает вектор в двумерной системе координат.
Создайте класс, который описывает вектор в трехмерной системе координат.
У каждого класса должны быть:
- конструктор с параметрами в виде списка координат (например, x, y, z);
- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
- метод, вычисляющий скалярное произведение;
- метод сложения векторов;
- метод разности векторов;
- статический метод, который принимает целое число N, и
возвращает массив случайных векторов размером N.
Предусмотреть метод сравнение векторов.
Предусмотреть метод для вывода информации о векторе.
Каждый из классов должен иметь константу, содержащею описание вектора.
Например, "Это вектор для двумерной системы координат".
Эта константа так же должна выводиться в методе для вывода информации о векторе.
Дополнительное задание
2. Предыдущее задание обобщить и написать один класс Vector для произвольной размерности.
Для этого в классе вектор для хранения координат следует использовать массив.
 */
public class Main {
    public static void main(String[] args) {

        VectorTripple vectorTripple = new VectorTripple(3,5,8);
        VectorDouble vectorDouble = new VectorDouble(1, 2);
        VectorDouble vectorDouble1 = new VectorDouble(4,5);
        System.out.println(vectorDouble.scalarCalculate(vectorDouble1));

        VectorDouble vectorDouble3 = vectorDouble.summVector(vectorDouble1);
        VectorDouble vectorDouble4 = vectorDouble.differenceVector(vectorDouble1);
        VectorDouble [] vectorDoubles = VectorDouble.randomVectors(10);
        System.out.println(VectorDouble.compare(vectorDouble, vectorDouble1));
        System.out.println(vectorDouble.calculateLenght());
        vectorDouble.printInformation();
    }
}
