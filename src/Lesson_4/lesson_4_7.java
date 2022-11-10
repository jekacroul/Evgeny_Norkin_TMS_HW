package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int x = scanner.nextInt();
        int array[] = new int [x];
        for (int i = 0; i <array.length; i++) {
            array[i] = (int) (Math.random() * 10 ) + 1;

        }
        System.out.println(Arrays.toString(array));

        int buf;
        boolean sort = false;

        while (!sort){
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){

                    sort = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }

            }


        }System.out.println(Arrays.toString(array));
    }
}