package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class GCD {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    public static String task = "Find the greatest common divisor of given numbers.";

    public static void play() {

        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < questions.length; i++) {

            int numberOne = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int numberTwo = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);

            String question = numberOne + " " + numberTwo;

            while (numberOne != numberTwo) {
                if (numberOne > numberTwo) {
                    numberOne = numberOne - numberTwo;
                } else {
                    numberTwo = numberTwo - numberOne;
                }
            }
            String correctAnswer = Integer.toString(numberOne);
            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.start(task, questions, correctAnswers);
    }
}
