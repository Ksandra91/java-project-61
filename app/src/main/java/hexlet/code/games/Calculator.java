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

            final char[] operators = new char[]{'+', '*', '-'};
            var indexOperator = RandomUtils.getRandomNumber(0, operators.length - 1);
            var operator = operators[indexOperator];

            String question = numberOne + " " + operator + " " + numberTwo;
            int result = calculate(operator, numberOne, numberTwo);
            String correctAnswer = Integer.toString(result);
            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;
        }
        Engine.start(TASK, gameData);
    }

    private static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

}
