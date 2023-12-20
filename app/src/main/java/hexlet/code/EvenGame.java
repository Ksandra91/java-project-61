package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static int countOfWins;

    public static void playEven() {
        Scanner scanner = new Scanner(System.in);
        int question;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (countOfWins < 3) {
            question = getRandom();
            System.out.println("Question: " + question);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (question % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                countOfWins++;
            } else if (question % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                countOfWins++;
            } else if (question % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println(" Let's try again, " + Cli.name + "!");
                break;
            } else if (question % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.name + "!");
                break;
            }
        }
        if (countOfWins == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
        scanner.close();
    }

    public static int getRandom() {
        int maximum = 100;
        int minimum = 0;
        Random rn = new Random();
        return rn.nextInt(maximum - minimum + 1) + minimum;
    }
}
