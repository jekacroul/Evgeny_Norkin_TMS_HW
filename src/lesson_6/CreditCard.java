package lesson_6;

import java.util.Scanner;
public class CreditCard {
    String sch = "BY548613858A48";
    int pass = 1234;
    double summ = 0;
    boolean exit = false;
    public CreditCard() {
        Vhod();
       while (!exit){
           Popolnenie();
       }
    }
    public void Popolnenie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите необходимую операцию: 0 - снять, 1 - пополнить, 2 - баланс, 3- закрыть программу");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.print("Введите сумму для пополнения карты: ");
            double in = sc.nextDouble();
            if (in >= 0) {
                summ = summ + in;
                System.out.println("Текущий баланс: " + summ);
            }
            while (true) {
                System.out.println("Требуется пополнить еще раз? 0 - да, 1 - нет");
                int vopros = sc.nextInt();
                if (vopros == 0) {
                    System.out.print("Введите сумму для пополнения карты: ");
                    in = sc.nextDouble();
                    summ = summ + in;
                    System.out.println("Текущий баланс: " + summ);
                    continue;
                }
                if (vopros == 1) {
                    System.out.println("Пополнение окончено");
                    return;
                }
            }
        } if (choose == 2){
            Balance();
        }
        if (choose == 3){
            exit = true;
            return;
        }
        if (choose == 0) {
            while (true) {
                if (summ == 0) {
                    System.out.print("На балансе отсутствуют средства, пополните баланс");
                    System.out.println();
                    return;
                }
                if (summ > 0) {
                    System.out.print("Введите сумму для снятия: ");
                    double out = sc.nextDouble();
                    summ = summ - out;
                    System.out.println("Текущий баланс: " + summ);
                    break;
                }
            }
        }
    }
    public int Vhod(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите пароль для входа: ");
            int pin = sc.nextInt();
            if (pass == pin){
                System.out.println("Вход выполнен");
                break;
            }
            System.out.println("Повторите попытку ввода");
        }
        return pass;
    }
   public void Balance() {
       System.out.println(toString());
   }
   @Override
  public String toString(){
       return "Номер счёта: " + sch + "\nСумма на счету: " + summ;
    }
}




