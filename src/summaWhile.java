package src;

public class summaWhile {
    public static void main(String[] args) {
       // сумма от 1 до 9
        int i = 1;
        int sum = 0;

        while (i <= 9) { // прибавляет 1+2+3...+9
            sum += i;
            i++;
        }
        System.out.println(sum);

        // сумма от 3 до 21
        int k = 3;
        int sum21 = 0;
        while (k <= 21) { // прибавляет 1+2+3...+21
            sum21 += k;
            k++;
        }
        System.out.println(sum21);

        // сумма четных чисел
        int l = 3;
        int sum21Ch = 0;
        while (l <= 21) { // прибавляет 1+2+3...+21
            if (l % 2 == 0) {
                sum21Ch += l;
            }

            l++;
        }
        System.out.println(sum21Ch);

        // сумма четных и кол-во четных чисел
        int m = 3;
        int sum22Ch = 0;
        while (m <= 21) { // прибавляет 1+2+3...+21
            if (m % 2 == 0) {
                sum21Ch += m;
            }

            m++;
        }
        System.out.println(sum22Ch + m);


    }
}