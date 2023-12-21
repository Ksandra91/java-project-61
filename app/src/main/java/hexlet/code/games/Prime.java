package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Prime {
    public static void play() {
        String correctAnswer = "";
        String question = "";

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < Engine.countOfRounds; i++) {

            int number = RandomUtil.getRandomNumber(0, 100);
            question = Integer.toString(number);

            if (number < 2) {
                correctAnswer = "no";
            }
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    correctAnswer = "no";
                    break;
                } else {
                    correctAnswer = "yes";
                }
            }
            Engine.start(question, correctAnswer);
        }
    }
}
