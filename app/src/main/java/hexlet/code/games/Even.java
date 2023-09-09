package hexlet.code.games;

import hexlet.code.Random;

public class Even {
    static final int MIN_VALUE_EVEN = 1;
    static final int MAX_VALUE_EVEN = 100;

    public static void gameRule() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String gameCorrectAnswer() {
        int randomNumber = Random.getRandom(MIN_VALUE_EVEN, MAX_VALUE_EVEN);

        System.out.println("Question: " + randomNumber);

        return isEven(randomNumber) ? "yes" : "no";
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
