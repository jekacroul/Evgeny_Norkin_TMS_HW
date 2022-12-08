package Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Logic {
    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3) + 1;
            System.out.println(array[i]);
        }
    }

    public static int [] buttonPush() throws IOException, InputException {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[3];
        boolean check = true;
        while (check) {
            int x = scanner.nextInt();
            if (x > 3 || x < 1){
                throw new InputException("Ты ввел хуйню");
            }
            for (int i = 0; i < number.length; i++) {
                if (number[i] == 0) {
                    number[i] = x;
                    break;
                }
            }
            check = checkMassivLanght(number);
        }
        return number;
    }

//    public static boolean checkFirstMenu(int [] array){
//                boolean haveZero = false;
//                for (int i = 0; i < array.length; i++) {
//                    if (array[i] <= 0) {
//                        System.out.println("Я же сказал, сначала второй пункт!!!!");
//                        haveZero = true;
//                        break;
//                    }
//                }
//                return haveZero;
//    }

    public static boolean checkMassivLanght(int[] array) {
        boolean check = true;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
        if (counter > 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean compare(int[] array1, int[] array){
        boolean result = Arrays.equals(array, array1);
        return result;
    }

    public static Question askQustion(Question [] question){
            Random random = new Random();
            return question[random.nextInt(question.length)];
    }

    public static boolean  userAnswer(Question question, String userAnswer){
        if (question.answer.answerText.toLowerCase().equals(userAnswer.toLowerCase())){
            return true;
        }
        return false;
    }

    public static int[] podzkazka(int [] array, int counter){
        int [] massPodsk = new int[2];
        if (counter == 0){
            counter++;
            massPodsk[0] = array[0];
            massPodsk[1] = counter;

            return massPodsk;

        } if (counter == 1){
            counter++;
            massPodsk[0] = array[1];
            massPodsk[1] = counter;

            return massPodsk;

        } if (counter == 2){
            counter++;
            massPodsk[0] = array[2];
            massPodsk[1] = counter;

            return massPodsk;
        }
        return massPodsk;
    }
}







