public class PloshadKruga {
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
