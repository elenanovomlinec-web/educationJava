package src;
import java.util.Scanner;

public class operand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа через пробел: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int a = scanner.nextInt();

         switch (a) {
             case 1:
                 System.out.println("x+y=" + (x + y)); // почему тут пробелы должны быть???
                 break;
             case 2:
                 System.out.println("x-y=" + (x - y)); // во всех примерах пробелв между числом и командой
                 break;
             case 3:
                 System.out.println("x*y=" + (x * y));
                 break;
             case 4:
                 System.out.println("x/y=" + (x / y));
                 break;
             default:
                 System.out.println("Неизвестная операция");


            }
        }
}
