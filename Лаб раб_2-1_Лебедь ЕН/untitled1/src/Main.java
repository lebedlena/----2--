import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет! Угадай число!");
        System.out.println("Введи однозначное число и нажми ENTER");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        while (a!=7) {
            a = scan.nextInt();
            if (a<7) System.out.println("Не верно. Введи число больше.");

            else if (a>7) System.out.println("Попробуй ещё раз. Загаданное число меньше.");

            else System.out.println("Bingo!");
        }
        System.out.println(a+ " "+"Поздравляю! Задание выполнено!");}
}
