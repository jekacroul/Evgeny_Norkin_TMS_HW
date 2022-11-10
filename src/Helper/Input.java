package Helper;

import java.util.Scanner;

public class Input {
    public static int[][] inputScanner() { // Ввод двумерного массива

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер строк массива: ");
        int m = sc.nextInt();
        System.out.print("Введите размер столбцов массива: ");
        int n = sc.nextInt();
        int array [][] = new int[m][n];
        return array;
    }
    public int[] inputOneDimensional() { // Ввод одномерного массива
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int x = sc.nextInt();
        int array[] = new int[x];
        return array;

    }
}