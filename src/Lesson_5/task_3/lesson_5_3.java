package Lesson_5.task_3;

/*Создайте двумерный массив. Выведите на консоль диагонали массива. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson_5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер строк массива: ");
        int x  = sc.nextInt();
        System.out.print("Введите размер столбцов массива: ");
        int y = sc.nextInt();
        int array [][] = new int[x][y];
        Display(array);
    }
    static void Input(int array[][]) {

        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rn.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    static void Output(int array[][]){
        String firstdiag = "";
        int maxInd = array.length - 1;

        for (int i = maxInd; i >= 0; i--) {
            firstdiag += array[i][i] + " ";
        }
        System.out.println("Первая диагональ: " + firstdiag);
        firstdiag = "";

        for (int i = maxInd; i >= 0 ; i--) {
            firstdiag += array[i][maxInd - i] + " ";
        }
        System.out.println("Вторая диагональ: " + firstdiag);
    }
    static void Display (int array[][]){
        Input(array);
        Output(array);
    }
}