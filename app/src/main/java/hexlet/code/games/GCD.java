package hexlet.code.games;

import hexlet.code.Random;

public class GCD {
    static final int MIN_VALUE_GCD = 1;
    static final int MAX_VALUE_GCD = 100;

    public static void gameRule() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gameCorrectAnswer() {
        int firstNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);
        int secondNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);

        System.out.println("Question :" + firstNumberGCD + " " + secondNumberGCD);

        while (firstNumberGCD != secondNumberGCD) {
            if (firstNumberGCD > secondNumberGCD) {
                firstNumberGCD = firstNumberGCD - secondNumberGCD;
            }
            if (secondNumberGCD > firstNumberGCD) {
                secondNumberGCD = secondNumberGCD - firstNumberGCD;
            }
        }

        return Integer.toString(firstNumberGCD);
    }
}