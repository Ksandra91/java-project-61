package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String playerName;
    public static int countOfRounds = 3;

    public static int countOfWins;

    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static void start(String question, String correctAnswer) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Question: " + question);
        String answer = scanner.nextLine();
        System.out.println("Your answer: " + answer);

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            countOfWins++;

        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + playerName + "!");
            System.exit(0);
        }
        if (countOfWins == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
