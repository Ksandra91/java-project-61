package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtil;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    private static final int STEP_MIN = 1;
    private static final int STEP_MAX = 5;
    public static String task = "What number is missing in the progression?";

    public static void play() {

        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (int i = 0; i < questions.length; i++) {

            int firstElement = RandomUtil.getRandomNumber(RANDOM_MIN, RANDOM_MAX);
            int progressionStep = RandomUtil.getRandomNumber(STEP_MIN, STEP_MAX);
            int hiddenMemberIndex = RandomUtil.getRandomNumber(0, PROGRESSION_LENGTH - 1);

            String[] progression = makeProgression(firstElement, progressionStep);
            String correctAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";

            String question = String.join(" ", progression);

            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.start(task, questions, correctAnswers);
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
