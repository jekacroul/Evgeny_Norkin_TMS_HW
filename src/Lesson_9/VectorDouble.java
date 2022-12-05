package Lesson_9;

import java.util.Random;

public class VectorDouble {

    private double x, y;
    private static final String CONST = "Это вектор для двумерной системы координат";

    public VectorDouble(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLenght(){
        return Math.sqrt(x * x + y * y);
    }

    public double scalarCalculate(VectorDouble vectorDouble){
        return x * vectorDouble.x + y * vectorDouble.y;
    }

    public VectorDouble summVector(VectorDouble vectorDouble){
        return new VectorDouble(x + vectorDouble.x, y + vectorDouble.y);
    }

    public VectorDouble differenceVector(VectorDouble vectorDouble){
        return new VectorDouble(x - vectorDouble.x, y - vectorDouble.y);
    }
    public static VectorDouble[] randomVectors(int n){
        Random random = new Random();
        VectorDouble [] vectorDoubles = new VectorDouble[n];

        for (int i = 0; i < vectorDoubles.length; i++) {
            vectorDoubles[i] = new VectorDouble(random.nextDouble(),random.nextDouble());
        }
        return vectorDoubles;
    }

    public static boolean compare(VectorDouble vectorDouble1, VectorDouble vectorDouble2){
        return  (vectorDouble1.x == vectorDouble2.x && vectorDouble1.y == vectorDouble2.y);
    }

    public void printInformation(){
        System.out.println(CONST);
        System.out.println(x);
        System.out.println(y);
    }

}
