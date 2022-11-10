package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int x = sc.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(array));
        boolean n = isNumberIn(array);
        if (n){
            System.out.println("Входит");
        } else {
            System.out.println("Не входит");
        }
    }

    static boolean isNumberIn(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int checknum = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checknum) return true;
        }
        return false;

    }

}