package src;

import java.util.Scanner;

public class maxTernar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: "); // вывели на экран приглашение
        int a = scanner.nextInt(); // прочитали что ввели
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int max = (a > b) ? a : b;
        System.out.print("max = " + max);

    }
}
