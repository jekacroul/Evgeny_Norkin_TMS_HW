package Lesson_14_1;

import java.util.HashMap;
import java.util.Scanner;

public class Calculator {
    static HashMap<Integer, Integer> arabicNum = new HashMap<>();
    static HashMap<Integer, String> romeNum = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    private static void fillingRomeNum() {
        if (romeNum.isEmpty()) {
            romeNum.put(1, "I");
            romeNum.put(4, "IV");
            romeNum.put(5, "V");
            romeNum.put(9, "IX");
            romeNum.put(10, "X");
            romeNum.put(40, "XL");
            romeNum.put(50, "L");
            romeNum.put(90, "XC");
            romeNum.put(100, "C");
            romeNum.put(400, "CD");
            romeNum.put(500, "D");
            romeNum.put(900, "CM");
            romeNum.put(1000, "M");
        }
    }

    private static void fillingArabicNum() {
        if (arabicNum.isEmpty()) {
            for (int i = 0; i < 11; i++) {
                arabicNum.put(i, i);
            }
        }
    }

    private static void chooseOperation(Integer choise, Integer inputNum1, Integer inputNum2) {
        if (choise == 1) {
            addition(inputNum1, inputNum2);
        }
        if (choise == 2) {
            subtraction(inputNum1, inputNum2);
        }
        if (choise == 3) {
            multiplication(inputNum1, inputNum2);
        }
        if (choise == 4) {
            division(inputNum1, inputNum2);
        }
    }

    private static Integer addition(Integer inputNum1, Integer inputNum2) {
        Integer calculate = null;
        for (int i = 0; i < arabicNum.size(); i++) {
            if (arabicNum.containsValue(inputNum1) && arabicNum.containsValue(inputNum2)) {
                Integer result = arabicNum.get(inputNum1);
                Integer result1 = arabicNum.get(inputNum2);
                calculate = result + result1;
                System.out.println("В каком формате вывести ответ? 0 - арабские цифры, 1 - римские цифры");
                int choise = scanner.nextInt();
                if (choise == 0){
                    System.out.println("Результат: " + calculate);
                    break;
                } else {
                    System.out.println("Результат: " + ArabicToRom(calculate));
                    break;
                }
            }
        }
        return calculate;
    }

    private static Integer division(Integer inputNum1, Integer inputNum2) {
        Integer calculate = null;
        for (int i = 0; i < arabicNum.size(); i++) {
            if (arabicNum.containsValue(inputNum1) && arabicNum.containsValue(inputNum2)) {
                Integer result = arabicNum.get(inputNum1);
                Integer result1 = arabicNum.get(inputNum2);
                calculate = result / result1;
                System.out.println("В каком формате вывести ответ? 0 - арабские цифры, 1 - римские цифры");
                int choise = scanner.nextInt();
                if (choise == 0){
                    System.out.println("Результат: " + calculate);
                    break;
                } else {
                    System.out.println("Результат: " + ArabicToRom(calculate));
                    break;
                }
            }
        }
        return calculate;
    }

    private static Integer multiplication(Integer inputNum1, Integer inputNum2) {
        Integer calculate = null;
        for (int i = 0; i < arabicNum.size(); i++) {
            if (arabicNum.containsValue(inputNum1) && arabicNum.containsValue(inputNum2)) {
                Integer result = arabicNum.get(inputNum1);
                Integer result1 = arabicNum.get(inputNum2);
                calculate = result * result1;
                System.out.println("В каком формате вывести ответ? 0 - арабские цифры, 1 - римские цифры");
                int choise = scanner.nextInt();
                if (choise == 0){
                    System.out.println("Результат: " + calculate);
                    break;
                } else {
                    System.out.println("Результат: " + ArabicToRom(calculate));
                    break;
                }
            }
        }
        return calculate;
    }

    private static Integer subtraction(Integer inputNum1, Integer inputNum2) {
        Integer calculate = null;
        for (int i = 0; i < arabicNum.size(); i++) {
            if (arabicNum.containsValue(inputNum1) && arabicNum.containsValue(inputNum2)) {
                Integer result = arabicNum.get(inputNum1);
                Integer result1 = arabicNum.get(inputNum2);
                calculate = result - result1;
                System.out.println("В каком формате вывести ответ? 0 - арабские цифры, 1 - римские цифры");
                int choise = scanner.nextInt();
                if (choise == 0){
                    System.out.println("Результат: " + calculate);
                    break;
                } else {
                    System.out.println("Результат: " + ArabicToRom(calculate));
                    break;
                }
            }
        }
        return calculate;
    }

    private static void inputNumber() {
        while (true) {
            fillingArabicNum();
            fillingRomeNum();
            System.out.print("Введите первое число: ");
            Integer inputNum1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            Integer inputNum2 = scanner.nextInt();
            System.out.println("Выберите операцию: " + "\n" +
                    "1 - Сложение" + "\n" +
                    "2 - Вычитание" + "\n" +
                    "3 - Умножение" + "\n" +
                    "4 - Деление");
            Integer choise = scanner.nextInt();
            chooseOperation(choise, inputNum1, inputNum2);
        }
    }

    public static void start() {
        inputNumber();
    }
    public static String ArabicToRom(Integer calculate) {
        int counter;
        String rome = "";

        if (calculate<0){
            calculate = Math.abs(calculate);
            rome="-";
        }
        for (int i = 1000; i > 0; i = i / 10) {
            counter = calculate / i;
            if (counter < 4) {
                while (counter > 0) {
                    rome = rome + romeNum.get(i);
                    counter--;
                    calculate = calculate - i;
                }
            } else if (counter == 4 || counter == 9) {
                rome = rome + romeNum.get(i) + romeNum.get(i * counter + i);
                calculate = calculate - i * counter;
            } else if (counter > 5 && counter < 9) {
                rome = rome + romeNum.get(i * 5);
                calculate = calculate - i * 5;
                while (counter - 5 > 0) {
                    rome = rome + romeNum.get(i);
                    calculate = calculate - i;
                    counter--;
                }
            } else {
                rome = rome + romeNum.get(i * counter);
                calculate = calculate - i * counter;
            }
        }
        return rome;
    }
}
