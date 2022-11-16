package Lesson_6_2;

public class HDD {
    private Double storage;
    private String name;
    private Boolean buildIn;

    public HDD(Double storage, String name, Boolean buildIn) {
        this.storage = storage;
        this.name = name;
        this.buildIn = buildIn;
    }

    public Double getStorage() {
        return storage;
    }

    public void setStorage(Double storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBuildIn() {
        return buildIn;
    }

    public void setBuildIn(Boolean buildIn) {
        this.buildIn = buildIn;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "storage=" + storage +
                ", name='" + name + '\'' +
                ", buildIn=" + buildIn +
                '}';
    }
}
