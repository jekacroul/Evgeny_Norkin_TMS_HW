package Lesson_10;

/*
2. Дана произвольная строка.
Вывести на консоль новую строку, в которой продублирована каждая буква из начальной строки.
Например, "Hello" -> "HHeelllloo".
Дополнительное задание
3. Дана строка произвольной длины с произвольными словами. Найти самое короткое слово в строке и вывести его на экран.
 Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
4. Дана строка произвольной длины с произвольными словами. Найти слово, в котором число различных символов минимально.
Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них. Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
5. Дана строка произвольной длины с произвольными словами. Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
TeachMeSkills.by
Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Work {
    public static void split(Stroka stroka) {
        String str[] = stroka.string.split("-");
        for (int i = 0; i < str.length - 2; i++) {
            if (str[i].length() <= 3){
                str[i] = "***";
            }
            System.out.println(str[i]);
        }
    }

    public static void charToDisplay(Stroka stroka) {
        String stroka1 = stroka.string.replaceAll("[0-9]", "");
        stroka1 = stroka1.replaceAll("-", "/");
        stroka1 = stroka1.replaceAll("//", "/");
        System.out.println("Строка без цифр: " + stroka1);
    }

    public static void charsToLowerCase(Stroka stroka) {
        String stroka1 = stroka.string.replaceAll("[0-9]", "");
        stroka1 = stroka1.toLowerCase().replaceAll("-", "/");
        stroka1 = stroka1.replaceAll("//", "/");
        System.out.println("Строка в нижнем регистре: " + stroka1);
    }

    public static void charsToUpperCase(Stroka stroka) {
        StringBuilder stringBuilder = new StringBuilder();
        String stroka1 = stroka.string.replaceAll("[0-9]", "");
        stroka1 = stroka1.toUpperCase().replaceAll("-", "/");
        stroka1 = stroka1.replaceAll("//", "/");
        stringBuilder.append(stroka1);
        System.out.println("Letters: " + stringBuilder);
    }

    public static boolean findCharsABC(Stroka stroka) {
        String str1[] = stroka.string.split("-");
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].contains("ABC") || str1[i].contains("abc")) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFirstBlock(Stroka stroka){
       if (stroka.string.startsWith("555")){
           return true;
       }
       return false;
    }

    public static boolean checkEndBlock(Stroka stroka){
        if (stroka.string.endsWith("1a2bb")){
            return true;
        }
        return false;
    }

    public static void charsDouble(Stroka stroka){
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stroka.string.toCharArray()){
            stringBuilder.append(c);
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder.toString());
    }

    public static void findMinLenght(Stroka stroka){
        System.out.println(stroka);
        String [] str = stroka.string.split("-");
        for (int i = 0, b = 0 ; i < str.length; i++) {
            if (str[i].length() <= str[b + 1].length()){
                System.out.println(str[i]);
            } if (b > str.length){
                i++;
            }
        }
    }

    public static void findMaxLenght(Stroka stroka) {
        System.out.println(stroka);
        String [] str = stroka.string.split("-");
        for (int i = 0, b = 0 ; i < str.length; i++) {
            if (str[i].length() > str[b + 1].length()){
                System.out.println(str[i]);
            } if (b > str.length){
                i++;
            }
        }
    }
    private static int diffWords(String st){ // число уникальных символов
        StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String c; // текущий символ в строке
        for (int i=0;i<st.length();i++) { // обход строки
            c = String.valueOf(st.charAt(i)); // получить текущий символ
            if (u.indexOf(c)==-1) // символ еще не встречался
                u.append(c); // добавляем
        }

        return u.length(); // возвращаем длину получившейся строки
    }

    public static void findWord(Stroka stroka) {
        String [] str = stroka.string.split("-");
        String goal = str[0]; // искомое слово
        System.out.println("Массив: ");
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+" "); // выводим очередной элемент
            if ( diffWords(str[i])<diffWords(goal))
                goal = str[i]; // новый мин.эл
        }
        System.out.println("");
        System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));
    }

    public static boolean isPalindrome(Stroka stroka) {
        String [] str = stroka.string.split("-");
        System.out.println(Arrays.toString(str));
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер слова в массиве: ");
        int index = sc.nextInt();
        index -= 1;
        for (int i = 0; i < str.length; i++) {
            if (index > str.length){
                System.out.println("Вышли за предел массива");
               break;
            }
           if (i == index){
               if (str[i].equals((new StringBuilder(String.valueOf(str[i]))).reverse().toString())){
                   return true;
               }
           }

        }
        return false;
    }
}


