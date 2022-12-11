package Lesson_11;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        Boolean work = true;
        while (work) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Создать документ.");
            System.out.println("2. Записать информацию в документ.");
            System.out.println("3. Прочитать информацию из файла.");
            System.out.println("4. Выход");
            Integer choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    try {
                        Documents.fileCreate();
                    } catch (IOException ex){
                        System.out.println(ex);
                    }
                    break;
                case 2:
                    try {
                        Documents.writeInformationIntoFile();
                    } catch (IOException ex){
                        System.out.println(ex);
                    }
                    break;
                case 3:
                    try {
                        Documents.fileRead();
                    } catch (IOException ex){
                        System.out.println(ex);
                    }
                    System.out.println();
                    break;
                case 4:
                    work = false;
                    break;
            }
        }
    }
}
