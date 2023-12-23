package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {

    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 10;
    private static final String TASK = "What is the result of the expression?";

    public static void play() {
        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_OF_GAME_DATA];

        for (var round : gameData) {
            int numberOne = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int numberTwo = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            char sign = RandomUtils.getRandomSign(new char[]{'+', '*', '-'});
            int result;
            String question = numberOne + " " + sign + " " + numberTwo;

            switch (sign) {
                case '+':
                    result = numberOne + numberTwo;
                    break;
                case '*':
                    result = numberOne * numberTwo;
                    break;
                case '-':
                    result = numberOne - numberTwo;
                    break;
                default:
                    throw new RuntimeException("Unknown input: " + sign);
            }
            String correctAnswer = Integer.toString(result);
            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;
        }
        Engine.start(TASK, gameData);
    }
}
