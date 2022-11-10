package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_4_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Введите длинну массива: ");
        while (true) {
            x = scanner.nextInt();
            if (x >= 5 && x <= 10) {
                System.out.println("Число подошло");
                break;
            }
            System.out.print("Число не подходит введите еще раз: ");
        }
        int array[] = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(array));

        String g = "Четные числа: ";

        int counter = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                g += number + " ";
                counter++;
            }
        }
        System.out.println(g);
        int array1[] = new int[counter];
        for (int i = 0, b = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array1[b] = array[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}


