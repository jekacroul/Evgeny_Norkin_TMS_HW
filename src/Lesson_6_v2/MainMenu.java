package Lesson_6_v2;

import java.util.Scanner;

public class MainMenu {
    public static void mainMenu(User user, User[] users, Integer [] nominal) {
        Scanner scanner = new Scanner(System.in);
        Boolean work = true;
        while (work) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1. Посмотреть баланс.");
            System.out.println("2. Пополнить баланс.");
            System.out.println("3. Снять деньги.");
            System.out.println("4. Перевод денег с карты на карту");
            System.out.println("5. Выход");
            Integer choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Баланс вашего лицевого счёта: " + user.getPersonalAccount().getBalance());
                    break;
                case 2:
                    System.out.println("Введите сумму пополнения: ");
                    Double money = scanner.nextDouble();
                    System.out.println();
                    BankOperations.addMoney(money, user, nominal);
                    System.out.println();
                        break;
                case 3:
                    System.out.println("Введите сумму которую хотите снять: ");
                    Double money2 = scanner.nextDouble();
                    System.out.println();
                    BankOperations.getMoney(money2, user);
                    break;
                case 4:
                    System.out.println("Введите номер карты на которую хотите перевести: ");
                    String setCard = scanner.next();
                    System.out.println("Введите сумму которою хотите перевести: ");
                    Double setSumm = scanner.nextDouble();
                    System.out.println();
                    BankOperations.transmitMoneyFromCardToCard(setSumm, user, users, setCard);
                    break;
                case 5:
                    work = false;
                    break;
            }
        }
    }
}
