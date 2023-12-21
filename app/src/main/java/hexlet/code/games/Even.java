package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Even {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    public static String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < questions.length; i++) {
            int number = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            String question = Integer.toString(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.start(task, questions, correctAnswers);
    }

}

