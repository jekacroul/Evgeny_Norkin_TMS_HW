package Lesson_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
Создать программу для чтения номеров контрактов из файла.
Неповторяющиеся номера следует сохранить в структуру данных ключ-значение, где ключ это номер контракта, а значение -
это обьект класс Document со всей информацией. Структуру данных ключ значение вывести на экран. Использовать Set и Map.
 */
public class Main {
    public static void main(String[] args) {

        Map<String, Document> contract = new HashMap<>();
        Set<String> invalidContract = new HashSet<>();

        try {
            Scanner scanner = new Scanner(new File("Documents"));

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] infDocument = line.split(",");
                String number = infDocument[0].trim();

                if (!invalidContract.contains(number)){
                    invalidContract.add(number);

                    Document document = new Document();

                    document.setDocNum(Integer.valueOf(infDocument[0].trim()));
                    document.setDocName(infDocument[1].trim());
                    document.setDateCreate(infDocument[2].trim());

                    contract.put(number, document);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<String, Document> entry : contract.entrySet()) {
            System.out.println("Номер контракта: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
