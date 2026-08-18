import java.util.Scanner;

public class fibonachchi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер n: ");
        int n = scanner.nextInt();

        long result = fibWhile(n);   // Вызываем метод fibWhile(n), чтобы вычислить n-е число Фибоначчи, и сохраняем результат в result
        System.out.println("F(" + n + ") = " + result);
    }

    public static long fibWhile(int n) {
        if (n == 0) return 0;  // если n=0, то 0
        if (n == 1) return 1;  // если n=1, то 1

        long a = 0;
        long b = 1;
        int i = 2;  // Переменная i — текущий индекс, с которого начинаем вычислять новые числа; начинаем с 2, т.к. 0 и 1 уже известны

        while (i <= n) {  // вычисляем пока i не станет больше n
            long c = a + b;
            a = b;  // Сдвигаем a вперёд: теперь a должно хранить F(i-1), поэтому присваиваем a = b
            b = c;  //   // Сдвигаем b вперёд: теперь b должно хранить F(i), поэтому присваиваем b = c
            i++;
        }

        return b;
    }
}