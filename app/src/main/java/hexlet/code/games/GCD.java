package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCD {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void play() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_OF_GAME_DATA];

        for (var round : gameData) {

            int numberOne = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int numberTwo = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);

            String question = numberOne + " " + numberTwo;

            String correctAnswer = Integer.toString(gcd(numberOne, numberTwo));
            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;
        }
        Engine.start(TASK, gameData);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
