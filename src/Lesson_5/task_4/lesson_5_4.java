package Lesson_5.task_4;

/*Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.*/

import Helper.Helper_method;
import java.util.Scanner;

public class lesson_5_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер строк массива: ");
        int x = sc.nextInt();
        System.out.print("Введите размер столбцов массива: ");
        int y = sc.nextInt();
        int array1[][] = new int[x][y];

        Helper_method.randomlyFillAndSort(array1, true);
        System.out.println();
    }
}