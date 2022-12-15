package Lesson_13;

import java.io.*;
import java.util.ArrayList;


/*
Основное задание
1. Вернемся к домашнему заданию занятия номер 12 и модифицируем его.
Программа должна получать имена файлов с номерами документов с
консоли: каждая новая строка - это путь к файлу и имя файла.
Для завершения ввода списка файлов следует ввести 0.
После получения списка документов программа должна обработать
каждый документ: вычитать из файла номера документов и
провалидировать их.
В конце работы создать один файл отчет с выходной информаций: номер
документа - комментарий(валиден или не валиден и по какой причине).
Пусть каждый файл содержит каждый номер документа с новой строки и
в строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая
последовательность букв/цифр) или kontract(далее любая
последовательность букв/цифр).
Учесть, что номера документов могут повторяться в пределах одного
файла и так же разные документы могут содержать одни и те же номера
документов.
Если номера документов повторяются, то повторные номера документов
не проверять, не валидировать.
Немного технических деталей
1) Считать с консоли список документов: раз список - то это коллекции
типа List, никаких других условий нет - значит все имена файлов с
консоли сохраняем в структуру данных ArrayList.
2) Номера документов могут повторяться, но повторные документы
обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты
нам не нужны - значит, надо считать номера документов из файлов и все
номера документов сохранять в коллекцию типа Set. Других условий нет,
значит можно использовать HashSet.
3) В конце должна быть структура номер документа - комментарий - т.е.
эта структура типа ключ-значений,значит это коллекция типа Map.
Других условий нет - значит, можно использовать HashMap. Создать
такую структуру и уже потом сделать цикл по этой структуре и записать
всю информацию из этой мапы в файл-отчет.

TeachMeSkills.by

Дополнительное задание
2. Представим, что в Java нет коллекции типа ArrayList.
Создать свой класс, симулирующий работу класса динамической
коллекции - т.е. создать свою кастомную коллекцию.
В основе коллекции будет массив.
Кастомная коллекция должна хранить элементы разных классов(т.е. это
generic).
Предусмотреть операции добавления элемента, удаления элемента,
получение элемента по индексу, проверка есть ли элемент в коллекции,
метод очистки все коллекции.
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию.
Предусмотреть конструктор с задаваемым размером внутреннего
массива.
Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена.
 */
public class Documents {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static final String DOCNUM = "docnum";
    private static String invalidDescription;
    public static final String CONTRACT = "contract";
    private static ArrayList<String> validNumbers = new ArrayList<>();
    private static ArrayList<String> invalidNumbers = new ArrayList<>();
    private static File validFile;
    private static File invalidFile;

    public static void fileCreate() throws IOException {
        System.out.println("Введите имя и путь для создаваемого файла.");
        String input = bufferedReader.readLine();
        File file = new File(input);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private static void fileRead() throws IOException {
        while (true) {
            String fileInput = bufferedReader.readLine();
            System.out.println("Чтение идет до тех пор, пока не будет введена цифра 0!");
            if (fileInput.contains("0")) {
                break;
            } else {
                BufferedReader br = new BufferedReader(new FileReader(fileInput));
                String fileNumber;
                while ((fileNumber = br.readLine()) != null) {
                    System.out.print(fileNumber + "\n");
                    try {
                        numberCheck(fileNumber);
                    } catch (DocumentInvalidException e) {
                        System.err.println(e.getMessage());
                    }
                }
            }
            reportValidCreate(validNumbers);
            reportInvalidCreate(invalidNumbers);
        }
    }
    private static void reportValidCreate(ArrayList<String> validNumbers) throws IOException{
        validFile = new File("VALID_REPORT_FILE");
        if (!validFile.exists()) {
            validFile.createNewFile();
        }
        Writer writer = new FileWriter(validFile);
        try (writer) {
            writer.write(validFile.getName() + "\n");
            for (String validNumber : validNumbers) {
                writer.write("\n\t" + validNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
    private static void reportInvalidCreate(ArrayList<String> invalidNumbers) throws IOException{
        invalidFile = new File("INVALID_REPORT_FILE");
        if (!invalidFile.exists()) {
            invalidFile.createNewFile();
        }
        Writer writer = new FileWriter(invalidFile);
        try (writer) {
            writer.write(invalidFile.getName() + "\n");
            for (String invalidNumber : invalidNumbers) {
                writer.write("\n\t" + invalidNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
    public static void numberCheck(String documentNumber) throws DocumentInvalidException{
        if (documentNumber.length() == 15) {
            if (documentNumber.startsWith(DOCNUM) || documentNumber.startsWith(CONTRACT)) {
                validNumbers.add(documentNumber);
            } else {
                invalidDescription = WrongStartCombinationException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new Lesson_13.WrongStartCombinationException(DocumentInvalidException.INVALID + documentNumber);
            }
        } else {
            if (documentNumber.startsWith(DOCNUM) || documentNumber.startsWith(CONTRACT)) {
                invalidDescription = WrongDocumentLengthException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new Lesson_13.WrongDocumentLengthException(DocumentInvalidException.INVALID + documentNumber);
            } else {
                invalidDescription = WrongDocumentLengthException.DESCRIPTION +
                        WrongStartCombinationException.DESCRIPTION;
                documentNumber = documentNumber + invalidDescription;
                invalidNumbers.add(documentNumber);
                throw new DocumentInvalidException(DocumentInvalidException.INVALID + documentNumber);
            }
        }
    }
    public static void showDocument() {
        try {
            fileRead();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readValidDoc() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("VALID_REPORT_FILE"));
        String fileNumber;
        while ((fileNumber = br.readLine()) != null) {
            System.out.print(fileNumber + "\n");
        }
    }
    public static void readInvalidDoc() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("INVALID_REPORT_FILE"));
        String fileNumber;
        while ((fileNumber = br.readLine()) != null) {
            System.out.print(fileNumber + "\n");
        }
    }
}
