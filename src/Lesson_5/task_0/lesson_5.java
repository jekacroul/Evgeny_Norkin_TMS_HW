package Lesson_5.task_0;

/*2. Шахматная доска
Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив String'ов 8х8. С помощью циклов
задать элементам циклам значения B(Black) или W(White). Результат работы программы:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W */


import java.util.Arrays;
import java.util.Scanner;

public class lesson_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String array[][] = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = "w";
                    } else {
                        array[i][j] = "b";
                    }
                } else {
                    if (j % 2 == 0) {
                        array[i][j] = "b";
                    } else {
                        array[i][j] = "w";
                    }
                }
            }

        } for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.deepToString(array[i]));
        }
    }
}