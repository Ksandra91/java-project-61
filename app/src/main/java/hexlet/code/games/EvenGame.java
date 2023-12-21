package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {


    public static void play() {

        String correctAnswer = "";
        String question = "";


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        for (int i = 0; i < Engine.countOfRounds; i++) {
            int number = getRandom();
            question = Integer.toString(number);

            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            Engine.start(question, correctAnswer);
        }

    }

    public static int getRandom() {
        int maximum = 100;
        int minimum = 0;
        Random rn = new Random();
        return rn.nextInt(maximum - minimum + 1) + minimum;
    }
}
