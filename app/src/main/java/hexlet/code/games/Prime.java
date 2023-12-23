package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_OF_GAME_DATA];

        for (var round : gameData) {

            int number = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            String question = Integer.toString(number);

            String correctAnswer = isPrime(number) ? "yes" : "no";

            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;
        }
        Engine.start(TASK, gameData);
    }

    public static boolean isPrime(int number) {
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


