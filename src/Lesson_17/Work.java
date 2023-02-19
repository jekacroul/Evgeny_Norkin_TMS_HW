package Lesson_17;

import java.util.*;
import java.util.stream.Collectors;

public class Work {
    static Random random = new Random();
    static ArrayList<Integer> randomNumber = new ArrayList<>();
    static ArrayList<String> users = new ArrayList<>();

    public static void arrayCreate(){
        for (int i = 14; i >= 0; --i) {
            randomNumber.add(random.nextInt(20));
        }
        System.out.println("Заполненный массив: " + randomNumber);
    }
    public static void deleteDublicateNumber(){
        List <Integer> deletedNumbers = randomNumber.stream().distinct().collect(Collectors.toList());
        System.out.println("Массив с удаленными дубликатами: " + deletedNumbers);
    }
    public static void evenElements(){
        List <Integer> evenElements = (randomNumber.stream().filter(n-> n % 2==0 && n < 17 && n > 7).collect(Collectors.toList()));
        System.out.println("Массив из четных элементов: " + evenElements);
    }
    public static void elementsMultiply2(){
        List<Integer> multiplaedElements = (randomNumber.stream().map(x -> x*2).collect(Collectors.toList()));
        System.out.println("Массив из чисел умноженных на 2: " + multiplaedElements);
    }
    public static void sortedElements(){
        List<Integer> sortedElements = (randomNumber.stream().sorted().limit(4).collect(Collectors.toList()));
        System.out.println("Первые 4 элемента: " + sortedElements);
    }
    public static void numberOfElements(){
        Long count = ((long) randomNumber.size());
        System.out.println("Количество элементов массива: " + count);
    }
    public static void avgOfNumbers(){
        OptionalDouble avgOfNumbers = randomNumber.stream().mapToInt(n -> n).average();
        System.out.println("Среднее арифметическое: " + avgOfNumbers.getAsDouble());

    }
    public static void usersArrayCreate(){
        users.add("Женя");
        users.add("Никита");
        users.add("Никита");
        users.add("Даша");
        users.add("Паша");
        users.add("Леша");
        users.add("Коля");
        users.add("Вася");
        System.out.println(users);
    }
    public static void usersFind(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя для поиска: ");
        String findName = sc.next();
        if (users.contains(findName)){
            List<String> groupUsers = (users.stream().filter(s -> s.contains(findName)).collect(Collectors.toList()));
            Long countOfUsers = groupUsers.stream().count();
            System.out.println("По введенному имени найдены: " + groupUsers);
            System.out.println("Количество найденных имен: " + countOfUsers);
        }
    }
    public static void usersFindLatterA(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую букву имени: ");
        String inputLatter = sc.next().toLowerCase().toUpperCase();
        List<String>usersFindLatterA = users.stream().filter(s -> s.startsWith(inputLatter)).collect(Collectors.toList());
        System.out.println("По заданной букве найдены: " + usersFindLatterA);
    }
    public static void sortCollection(){
        List<String> sortedCollection = users.stream().sorted().collect(Collectors.toList());
        System.out.println("Отсортированная коллеция: " + sortedCollection);
        System.out.println("Первый элемент коллекции: " + sortedCollection.get(0));

    }
}
