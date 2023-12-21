package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Calculator {

    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 10;
    private static final String TASK = "What is the result of the expression?";

    public static void play() {

        String[] questions = new String[Engine.COUNT_OF_ROUNDS];
        String[] correctAnswers = new String[Engine.COUNT_OF_ROUNDS];

        for (int i = 0; i < questions.length; i++) {

            int numberOne = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int numberTwo = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            char sign = RandomUtil.getRandomSign();
            int result = 0;
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
            }
            String correctAnswer = Integer.toString(result);
            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.start(TASK, questions, correctAnswers);
    }
}
