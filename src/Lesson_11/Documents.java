package Lesson_11;

import java.io.*;
import java.util.Scanner;

public class Documents {
    static Scanner scanner = new Scanner(System.in);
    public static void fileCreate() throws IOException {
        File file1 = new File("NotValid.txt");
        if (!file1.exists()){
            file1.createNewFile();
        }
        System.out.println("Введите имя и путь для создаваемого файла.");
        String create = scanner.next();
        File file = new File(create);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

public static void writeInformationIntoFile() throws IOException {
    System.out.println("Выберите файл в который нужно записать информацию:");
    String choose = scanner.next();
    Writer writer = new FileWriter(choose, true);
    Writer writer1 = new FileWriter("NotValid.txt", true);
    BufferedWriter bufferedWriter = new BufferedWriter(writer);
    System.out.println("Введите информацию для записания в файл:");
    String userWrite = scanner.next();
    if (userWrite.length() == 15 || userWrite.startsWith("docnum") && userWrite.startsWith("contract")) {
            bufferedWriter.append(userWrite).append("\n");
            bufferedWriter.close();
        } else {
            System.out.println("Ошибка, информация будет записана в файл 'NotValid.txt'.");
            if (userWrite.length() != 15){
            writer1.append(userWrite).append("- длинна не равна 15 символам" + "\n");
            } if (!userWrite.startsWith("docnum")){
            writer1.append(userWrite).append("- документ не начинается с последовательности 'docnum'" + "\n");
            } if (!userWrite.startsWith("contract")){
            writer1.append(userWrite).append("- документ не начинается с последовательности 'contract'" + "\n");
        }
        writer1.close();
    }
}

    public static void fileRead() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();
        Reader reader = new FileReader(choose);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String i;
        while ((i = bufferedReader.readLine()) != null){
            System.out.print(i + "\n");
        }
    }
}
