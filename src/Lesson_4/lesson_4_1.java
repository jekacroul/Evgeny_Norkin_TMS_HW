package lesson_4;

import java.util.Arrays;
import java.util.Scanner;
public class lesson_4_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int x = scanner.nextInt();
        int array[] = new int [x];
        for (int i = 0; i <array.length; i++) {
            array[i] = (int) (Math.random() * 10 ) + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Введите число которое необходимо удалить: ");

        int number = scanner.nextInt();
        int needIndexes = getIndexes(array, number).length;
        int sortedArrays[] = new int[array.length - needIndexes];
        for(int i = 0, b = 0; i < array.length;i++){
            if(array[i] != number){
                sortedArrays[b] = array[i];
                b++;
            }
        }

        System.out.println(Arrays.toString(sortedArrays));
    }
    public static int[] getIndexes(int[] array, int number){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(number == array[i]){
                counter++;
            }
        }
        int indexArrays[] = new int[counter];
        for(int i = 0, b = 0; i < array.length; i++){
            if(number == array[i]){
                indexArrays[b] = i;
                b++;
            }
        }
        return indexArrays;
    }
}