package src;

import java.util.Scanner;

public class logikaCeloe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: "); // вывели на экран приглашение
        double x = scanner.nextDouble();
        if (x > 0) {
            System.out.println("Данное число положительное");
        } else if (x == 0) {
            System.out.println("Это ноль, он ");
        } else if (x < 0) {
            System.out.println("Число меньше нуля");
        }
        if ((x%2)==0) {System.out.println("Данное число четное");
        } else if ((x%2)!=0) {System.out.println("Данное число не четное"); // остаток от деления на 2 ноль
        }
        if ((x%5)==0) {System.out.println("Данное число кратно 5");  // остаток от деления на 5
        } else if ((x%5)!=0) {System.out.println("Данное число не кратно 5");
        }
    }
}
