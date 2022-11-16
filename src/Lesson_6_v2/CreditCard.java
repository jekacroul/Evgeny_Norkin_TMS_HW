package Lesson_6_v2;

public class CreditCard {
    private PersonalAccount personalAccount;
    private String cardNumber;
    private Integer pinCode;
    public CreditCard(PersonalAccount personalAccount, String cardNumber, Integer pinCode) {
        this.personalAccount = personalAccount;
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public PersonalAccount getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(PersonalAccount personalAccount) {
        this.personalAccount = personalAccount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "personalAccount=" + personalAccount +
                ", cardNumber='" + cardNumber + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
