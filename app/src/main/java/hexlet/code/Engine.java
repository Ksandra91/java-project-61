package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_OF_ROUNDS = 3;
    public static final int COUNT_OF_GAME_DATA = 2;
    public static final int INDEX_OF_QUESTION = 0;
    public static final int INDEX_OF_CORRECT_ANSWER = 1;


    public static void start(String task, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println(task);


        for (var round : gameData) {

            String question = round[INDEX_OF_QUESTION];
            String correctAnswer = round[INDEX_OF_CORRECT_ANSWER];

            System.out.println("Question: " + question);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);


            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");

            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + round[INDEX_OF_CORRECT_ANSWER] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
        scanner.close();
    }
}
