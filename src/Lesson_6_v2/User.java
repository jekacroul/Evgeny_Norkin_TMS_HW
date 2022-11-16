package Lesson_6_v2;

public class User {
    private String name;
    private String lastName;
    private String passportNumber;
    private Double moneyInThePocket;
    private CreditCard creditCard;
    private PersonalAccount personalAccount;

    public User(String name, String lastName, String passportNumber, Double moneyInThePocket, CreditCard creditCard, PersonalAccount personalAccount) {
        this.name = name;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.moneyInThePocket = moneyInThePocket;
        this.creditCard = creditCard;
        this.personalAccount = personalAccount;
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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Double getMoneyInThePocket() {
        return moneyInThePocket;
    }

    public void setMoneyInThePocket(Double moneyInThePocket) {
        this.moneyInThePocket = moneyInThePocket;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(PersonalAccount personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", moneyInThePocket=" + moneyInThePocket +
                ", creditCard=" + creditCard +
                ", personalAccount=" + personalAccount +
                '}';
    }
}
