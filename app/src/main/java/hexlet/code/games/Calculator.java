package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Calculator {
    public static void play() {

        String correctAnswer = "";
        int result = 0;
        String question = "";

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.countOfRounds; i++) {

            int numberOne = RandomUtil.getRandomNumber(0, 10);
            int numberTwo = RandomUtil.getRandomNumber(0, 10);
            char sign = RandomUtil.getRandomSign();

            question = numberOne + " " + sign + " " + numberTwo;

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
            correctAnswer = Integer.toString(result);
            Engine.start(question, correctAnswer);
        }
    }
}
