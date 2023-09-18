package hexlet.code.games;

import hexlet.code.Random;

public class Gcd implements Game {
    private static final String gameRule = "Find the greatest common divisor of given numbers.";
    static final int MIN_VALUE_GCD = 1;
    static final int MAX_VALUE_GCD = 100;

    @Override
    public String getRule() {
        return gameRule;
    }

    @Override
    public QuestionAnswer getQuestionAnswer() {
        int firstNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);
        int secondNumberGCD = Random.getRandom(MIN_VALUE_GCD, MAX_VALUE_GCD);
        String question = firstNumberGCD + " " + secondNumberGCD;
        String answer = isGcd(firstNumberGCD, secondNumberGCD);

        return new QuestionAnswer(question, answer);
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
