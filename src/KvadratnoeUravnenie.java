package src;

import java.util.Scanner;

public class KvadratnoeUravnenie {
    public static void main(String[] args) {  //D=b2−4ac
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a ");
        double a = scanner.nextDouble();
        System.out.print("Введите b ");
        double b = scanner.nextDouble();
        System.out.print("Введите c");
        double c = scanner.nextDouble();

        if (a!=0)  {             // a не равно 0, то решаем квадратное уравнение
            double bSquare = Math.pow(b, 2);// b в квадрате
            double fourAC = 4 * a * c;
            double D = bSquare - fourAC;
             System.out.println("Квадратное уравнение: "
                 + a + "x^2 + " + b + "x + " + c + " = 0");

            System.out.println("Дискриминант =" + D);

            if (D > 0) {
             double x1 = (-b + Math.sqrt(D))/(2*a);
                double x2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("Уравнение имеет два действительных корня: " + x1 + " и "+ x2);
            } else if (D == 0) {
                double x = (-b/(2*a));
             System.out.println("Уравнение имеет один действительный корень." +x);
             } else {
                System.out.println("Уравнение не имеет действительных корней.");
            }
            return;

        }   else if (b!=0) { // если a=0 и б не равно 0 то вычисляем х
            double x0 = -(c / b);
            System.out.println("Уравнение имеет один действительный корень." + x0);

        }   else if ((b==0) && (c==0)) {
            System.out.println("Уравнение имеет бесконечно много решений.");
        } else if ((b==0) && (c!=0)) {
            System.out.println("Уравнение не имеет решений");
        }

        }


    }
