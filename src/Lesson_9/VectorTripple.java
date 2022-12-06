package Lesson_9;

import java.util.Random;

public class VectorTripple {
    private double x;
    private double y;
    private double z;
    private static final String CONST = "Это вектор для трехмерной системы координат";
    public VectorTripple(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLenght(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarCalculate(VectorTripple vectorTripple){
        return x * vectorTripple.x + y * vectorTripple.y + y * vectorTripple.z;
    }

    public VectorTripple summVector(VectorTripple vectorTripple){
        return new VectorTripple(x + vectorTripple.x, y + vectorTripple.y, z + vectorTripple.z);
    }

    public VectorTripple differenceVector(VectorTripple vectorTripple){
        return new VectorTripple(x - vectorTripple.x, y - vectorTripple.y, z - vectorTripple.z);
    }
    public static VectorTripple[] randomVectors(int n){
        Random random = new Random();
        VectorTripple [] vectorTripples = new VectorTripple[n];

        for (int i = 0; i < vectorTripples.length; i++) {
            vectorTripples[i] = new VectorTripple(random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        return vectorTripples;
    }

    public static boolean compare(VectorTripple vectorTripple1, VectorTripple vectorTripple2){
        return  (vectorTripple1.x == vectorTripple2.x &&
                 vectorTripple1.y == vectorTripple2.y &&
                 vectorTripple1.z == vectorTripple2.z);
    }
    public void printInformation(){
        System.out.println(CONST);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
