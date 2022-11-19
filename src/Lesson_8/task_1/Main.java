package Lesson_8.task_1;

/*
Создайте класс Phone, который содержит переменные number, final model и weight, массив контактов.
создать класс Contact с полями имя контакта, номер контакта.
поля приватные.
Создайте три экземпляра этого класса.
Добавить конструктор в класс Phone, который принимает на вход три параметра для
    инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации
    переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавить в класс Phone методы:
    receiveCall, имеет один параметр – объект контакта. Выводит на консоль сообщение “Звонит {name} + {номер телефона}”.
    getNumber – возвращает номер телефона.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего
    и номер телефона звонящего. Вернуть объект типа контакт найденный в массиве контаков по имени и номеру.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход контакты и сообщение,
которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов и само сообщение.
 */

import Lesson_8.task_1.Contact.Contact;
import Lesson_8.task_1.Phone.Phone;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact("Евгений","+375291325648" );
        Contact contact1 = new Contact("Антон","+375294355648" );
        Contact contact2 = new Contact("Леша","+375291345648" );

        Phone phone = new Phone("132", 320, "Iphone XS");

        phone.receiveCall(contact1);
        System.out.println(phone.getNumber() + " " + phone.getModel());
        phone.saveContact(contact);
        phone.saveContact(contact1);
        phone.saveContact(contact2);
        phone.sendMessage("Hello world!", contact, contact1, contact2);
        phone.receiveCall("Евгений", "+375291325648");
    }
}
