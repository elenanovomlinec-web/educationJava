package src;

import java.util.Scanner;

public class sredArif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 2 числа через пробел — начало и конец диапазона (оба > 1):");
        int start = scanner.nextInt(); // c чегоо начинаем сложение
        int finish = scanner.nextInt(); // чем заканчиваем сложение

        // Проверка условия задачи: числа > 1
        if (start <= 1 || finish <= 1) {
            System.out.println("Ошибка: оба числа должны быть > 1");
            return;
        }

        int sum = 0;          // long, чтобы избежать переполнения при больших диапазонах
        int count = 0;
        double evenSum = 0;
        double evenCount = 0;

        for (int i = start;
             i <= finish;
             i++) {
            sum += i;
            count++;

            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            }
        }

        // Среднее арифметическое всех чисел
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Сумма чисел: " + sum);
            System.out.println("Количество чисел: " + count);
            System.out.println("Среднее арифметическое = " + average);
        }

        // Среднее арифметическое чётных чисел
        if (evenCount > 0) {
            double evenAverage = (double) evenSum / evenCount;
            System.out.println("Сумма чётных чисел: " + evenSum);
            System.out.println("Количество чётных чисел: " + evenCount);
            System.out.println("Среднее арифметическое чётных = " + evenAverage);
        }
    }
}