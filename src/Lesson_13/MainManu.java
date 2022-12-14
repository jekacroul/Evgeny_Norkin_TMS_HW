package Lesson_13;

import java.io.IOException;
import java.util.Scanner;

public class MainManu {
    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        Boolean work = true;
        while (work) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Создать документ.");
            System.out.println("2. Прочитать информацию из файла.");
            System.out.println("3. Прочитать информацию из файла с невалидными данными.");
            System.out.println("4. Прочитать информацию из файла с валидными данными.");
            System.out.println("5. Выход");
            Integer choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    try {
                        Documents.fileCreate();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                   Documents.showDocument();
                    break;
                case 3:
                    try {
                        Documents.readInvalidDoc();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    break;
                case 4:
                    try {
                        Documents.readValidDoc();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println();
                    break;
                case 5:
                    work = false;
                    break;
            }
        }
    }
}
