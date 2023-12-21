package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Prime {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {

        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUNDS];

        for (int i = 0; i < questions.length; i++) {

            int number = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            String question = Integer.toString(number);

            String correctAnswer = isPrime(number) ? "yes" : "no";

            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.start(TASK, questions, correctAnswers);
    }

    public static boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}


