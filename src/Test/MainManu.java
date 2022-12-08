package Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainManu {
    public static void mainMenu(int[] array, Question [] question) {
    Scanner scanner = new Scanner(System.in);
    int podskazka [] = new int[]{0, 0};
    Boolean work = true;
        System.out.println("Привет, я создал игру, в которой тебе нужно выбраться из комноты введя " +
                "определунню последовательность цифр. Удачи!" +
                "\nP.S Кобинации можно вводить только от 1 - 3");
        while (work) {
        System.out.println("Выберите пункт меню: ");
        System.out.println("1. Введите последовательность.");
        System.out.println("2. Получить подсказку.");
        System.out.println("3. Выход");
        System.out.print("Введенный пункт меню: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                Logic.fillArray(array);
                try {
                        int[] ints = Logic.buttonPush();
                        boolean compare = Logic.compare(ints, array);
                        String result = compare ? "Ответ верный" : "Ответ неверный";
                        System.out.println(result);
                        break;

                } catch (IOException | InputMismatchException ex){
                    System.out.println("Ты ввел недопустимый символ");
                    continue;
                } catch (InputException e) {
                    System.out.println(e);
                    System.out.println();
                    continue;
                }
            case 2:
                int counter = podskazka[1];
                Question question1 = Logic.askQustion(question);
                System.out.println(question1.getQuestionText());
                String otvet = scanner.next();
                boolean userAnswer = Logic.userAnswer(question1, otvet);
                if (userAnswer) {
                    podskazka = Logic.podzkazka(array, counter);
                    System.out.println(Arrays.toString(podskazka) + "[Значение комбинации, номер элемента]");
                } else {
                    System.out.println("Неверный ответ");
                }
                break;
            case 3:
                work = false;
                break;
            }
        }
    }
}
