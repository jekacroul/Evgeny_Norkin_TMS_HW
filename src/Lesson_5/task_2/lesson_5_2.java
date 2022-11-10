package Lesson_5.task_2;

/*Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson_5_2 {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер строк массива: ");
        int x  = sc.nextInt();
        System.out.print("Введите размер столбцов массива: ");
        int y = sc.nextInt();

        int array [][] = new int[x][y];



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rn.nextInt(10);
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }


        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}