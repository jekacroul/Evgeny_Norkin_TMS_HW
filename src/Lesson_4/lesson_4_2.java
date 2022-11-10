package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int x = sc.nextInt();
        int array[] = new int[x];

        for (int i = 0; i < array.length; i++) {
            array[i] =  (int) (Math.random() * 10) + 1;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[array.length - 1];
        int avg = array[array.length / 2];


        System.out.println("Avg: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}