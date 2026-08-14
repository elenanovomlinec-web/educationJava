package src;
// для Ильи: я замумукалась с этой задачей уже на третьей итерации,
// я в шаге от того, чтобы на всю кофейню спросить "а разрабы тут есть?!"
// equals какая то мутная штука
import java.util.Scanner;

public class parole {
    public static void main(String[] args) {

        String goldPass = "барамбарабука"; // Пароль с которым сравниваем
        int dlina = goldPass.length(); // подсчитали длину пароля
        System.out.print("Введите пароль: "); // вывели на экран приглашение
        Scanner scanner = new Scanner(System.in);
        String userLine = scanner.nextLine(); // перемнная для введенногого пароль
        int dlinaUserLine = userLine.length(); // посчитали длиню введенного пароля
        if (userLine.equals(goldPass)) {
            System.out.println("Пароль верный");
        } else if (userLine.length() > goldPass.length()) {
            System.out.println("Пароль неверный и строка слишком длинная");
        } else {
            System.out.println("Пароль неверный и строка слишком короткая");
        }

        }
    }
