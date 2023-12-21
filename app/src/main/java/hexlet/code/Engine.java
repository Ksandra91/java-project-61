package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static int countOfWins;


    public static void start(String task, String[] questions, String[] correctAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println(task);

        int countOfRounds = 3;
        for (int i = 0; i < countOfRounds; i++) {
            System.out.println("Question: " + questions[i]);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
                countOfWins++;

            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                System.exit(0);
            }
            if (countOfWins == countOfRounds) {
                System.out.println("Congratulations, " + playerName + "!");
            }
        }
    }
}
