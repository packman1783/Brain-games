package hexlet.code.games;

import hexlet.code.Random;

public class Prime {
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100;

    public static void gameRule() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static String gameCorrectAnswer() {
            int randomNumber = Random.getRandom(MIN_VALUE, MAX_VALUE);

            System.out.println("Question: " + randomNumber);

            return  isPrime(randomNumber) ? "yes" : "no";
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(randomNumber); i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
