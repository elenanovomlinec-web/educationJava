package src;

import java.util.Scanner;

public class vozrast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: "); // вывели на экран приглашение
        double age = scanner.nextDouble();
       if (age<1) {                                     // определяем корректность кода
           System.out.println("Вы слишком малы");
            }
       else if (age > 112) {
           System.out.println("Вы слишком стары");
            }
   double last_two = (age%100); // берем последние 2 цифры
   double last_digit = (age%10);  // берем последнюю цифру
    if ((last_two>11) && (last_two<14)) {
        System.out.print("Вам " + age + " лет");
    }
    else if (last_digit==1) {
        System.out.println("Вам" + age + " год");
    }
    else if ((last_digit>2) && (last_digit<4)) {
        System.out.println("Вам" + age + " года");
    }
    else {
        System.out.println("Вам" + age + " лет");
    }
}}
