//package Lesson_16;
//
///*
//Написать программу для парсинга xml документа.
//Программа на вход получает строку к папке, где находится документ.
//Распарсить нужно только один документа - соответственно,
//предусмотреть различные проверки, например на то, что в папке нет
//файлов, или в папке несколько документов формата xml и другие
//возможные проверки.
//Необходимо распарсить xml документ и содержимое тегов line записать в
//другой документ.
//Название файла для записи должно состоять из значений тегов и имеет
//вид: <firstName>_<lastName>_<title>.txt
//
//Задание со *
//Дополнительно реализовать следующий функционал:
//если с консоли введено значение 1 - распарсить документ с помощью
//SAX
//если с консоли введено значение 2 - распарсить документ с помощью
//DOM.
// */
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.ArrayList;
//import java.util.Scanner;
//import javax.xml.bind.JAXBException;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import org.w3c.dom.Document;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import org.xml.sax.Attributes;
//import org.xml.sax.helpers.DefaultHandler;
//
//public class XMLreader {
//
//    public static void reader() throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите путь к файлу или имя файла: ");
//        String choose = sc.next();
//        Reader reader = new FileReader(choose);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String i;
//        while ((i = bufferedReader.readLine()) != null) {
//            System.out.println(i);
//        }
//        chooseParsingType();
//    }
//
//    public static void domParsing() {
//        try {
//            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            Document document = documentBuilder.parse("XML.tld");
//            Node root = document.getDocumentElement();
//            System.out.println();
//            NodeList xml = root.getChildNodes();
//            for (int i = 0; i < xml.getLength(); i++) {
//                Node book = xml.item(i);
//                if (book.getNodeType() != Node.TEXT_NODE) {
//                    NodeList bookProps = book.getChildNodes();
//                    for (int j = 0; j < bookProps.getLength(); j++) {
//                        Node bookProp = bookProps.item(j);
//                        if (bookProp.getNodeType() != Node.TEXT_NODE) {
//                            System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
//                        }
//                    }
//                    System.out.println("===========>>>>");
//                }
//            }
//
//        } catch (ParserConfigurationException ex) {
//            ex.printStackTrace(System.out);
//        } catch (SAXException ex) {
//            ex.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        }
//    }
//
//    public static void saxParsing() {
//
//        final String fileName = "XML.tld";
//        try {
//            SAXParserFactory factory = SAXParserFactory.newInstance();
//            SAXParser saxParser = factory.newSAXParser();
//            DefaultHandler handler = new DefaultHandler() {
//                boolean name = false;
//
//                @Override
//                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                    if (qName.equalsIgnoreCase("lastName")) {
//                        if (qName.equalsIgnoreCase("firstName")) {
//                            if (qName.equalsIgnoreCase("nationality")) {
//                                if (qName.equalsIgnoreCase("yearOfBirth")) {
//                                    if (qName.equalsIgnoreCase("yearOfDeath")) {
//                                        if (qName.equalsIgnoreCase("line")) {
//
//                                        }
//                                    }
//                                }
//                            }
//
//                        }
//                    }
//                    name = true;
//                }
//
//                @Override
//                public void characters(char ch[], int start, int length) throws SAXException {
//                    if (name) {
//                        System.out.println(new String(ch, start, length));
//                        name = false;
//                    }
//                }
//            };
//
//            saxParser.parse(fileName, handler);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void chooseParsingType() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Если с консоли введено значение 1 - распарсить документ с помощью\n" +
//                "SAX\n" +
//                "Если с консоли введено значение 2 - распарсить документ с помощью\n" +
//                "DOM.");
//        int choose = scanner.nextInt();
//        if (choose == 1) {
//            saxParsing();
//        } else {
//            domParsing();
//        }
//    }
//}
//
