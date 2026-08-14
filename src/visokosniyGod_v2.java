package src;
// а это работает
import java.util.Scanner;

public class visokosniyGod_v2 {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        double god = scanner.nextDouble(); // прочитали что ввели
        if ((god % 400) == 0) {
            System.out.println("Этот год высокосный");
        } else if ((god % 100) == 0) {System.out.println("Этот год не высокосный");
        } else if ((god % 4)==0) {
            System.out.println("Этот год высокосный");
        } else { System.out.println("Этот год не высокосный");
        };
}}
