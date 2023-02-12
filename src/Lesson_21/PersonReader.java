package Lesson_21;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class PersonReader {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<String> arr = new ArrayList<>();

        public static void reader() {
            try {
                String filePath = sc.next();
                Reader reader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String i;
                while ((i = bufferedReader.readLine()) != null) {
                    System.out.print(i + "\n");
                    arr.add(i);
                }
                sortPerson();
            } catch (FileNotFoundException ex){
                throw new RuntimeException();
            } catch (IOException ex){
                throw new RuntimeException();
            }
        }

        private static void sortPerson() throws IOException {
            arr.sort((str1, str2) -> str1.compareTo(str2));
            writeSortedPerson();

        }

        private static void writeSortedPerson() {
            try {
                Writer writer = new FileWriter("Person");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                for (int i = 0; i < arr.size(); i++) {
                    bufferedWriter.write(arr.get(i) + "\n");
                }
                bufferedWriter.close();
            } catch (IOException ex){
                throw new RuntimeException();
            }
        }

        public static void count() {
            Long count = arr.stream().filter(Age -> Integer.parseInt(Age.split(",")[3]) > 30).count();
            System.out.println("Количество людей с возрастом больше 30:" + count);
            Long countOfMale = arr.stream().filter(Male -> Male.split(",")[2].equals("male")).count();
            System.out.println("Количество мужчин: " + countOfMale);
            Long countOfFamel = arr.stream().filter(Male -> Male.split(",")[2].equals("female")).count();
            System.out.println("Количество женщин: " + countOfFamel);
        }
    }
