package Lesson_10_dop;

/*
2. Создать класс, в котором будет статический метод.
(почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
Этот метод принимает на вход три параметра:
Login,
Password,
confirmPassword.
Все поля имеют тип данных String.
Длина login должна быть меньше 20 символов и не должен содержать пробелы.
Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами
– один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
Метод возвращает true, если значения верны или false в другом случае.
 */
public class Authorization {
    public static boolean userLoginCheck(Credits credits) throws WrongLoginException{
        if (credits.login.length() > 20 || credits.login.contains(" ")){
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелы");
        }
        return true;
    }
    public static boolean userPasswordCheck(Credits credits) throws WrongPasswordException{
        boolean isDigitHave = false;
        for (int i = 0; i < credits.password.length(); i++) {
            if (Character.isDigit(credits.password.charAt(i))){
                isDigitHave = true;
            }
        }
        if (credits.password.length() > 20 || credits.password.contains(" ") || !credits.password.equals(credits.confirmPassword) || !isDigitHave){
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.\n" +
                    "Также password и confirmPassword должны быть равны.");
        }
        return true;
    }
}
