public class arifmetika {
        public static void main(String[] args) {
            // Целые числа:
            int a = 17;
            int b = 5;

            System.out.println("Целые числа: " + a + " и " + b);
            System.out.println("a + b = " + (a + b));  // 22
            System.out.println("a - b = " + (a - b));  // 12
            System.out.println("a * b = " + (a * b));  // 85
            System.out.println("a / b = " + (a / b));  // 3 (целочисленное деление)
            System.out.println("a % b = " + (a % b));  // 2 (остаток)

            System.out.println();

            // Вещественные числа:
            double x = 17.0;
            double y = 5.0;

            System.out.println("Вещественные числа: " + x + " и " + y);
            System.out.println("x + y = " + (x + y));  // 22.0
            System.out.println("x - y = " + (x - y));  // 12.0
            System.out.println("x * y = " + (x * y));  // 85.0
            System.out.println("x / y = " + (x / y));  // 3.4 (вещественное деление)
            System.out.println("x % y = " + (x % y));  // 2.0 (остаток)
        }
}
