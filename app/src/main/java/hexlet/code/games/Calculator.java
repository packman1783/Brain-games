package hexlet.code.games;

import hexlet.code.Random;

public class Calculator {
    static final int MIN_VALUE_CALC = 1;
    static final int MAX_VALUE_CALC = 40;
    static final String[] OPERATORS = new String[]{" + ", " - ", " * "};
    static final int START_INDEX_OPERATORS = 0;
    static String questionExpression;

    public static void gameRule() {
        System.out.println("What is the result of the expression?");
    }

    public static String gameCorrectAnswer() {
        int firstNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);
        int secondNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);

        int result = randomAction(firstNumberCalc, secondNumberCalc);
        System.out.println("Question :" + questionExpression);

        return Integer.toString(result);
    }

    public static int randomAction(int firstRandomNumber, int secondRandomNumber) {
        String operator = OPERATORS[Random.getRandom(START_INDEX_OPERATORS, OPERATORS.length)];

        int actionResult = 0;

        switch (operator) {
            case " + ":
                actionResult = firstRandomNumber + secondRandomNumber;
                break;
            case " - ":
                actionResult = firstRandomNumber - secondRandomNumber;
                break;
            case " * ":
                actionResult = firstRandomNumber * secondRandomNumber;
                break;
            default:
                System.exit(0);
                break;
        }

        questionExpression = firstRandomNumber + operator + secondRandomNumber;

        return actionResult;
    }
}