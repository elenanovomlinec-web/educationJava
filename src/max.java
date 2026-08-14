package src;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: "); // вывели на экран приглашение
        double a = scanner.nextDouble(); // прочитали что ввели
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        if (a > b) {
            System.out.printf("%f больше %f", a, b);
        } else if (a < b) {
            System.out.printf("%f10" +
                    " меньше %f", a, b);
        } else if (a == b) {
            System.out.printf("Вы ввели одинаковые числа");
        }
    }}
