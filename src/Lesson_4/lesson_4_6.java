package lesson_4;

import java.util.Arrays;

public class lesson_4_6 {
    public static void main(String[] args) {
        String array[] = new String[] {"Петя", "Антон", "Женя", "Дима"};
        System.out.println("До сортировки: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("После сортировки: " + Arrays.toString(array));
    }
}