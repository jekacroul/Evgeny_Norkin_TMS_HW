package Lesson_10;

/*
1. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа). Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры. - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.

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

public class Main {
    public static void main(String[] args) {

        Stroka stroka = new Stroka("14H8-ABBC-7896-MJF-584F");

//        Work.split(stroka);
//        System.out.println();
//        Work.charToDisplay(stroka);
//        System.out.println();
//        Work.charsToLowerCase(stroka);
//        System.out.println();
//        Work.charsToUpperCase(stroka);
//        System.out.println();
        try {
            System.out.println("Результат поиска последовательности ABC: " + Work.findCharsABC(stroka));
        } catch (AbcContainsExeption e) {
            System.out.println(e);
        }
        try {
            System.out.println("Результат проверки начала документа на последовательность 555: " + Work.checkFirstBlock(stroka));
        } catch (Contains555Exeption ex){
            System.out.println(ex);
        }
       try {
           System.out.println("Результат проверки конца документа на последовательность 1a2b: " + Work.checkEndBlock(stroka));
       } catch (Contains1a2bExeption ex){
           System.out.println(ex);
       }
//
//        System.out.println();
//        Work.charsDouble(stroka);
//        System.out.println();
//        Work.findMinLenght(stroka);
//        System.out.println();
//        Work.findMaxLenght(stroka);
//        System.out.println();
//        Work.findWord(stroka);
//        System.out.println();
//        System.out.println(Work.isPalindrome(stroka));
    }
}
