package src;
import java.util.Scanner;
public class vesch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое вещественное число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе вещественное число: ");
            double num2 = scanner.nextDouble();

            final double EPSILON = 1e-9;    // Задаем погрешность (эпсилон)

            // Проверяем равенство с учетом погрешности
            if (Math.abs(num1 - num2) < EPSILON) {   // Math.abs - модуль числа
                System.out.println("Числа равны с учетом погрешности " + EPSILON);
            } else {
                System.out.println("Числа НЕ равны с учетом погрешности " + EPSILON);
                System.out.println("Разница: " + Math.abs(num1 - num2));
            }

            scanner.close();
        }
    }

