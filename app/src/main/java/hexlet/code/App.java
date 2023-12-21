package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case "0":
                break;
            case "1":
                sayHello();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calculator.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            default:
                System.out.println("Вы ввели неверный номер");
                break;
        }

    }

    private static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }
}
