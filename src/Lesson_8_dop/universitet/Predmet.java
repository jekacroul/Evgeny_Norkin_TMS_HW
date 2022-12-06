package Lesson_8_dop.universitet;

public class Predmet {
    String name;
    Integer id;

    public Predmet(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
