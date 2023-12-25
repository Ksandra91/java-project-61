package hexlet.code;

import java.util.Random;

public class RandomUtils {

    public static int getRandomNumber(int minimum, int maximum) {
        Random rn = new Random();
        return rn.nextInt(maximum - minimum + 1) + minimum;
    }

    public static char getRandomOperator(char[] operators) {
        Random rn = new Random();
        return operators[rn.nextInt(operators.length)];
    }
}
