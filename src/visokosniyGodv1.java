// это не работает как надо, но ты все равно посмотри, я че зря потратила 2 часа жизни?!
package src;
import java.util.Scanner;

public class visokosniyGodv1 {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        Scanner scanner = new Scanner(System.in);
        double god = scanner.nextDouble(); // прочитали что ввели
        if ((god % 4) == 0) {
            System.out.println("Этот год высокосный");
        } else if ((god % 100) == 0) {System.out.println("Этот год yt высокосный");
             } else if ((god % 400)==0) {
            System.out.println("Этот год высокосный");
        } else { System.out.println("Этот год не высокосный");
        };

        }
}

// Гоше тринадцому на месте не сиделось, а у меня не выслияется нормально ниче!
// ууууу сска
