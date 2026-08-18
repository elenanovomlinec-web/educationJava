import java.util.Scanner;

public class twoKomand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "print" -> {                   // если принт, то печатай
                System.out.print("Введите строку для печати: ");
                String text = scanner.nextLine();
                System.out.println(text);
            }
            case "sum" -> {                // если sum, то складывай
                try {
                    System.out.print("Введите первое число: ");
                    double num1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Введите второе число: ");
                    double num2 = Double.parseDouble(scanner.nextLine());

                    System.out.println("Сумма: " + (num1 + num2));
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите корректное число");
                }
            }
            default -> System.out.println("Неизвестная команда");  // иначе выведи
        }
    }
}