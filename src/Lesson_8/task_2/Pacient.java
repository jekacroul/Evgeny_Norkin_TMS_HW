package Lesson_8.task_2;

public class Pacient {


    private String name;
    private String disease;
    int code;


    public Pacient(String name, String disease, int code) {
        this.name = name;
        this.disease = disease;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", disease='" + disease + '\'' +
                '}';
    }
}
