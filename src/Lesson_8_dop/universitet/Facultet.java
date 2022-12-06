package Lesson_8_dop.universitet;

import java.util.Arrays;

public class Facultet {
    String name;
    Prepod [] prepods;
    Predmet [] predmets;
    int id;

    public Facultet(String name, Prepod[] prepods, Predmet[] predmets, int id) {
        this.name = name;
        this.prepods = prepods;
        this.predmets = predmets;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prepod[] getPrepods() {
        return prepods;
    }

    public void setPrepods(Prepod[] prepods) {
        this.prepods = prepods;
    }

    public Predmet[] getPredmets() {
        return predmets;
    }

    public void setPredmets(Predmet[] predmets) {
        this.predmets = predmets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Facultet{" +
                "name='" + name + '\'' +
                ", prepods=" + Arrays.toString(prepods) +
                ", predmets=" + Arrays.toString(predmets) +
                ", id=" + id +
                '}';
    }
}
