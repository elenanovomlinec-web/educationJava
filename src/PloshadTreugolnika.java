package src;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PloshadTreugolnika {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x1 ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите y1 ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите x2 ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите y2 ");
        double y2 = scanner.nextDouble();
        System.out.print("Введите x3 ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите y3 ");
        double y3 = scanner.nextDouble();

        //выведим на экран координаты
        System.out.print("Введённые координаты:");
        System.out.printf("A(%.2f; %.2f)%n", x1, y1);
        System.out.printf("B(%.2f; %.2f)%n", x2, y2);
        System.out.printf("C(%.2f; %.2f)%n", x3, y3);

        // проверка на лежание на одной прямой
        double straight = (x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1);

       if  (straight == 0) {
           System.out.print("Точки лежат на одной прямой, площадь не определена");
           return;
       }
       System.out.println(straight);

        //  вычисляем длины сторон:
        double sideA = sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double sideB = sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double sideC = sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        System.out.println("Длиный сторон: А = "  + sideA + " B = " + sideB + " C = " + sideC);

        // вчисление полупериметра
        double p = (sideA + sideB + sideC)/2;
        System.out.println("Полупериметр = " +p);

        // Вычисление по формуле Герона
        double S = sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // офигеть, оказывается можно кликом случайно зафигачить импорт библиотеки))
        System.out.println("Площадь = " +S);




    }
}
