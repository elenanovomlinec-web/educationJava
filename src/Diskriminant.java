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
}
       // System.out.println(D);

