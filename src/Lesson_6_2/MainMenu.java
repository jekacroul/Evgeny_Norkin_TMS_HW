package Lesson_6_2;

import java.util.Scanner;

public class MainMenu {
    public static void MainMenu(Computer computer, Computer computer1){
        Scanner sc = new Scanner(System.in);
        Boolean exit = true;
        while (exit){
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Посмотреть ПК без характеристик.");
            System.out.println("2. Посмотреть ПК с характеристиками.");
            System.out.println("3. Выход");
            Integer choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println(computer);
                break;
            case 2:
                System.out.println(computer1);
                break;
            case 3:
                exit = false;
                break;
        }
        }
    }
}
