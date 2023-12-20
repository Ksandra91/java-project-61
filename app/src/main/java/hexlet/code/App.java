package hexlet.code;

import java.util.Scanner;

public class App {
    static String name;

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                break;
            case 1:
                welcome();
                break;
            case 2:
                welcome();
                EvenGame.playEven();
                break;
            default:
                System.out.println("Вы ввели неверный номер");
                break;
        }
        scanner.close();
    }

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
