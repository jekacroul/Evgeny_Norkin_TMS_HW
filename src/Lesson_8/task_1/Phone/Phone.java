package Lesson_8.task_1.Phone;

import Lesson_8.task_1.Contact.Contact;
import java.util.Arrays;
public class Phone {
    String number;
    final String model;
    double weight;
    int cap = 3;
    int size = 0;
    Contact contact[] = new Contact[cap];
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, double weight, String model) {
        this(number, model);
        this.weight = weight;
    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void receiveCall(Contact contact){
        System.out.println("Звонит: " + contact.getContactName() + " номер: " + contact.getContactNumber());
    }
    public void receiveCall(String name, String number){
        for (int i = 0; i < contact.length; i++) {
            if (contact[i].getContactName().toLowerCase().equals(name.toLowerCase()) &&  contact[i].getContactNumber().
                    toLowerCase().equals(number.toLowerCase())){
                System.out.println(contact[i]);
            }
        }
    }
    public void saveContact(Contact contact) {
        this.contact[size] = contact;
        size++;
    }
    public void sendMessage(String message, Contact...contact){
        for (int i = 0; i < contact.length; i++) {
            System.out.println(contact[i].getContactNumber() + " " + message);
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", cap=" + cap +
                ", size=" + size +
                ", contact=" + Arrays.toString(contact) +
                '}';
    }
}
