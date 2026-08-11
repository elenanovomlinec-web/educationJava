import java.util.Scanner;

public class arifmetika2 {
    public static void main(String[] args) {
        double x = 3 - (56.0 - 12) / 44 * 4 / 2;
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    public static class Privet {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Как вас зовут? ");
            String imya = scanner.nextLine(); // Ошибка 3: Имя — это текст (String)
            System.out.print("Привет, " + imya);
        }
    }
}