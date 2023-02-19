package Lesson_21;

public class Person {
    private String Name;
    private String Soname;
    private String Sex;
    private Integer Age;

    public Person(String name, String soname, String sex, Integer age) {
        Name = name;
        Soname = soname;
        Sex = sex;
        Age = age;
    }

    public Person() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSoname() {
        return Soname;
    }

    public void setSoname(String soname) {
        Soname = soname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String toString() {
        return
                "Name='" + Name + '\'' +
                ", Soname='" + Soname + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Age=" + Age;
    }
}
