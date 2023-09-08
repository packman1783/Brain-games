package hexlet.code.games;

import hexlet.code.Random;

public class Even {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;

    public static void gameRule() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String gameCorrectAnswer() {
        int randomNumber = Random.getRandom(MIN_VALUE, MAX_VALUE);

        System.out.println("Question: " + randomNumber);

        return isEven(randomNumber) ? "yes" : "no";
    }

    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}
