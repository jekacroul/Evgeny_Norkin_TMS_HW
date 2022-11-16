package Lesson_6_v2;

public class BankOperations {
    public static void addMoney(double moneyCount, User user, Integer[] nominal) {

        if (user.getMoneyInThePocket() < moneyCount) {
            System.out.println("Недостаточно денег для пополнения");
        }
        if (user.getMoneyInThePocket() >= moneyCount && checkMoneyNominal(nominal, moneyCount)) {
            user.getCreditCard().getPersonalAccount().setBalance(user.getCreditCard().getPersonalAccount().getBalance()
                    + moneyCount);
            System.out.println("Баланс пополнен на " + moneyCount);
            System.out.println("Текущий баланс: " + user.getCreditCard().getPersonalAccount().getBalance());
            user.setMoneyInThePocket(user.getMoneyInThePocket() - moneyCount);
        }
    }

    public static void getMoney(double moneyCount, User user) {
        if (user.getCreditCard().getPersonalAccount().getBalance() < moneyCount) {
            System.out.println("На балансе недостаточно средств для снятия");
        }

        if (user.getCreditCard().getPersonalAccount().getBalance() >= moneyCount) {
            user.getCreditCard().getPersonalAccount().setBalance(user.getCreditCard().getPersonalAccount().getBalance()
                    - moneyCount);
            user.setMoneyInThePocket(user.getMoneyInThePocket() + moneyCount);
            System.out.println("Сумма" + " " + moneyCount + " " + "снята с карты");
        }
    }

    public static void transmitMoneyFromCardToCard(double moneyCount, User transmitter, User[] users, String cardNumber) {
        if (transmitter.getCreditCard().getPersonalAccount().getBalance() < moneyCount) {
            System.out.println("Не достаточно денег для перевода");
        } else {
            for (int i = 0; i < users.length; i++) {
                if (users[i].getCreditCard().getCardNumber().trim().equals(cardNumber.trim())) {
                    transmitter.getCreditCard().getPersonalAccount().setBalance(transmitter.getCreditCard()
                            .getPersonalAccount().getBalance() - moneyCount);
                    users[i].getCreditCard().getPersonalAccount().setBalance(users[i].getCreditCard()
                            .getPersonalAccount().getBalance() + moneyCount);
                    System.out.println("OK");
                    System.out.println(users[i].getPersonalAccount().getBalance());
                }
            }
        }
    }

    public static Boolean checkMoneyNominal(Integer[] nominal, double moneyCount) {
        for (int i = 0; i < nominal.length; i++) {
            if (nominal[i] == moneyCount) {
                System.out.println("Купюра подходит");
                return true;
        }
            if(i == nominal.length - 1 && nominal[i] != moneyCount) {
                System.out.println("Номинал не найден");
                return false;
            }
        }
        return false;
    }
}


