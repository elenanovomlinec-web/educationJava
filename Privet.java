import java.util.Scanner;

public class Privet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String imya = scanner.nextLine(); // Ошибка 3: Имя — это текст (String)
        System.out.print("Привет, " + imya);
    }
}