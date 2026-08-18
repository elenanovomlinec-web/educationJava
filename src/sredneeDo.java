package src;

import java.util.Scanner;

public class sredneeDo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите начало диапазона: ");
            int start = scanner.nextInt();

            System.out.print("Введите конец диапазона: ");
            int end = scanner.nextInt();

            int number = start;

            int sum = 0;
            int count = 0;

            int evenSum = 0;
            int evenCount = 0;

            do {
                sum += number; // Считаем сумму и количество всех чисел
                count++;

                if (number % 2 == 0) {  // проверка четности
                    evenSum += number;
                    evenCount++;
                }

                number++;
            } while (number <= end);

            double average = (double) sum / count;

            System.out.println("Среднее арифметическое всех чисел: " + average);

            if (evenCount > 0) {
                double evenAverage = (double) evenSum / evenCount;
                System.out.println("Среднее арифметическое чётных чисел: " + evenAverage);
            } else {
                System.out.println("В диапазоне нет чётных чисел.");
            }

        }
    }
