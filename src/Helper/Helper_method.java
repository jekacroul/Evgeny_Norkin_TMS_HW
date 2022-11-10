package Helper;

import java.util.Arrays;
import java.util.Random;
public class Helper_method {
    public static void inputTwoDimensional(int array[][]) { // Заполнение случайными числами двумерного массива

        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rn.nextInt(10);
            }
        }
    }
    public static void inputOneDimensional(int array[]) { // Заполнение случайными числами одномерного массива

        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }
    }
    public static void sortBubbleTwo(int array[][]) { //Сортировка пузырьком двумерного массива
        int buf;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array[i].length; j++) {
                    if (array[i][j] < array[i][j - 1]) {
                        sort = false;
                        buf = array[i][j];
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = buf;
                    }
                }
            }
        }
    }
    public static void sortBubbleOne(int array[]) { //Сортировка пузырьком для одномерного массива

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }
    public static void display (int array[][]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    public static void randomlyFillAndSort( int array[][], boolean wantSort){
        inputTwoDimensional(array);
        if (wantSort){
            display(array);
            System.out.println();
            sortBubbleTwo(array);
        }
        display(array);
        System.out.println();
    }
}