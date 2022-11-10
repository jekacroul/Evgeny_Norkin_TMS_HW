package lesson_3;

import java.util.Scanner;

public class lesson_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи число: ");
        if (console.hasNextInt()) {
            int chis = console.nextInt();
            int number = 0;
            if (chis < 15 & chis > 0) {
                number = 1;
                System.out.println("Group " + (number));
            } else if (chis < 30 & chis >= 15) {
                number = 2;
                System.out.println("Group " + (number ));
            } else if (chis >= 30) {
                number = 3;
                System.out.println("Group " + (number ));
            } else {
                System.out.println("Число не входит в диапозон, попробуй еще раз");
            }

            for (int i = 0; i < number; i++) {
                System.out.println("Kiss my steel ass");
            }
        } else {
            System.out.println("Вы ввели неверный символ, перезапустите программу");
        }
    }
}