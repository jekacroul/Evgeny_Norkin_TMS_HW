package Lesson_5.task_1;

/*Умножение двух матриц
Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц. */

import java.util.Random;

public class lesson_5_1 {
    public static void main(String[] args)
    {
        int[][]onematrix=new int[3][3];
        int[][]twomatrix=new int[3][3];

        System.out.println("First matrix: ");
        Output(onematrix);
        System.out.println("Second matrix: ");
        Output(twomatrix);
        System.out.println(" ");
        System.out.println("Multiplying of new matrices:");
        matrixMulti(onematrix, twomatrix);
    }
    static void Output(int[][]mas)
    {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++)
        {
            for (int j = 0; j < mas[i].length; j++)
            {
                mas[i][j] = rnd.nextInt(5);
                System.out.print(mas[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void matrixMulti(int[][]mas, int[][]arr)
    {
        int[][]result=new int[3][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    result[i][j] += mas[i][k]*arr[k][j];
                }
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }

}