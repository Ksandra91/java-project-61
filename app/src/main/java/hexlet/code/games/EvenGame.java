package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class EvenGame {


    public static void play() {

        String correctAnswer = "";
        String question = "";


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");


        for (int i = 0; i < Engine.countOfRounds; i++) {
            int number = RandomUtil.getRandomNumber(0, 100);
            question = Integer.toString(number);

            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            Engine.start(question, correctAnswer);
        }
    }
}
