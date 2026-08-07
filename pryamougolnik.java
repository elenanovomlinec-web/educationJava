import java.util.Scanner;

public class pryamougolnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: "); // вывели на экран приглашение
        double a = scanner.nextDouble(); // прочитали что ввели
        System.out.print("Введите ширину прямоугольника: ");
        double b = scanner.nextDouble();
        System.out.println("Площадь прямогольника S = " + (a * b));
        System.out.println("Периметр прямогольника P = " + ((a + b)*2));

        // В задаче про площадь прямоугольника вывести длину,
        //ширину и площадь прямоугольника при помощи одного
        //printf
        double S = (a*b);
        double P = ((a + b)*2);
        System.out.printf("a = %s, b = %s, S = %s, P = %s", a, b, S, P);


    }
}