package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class GCD {
    public static void play() {
        String correctAnswer = "";
        String question = "";

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.countOfRounds; i++) {

            int numberOne = RandomUtil.getRandomNumber(0, 100);
            int numberTwo = RandomUtil.getRandomNumber(0, 100);

            question = numberOne + " " + numberTwo;

            while (numberOne != numberTwo) {
                if (numberOne > numberTwo) {
                    numberOne = numberOne - numberTwo;
                } else {
                    numberTwo = numberTwo - numberOne;
                }
            }
            correctAnswer = Integer.toString(numberOne);
            Engine.start(question, correctAnswer);
        }
    }
}
