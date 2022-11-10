package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int x = sc.nextInt();
        int array[] = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;

        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array));

    }
}