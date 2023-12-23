package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final int STEP_MIN = 1;
    private static final int STEP_MAX = 5;
    private static final String TASK = "What number is missing in the progression?";

    public static void play() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][Engine.COUNT_OF_GAME_DATA];

        for (var round : gameData) {

            int firstElement = RandomUtils.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int progressionStep = RandomUtils.getRandomNumber(STEP_MIN, STEP_MAX);
            int hiddenMemberIndex = RandomUtils.getRandomNumber(0, PROGRESSION_LENGTH - 1);

            String[] progression = makeProgression(firstElement, progressionStep);
            String correctAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";

            String question = String.join(" ", progression);

            round[Engine.INDEX_OF_QUESTION] = question;
            round[Engine.INDEX_OF_CORRECT_ANSWER] = correctAnswer;
        }
        Engine.start(TASK, gameData);
    }

    public static String[] makeProgression(int first, int step) {
        String[] progression = new String[PROGRESSION_LENGTH];
        progression[0] = Integer.toString(first);
        for (int i = 1; i < PROGRESSION_LENGTH; i++) {
            progression[i] = Integer.toString(first + step * i);
        }
        return progression;
    }
}
