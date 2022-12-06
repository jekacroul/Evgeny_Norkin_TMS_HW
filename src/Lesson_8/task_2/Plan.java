package Lesson_8.task_2;

import java.util.Arrays;

public class Plan {
    Pacient pacient;
    int size = 0;
    int capacity = 3;

    Pacient pacients[] = new Pacient[capacity];
    Dantist dantist = new Dantist(3, 32);
    Surgeon surgeon = new Surgeon(1);
    Therapist therapist = new Therapist(37.6);


    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void savePacient(Pacient pacient) {
        this.pacients[size] = pacient;
        size++;
    }

    public void Plan(Pacient pacient) {
        for (int i = 0; i < this.size; i++) {
            if (pacient.getCode() == 1) {
                System.out.println(pacient + "Вам назначен прием к стоматологу!");
                break;
            }
            if (pacient.getCode() == 2) {
                System.out.println(pacient + "Вам назначен прием к хирургу!");
                break;
            }
            if (pacient.getCode() == 3) {
                System.out.println(pacient + "Вам назначен прием к терапевту!");
                break;
            }

        }

    }
    public void treatmentDantist(Pacient pacient){
        if(dantist.numberOfDiseasedTeeth >= 0){
            System.out.println("Количество здоровых зубов: " + (dantist.teeth - dantist.numberOfDiseasedTeeth));
            System.out.println("Количество больных зубов: " + (dantist.numberOfDiseasedTeeth));
            System.out.println(pacient.getName() + " зубы вылечены ");
        }
    }
    public void treatmentSurgeon(Pacient pacient){
        if (surgeon.NumberOfDiseasedOrgans > 0){
            System.out.println("Количество больных органов: " + surgeon.NumberOfDiseasedOrgans);
            System.out.println("Операция завершена");
        }
    }
    public void treatmentTherapist(Pacient pacient){
        if (therapist.temperature > 36.6){
            System.out.println("Вам прописаны таблетки");
        }
    }

    @Override
    public String toString() {
        return "Plan{" +
                "pacient=" + pacient +
                ", size=" + size +
                ", capacity=" + capacity +
                ", pacients=" + Arrays.toString(pacients) +
                '}';
    }
}
