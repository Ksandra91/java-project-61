package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static void play() {

        String correctAnswer = "";
        int result = 0;
        String question = "";

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.countOfRounds; i++) {

            int numberOne = getRandomNumber();
            int numberTwo = getRandomNumber();
            char sign = getRandomSign();

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

    public static int getRandomNumber() {
        int maximum = 10;
        int minimum = 0;
        Random rn = new Random();
        return rn.nextInt(maximum - minimum + 1) + minimum;
    }

    public static char getRandomSign() {
        char[] signs = {'+', '*', '-'};
        Random rn = new Random();
        return signs[rn.nextInt(3)];
    }
}
