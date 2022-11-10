package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну первого массива: ");
        int x = scanner.nextInt();
        int array[] = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 ) + 1;

        }
        System.out.print("Введите длинну второго массива: ");
        int c = scanner.nextInt();
        int array1[] = new int[c];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10 ) + 1;

        }

        double avg = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {

                sum += array[i];
            }
            avg = sum / array.length;
        }

        double avg1 = 0;
        if (array1.length > 0){
            double sum1 = 0;
            for (int i = 0; i < array1.length; i++) {
                sum1 += array1[i];
            }
            avg1 = sum1 / array1.length;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println("Среднее арифметическое первого: " + avg);
        System.out.println("Среднее арифметическое второго: " + avg1);

        if (avg > avg1){
            System.out.println("Первый массив больше второго");
        } else if (avg < avg1) {
            System.out.println("Второй массив больше первого");
        } else
            System.out.println("Массивы равны");

    }

}