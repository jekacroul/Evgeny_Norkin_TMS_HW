package Lesson_6_2;

public class Ram {
    private String name;
    private Integer memorySize;

    public Ram(String name, Integer memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
