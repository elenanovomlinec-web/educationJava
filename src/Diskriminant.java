import java.util.Scanner;

public class Diskriminant  {
    public static void main(String[] args) {  //D=b2−4ac
        int a = 2;
        int b = 7;
        int c = 3;

        int bSquare = (int) Math.pow(b, 2);
        int fourAC = 4*a*c;
        int D = bSquare-fourAC;
        System.out.println("Квадратное уравнение: "
                + a + "x^2 + " + b + "x + " + c + " = 0");

        System.out.println("Дискриминант =" + D);

        if (D > 0) {
            System.out.println("Уравнение имеет два действительных корня.");
        } else if (D == 0) {
            System.out.println("Уравнение имеет один действительный корень.");
        } else {
            System.out.println("Уравнение не имеет действительных корней.");
        }
    }

    public static class PloshadKruga {
        public static void main(String[] args) {
            double radius = 3;  // радиус окружности
            double a = Math.pow(radius, 2); // возведение в квадрат
            double sKruga = Math.PI * a; //получение площади круга = пи*a
            double ploshadKruga = 28;
            double dlinaOkr = 2*Math.PI*radius; // получение длины окружности по радиусу
            double radius2 = Math.sqrt(ploshadKruga/Math.PI); // получение радиуса по заданной площади
            double ugol = 60;
            double ploshadSektora = Math.PI*Math.pow(radius,2)*ugol/360;

    // TODO: тут куча вывода
            System.out.println ("Площадь круга = " + sKruga);
            System.out.println ("Длина окружности = " + dlinaOkr);
            System.out.println ("Радиус окружности с площадью "+ ploshadKruga + " = " + radius2);
            System.out.println ("Площадь сектора  = " + ploshadSektora);




        }
    }

    public static class pryamougolnik {
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

    public static class urok2 {
        public static void main(String[] args){
        String data =" “30” августа 1903г.";
        String addres = "C:\\Windows\\System32\\Drivers\\etc\\hosts";
        int a = 2;
        int aSquare = (int) Math.pow(a, 2); //

        System.out.println(data);
        System.out.println(addres);
        System.out.println("Результат = " + aSquare);
        }
    }
}
       // System.out.println(D);

