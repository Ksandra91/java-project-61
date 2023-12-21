package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Progression {
    public static void play() {

        String correctAnswer = "";
        String question = "";


        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < Engine.countOfRounds; i++) {
            int[] numbers = new int[10];
            StringBuilder stringBuilder = new StringBuilder();

            int firstElement = RandomUtil.getRandomNumber(0, 100);
            int progressionStep = RandomUtil.getRandomNumber(1, 5);
            numbers[0] = firstElement;
            int hiddenNumber = RandomUtil.getRandomNumber(0, 9);

            for (int j = 1; j < numbers.length; j++) {
                numbers[j] = numbers[0] + progressionStep * j;
            }

            correctAnswer = Integer.toString(numbers[hiddenNumber]);

            for (int k = 0; k < numbers.length; k++) {
                if (k == hiddenNumber) {
                    stringBuilder.append("..");
                } else {
                    stringBuilder.append(numbers[k]);
                }
                stringBuilder.append(" ");
            }
            question = stringBuilder.toString();

            Engine.start(question, correctAnswer);
        }
    }
}
