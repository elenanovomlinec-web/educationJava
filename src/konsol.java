package src;

import java.util.Scanner;

public class konsol {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: "); // вывели на экран приглашение
            double a = scanner.nextDouble(); // прочитали что ввели
            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();
            System.out.println("a - b = " + (a - b));
        }
    }

