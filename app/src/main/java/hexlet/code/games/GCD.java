package hexlet.code.games;

import hexlet.code.Random;

public class GCD {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;

    public static void gameRule() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gameCorrectAnswer() {
        int randomNumber1 = Random.getRandom(MIN_VALUE, MAX_VALUE);
        int randomNumber2 = Random.getRandom(MIN_VALUE, MAX_VALUE);

        int result;

        System.out.println("Question :" + randomNumber1 + " " + randomNumber2);

        while (randomNumber1 != randomNumber2) {
            if (randomNumber1 > randomNumber2) {
                randomNumber1 = randomNumber1 - randomNumber2;
            }
            if (randomNumber2 > randomNumber1) {
                randomNumber2 = randomNumber2 - randomNumber1;
            }
        }
        result = randomNumber1;

        return Integer.toString(result);
    }
}