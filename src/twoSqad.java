import java.util.Scanner;

public class twoSqad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {  //первыый прибавляем, второй вычитаем и тд
            int square = i * i;

            if (i % 2 == 1) {
                sum += square;
            } else {
                sum -= square;
            }
        }

        System.out.println("Результат: " + sum);
    }
}