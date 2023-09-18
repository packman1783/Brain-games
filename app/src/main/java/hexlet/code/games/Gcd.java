package hexlet.code.games;

import hexlet.code.Random;

public class Gcd {
    static final int MIN_VALUE_GCD = 1;
    static final int MAX_VALUE_GCD = 100;

    public static void gameRule() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static String gameCorrectAnswer() {
        int firstNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);
        int secondNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);

        System.out.println("Question :" + firstNumberGCD + " " + secondNumberGCD);

        return isGcd(firstNumberGCD, secondNumberGCD);
    }

    public static String isGcd(int firstNumber, int secondNumber) {

        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            }
            if (secondNumber > firstNumber) {
                secondNumber = secondNumber - firstNumber;
            }
        }

        return Integer.toString(firstNumber);
    }
}
