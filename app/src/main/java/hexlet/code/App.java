package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 0:
                break;
            case 1:
                Engine.welcome();
                break;
            case 2:
                Engine.welcome();
                EvenGame.play();
                break;
            case 3:
                Engine.welcome();
                Calculator.play();
                break;
            default:
                System.out.println("Вы ввели неверный номер");
                break;
        }
        //  scanner.close();
    }
}
