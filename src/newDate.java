import java.util.Scanner;

public class newDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean visokos = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int daysInMonth; // солько дней в месяце
        switch (month) { // это оператор выбора,
                        // который позволяет выполнить разные блоки кода
                        //  в зависимости от значения одной переменной
            case 2:
                daysInMonth = visokos ? 29 : 28; // февраль
                break;
            case 4: // апрель
            case 6: // июнь
            case 9: // сентябрь
            case 11: //ноябрь
                daysInMonth = 30;
                break;
            default:   // остальные
                daysInMonth = 31;
                break;
        }

        boolean isValid = true;  // валидность даты
        if (year <= 0) isValid = false;  // год больше нудя
        if (month < 1 || month > 12) isValid = false;  // месяц от 1 до 12
        if (day < 1 || day > daysInMonth) isValid = false; // день от 1 до кол-ва дней ы  месяце

        if (!isValid) {
            System.out.println("Ошибка: некорректная дата!");
            return;
        }

        // вычисляем "завтра"
        day = day+1;

        if (day > daysInMonth) {
            day = 1;
            month = month+1;

            if (month > 12) {
                month = 1;
                year= year+1;
            }
        }

        // вывод даты "завтра"
        String dayStr = (day < 10) ? "0" + day : String.valueOf(day);
        String monthStr = (month < 10) ? "0" + month : String.valueOf(month);
        String yearStr = String.valueOf(year);

        System.out.println("Следующая дата: " + dayStr + "." + monthStr + "." + yearStr);
    }
}