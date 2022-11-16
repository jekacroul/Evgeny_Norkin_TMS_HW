package Lesson_6_v2;

public class Work {
    public static void Start() {
        PersonalAccount personalAccount = new PersonalAccount("BY4545657", 500d);
        PersonalAccount personalAccount1 = new PersonalAccount("BY234242", 100d);
        PersonalAccount personalAccount2 = new PersonalAccount("BY234354242", 100d);
        CreditCard creditCard = new CreditCard(personalAccount, "412543", 1234);
        CreditCard creditCard1 = new CreditCard(personalAccount1, "123234", 1245);
        CreditCard creditCard2 = new CreditCard(personalAccount2, "1235234", 1246);

        User user = new User("Евгений", "Норкин", "MP123153", 500d, creditCard, personalAccount);
        User user1 = new User("Мария", "Прокопьева", "MP12312345", 500d, creditCard1, personalAccount1);
        User user2 = new User("Владислав", "Ксеневич", "MP12312345", 500d, creditCard2, personalAccount2);

        Integer nominal[] = new Integer[5];
        nominal[0] = 5;
        nominal[1] = 10;
        nominal[2] = 20;
        nominal[3] = 50;
        nominal[4] = 100;

        User users[] = new User[3];
        users[0] =  user;
        users[1] = user1;
        users[2] = user2;

        boolean contin = true;
        while (contin){
            User user3 = Verefication.enterPin(users);
            MainMenu.mainMenu(user3, users, nominal);
            contin = Verefication.reLogin();
        }
    }

}
