package Lesson_21;
import java.io.*;
import java.util.*;

public class PersonReader {
        static Scanner sc = new Scanner(System.in);
        static List<Person> arr = new ArrayList<>();

        public static void reader() {
            try {
                String filePath = sc.next();
                Reader reader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String i;
                while ((i = bufferedReader.readLine()) != null) {
                    String array[] = i.split(",");
                    Person person = new Person();
                    person.setName(array[0].trim());
                    person.setSoname(array[1].trim());
                    person.setSex(array[2].trim());
                    person.setAge(Integer.valueOf(array[3]));
                    arr.add(person);
                }
                sortPerson();
            } catch (FileNotFoundException ex){
                throw new RuntimeException();
            } catch (IOException ex){
                throw new RuntimeException();
            }
        }

        private static void sortPerson() throws IOException {
            arr.sort(new Compare());
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
            }
            catch (IOException ex){
                throw new RuntimeException();
            }
        }

        public static void count() {
            Long count = arr.stream().filter(Age -> Age.getAge() > 30).count();
            System.out.println("Количество людей с возрастом больше 30:" + count);
            Long countOfMale = arr.stream().filter(Male -> Male.getSex().equals("male")).count();
            System.out.println("Количество мужчин: " + countOfMale);
            Long countOfFamel = arr.stream().filter(Male -> Male.getSex().equals("female")).count();
            System.out.println("Количество женщин: " + countOfFamel);
        }
    }
