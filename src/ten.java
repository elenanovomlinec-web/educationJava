package src;

public class ten {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 100) {
            System.out.print(number + " ");

            if (number % 10 == 0) { //если число делится на 10 без остатка, переводи каретку
                System.out.println();
            }

            number++;
        }
    }
}
