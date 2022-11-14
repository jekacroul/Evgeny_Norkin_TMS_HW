package Lesson_6_2;

public class Computer {
    private String model;
    private Double cost;
    private Ram ram;
    private HDD hdd;
    MainMenu mainMenu;

    public Computer(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public Computer(String model, double cost, Ram ram, HDD hdd) {
        this.model = model;
        this.cost = cost;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public String toString() {
        if (ram == null) {
            return "Computer{" +
                    "model='" + model + '\'' +
                    ", cost=" + cost +
                    '}';
        } else {
            return "Computer{" +
                    "model='" + model + '\'' +
                    ", cost=" + cost +
                    ", " + ram +
                    ", " + hdd +
                    '}';
        }
    }
}

