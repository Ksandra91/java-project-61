package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_OF_GAME_DATA];

        for (var round : gameData) {

            int number = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            String question = Integer.toString(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;

        }
        Engine.start(TASK, gameData);
    }
}

