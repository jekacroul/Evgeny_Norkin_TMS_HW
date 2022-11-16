package Lesson_6_v2;

import java.util.Scanner;

public class Verefication {

    public static boolean reLogin(){
        System.out.println("Хотите продолжить работу или выйти? 0 - нет, 1 - да");
        Scanner sc = new Scanner(System.in);
        int yes = sc.nextInt();
        if (yes == 1){
        return true;
        } else if(yes == 0){
            return false;
        }
       return true;
    }
    public static User isCorrectPin(Integer pinCode, User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getCreditCard().getPinCode().equals(pinCode)) {
                return users[i];
            }
        }
        return null;
    }
    public static User enterPin(User[] users) {
        boolean reLoadLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (reLoadLogin) {
            System.out.print("Введите пин код: ");
            int in = scanner.nextInt();
            User user = isCorrectPin(in, users);
            if (user == null) {
                System.out.println("Пользователь не найден");
            } else {
                System.out.println("Добро пожаловать! " + user.getName());
                reLoadLogin = false;
                return user;
            }
        }
        return null;
    }
}



