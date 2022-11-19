package Lesson_8.task_2;

public class Therapist  {

    double temperature;

    public Therapist(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Therapist{" +
                "temperature=" + temperature +
                '}';
    }
}
