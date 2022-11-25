package Lesson_8_dop.universitet;

import java.util.Arrays;

public class Prepod {
    String name;
    String lastName;
    Predmet [] predmets;
    Facultet [] facultets;
    Integer id;

    public Prepod(String name, String lastName, Predmet[] predmets, Facultet[] facultets, Integer id) {
        this.name = name;
        this.lastName = lastName;
        this.predmets = predmets;
        this.facultets = facultets;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Predmet[] getPredmets() {
        return predmets;
    }

    public void setPredmets(Predmet[] predmets) {
        this.predmets = predmets;
    }

    public Facultet[] getFacultets() {
        return facultets;
    }

    public void setFacultets(Facultet[] facultets) {
        this.facultets = facultets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String[] showPrepods(Facultet [] facultets){
        String[] nameFakult = new String[facultets.length];
        for (int i = 0, b = 0; i < getFacultets().length; i++ , b++) {
            nameFakult[i] = facultets[b].getName();
        }
        return nameFakult;
    }
    @Override
    public String toString() {
        return "Prepod{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", predmets=" + Arrays.toString(predmets) +
                ", facultets=" + Arrays.toString(showPrepods(facultets)) +
                ", id=" + id +
                '}';
    }
}
