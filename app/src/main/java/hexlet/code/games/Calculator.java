package hexlet.code.games;

import hexlet.code.Random;

public class Calculator {
    static final int MIN_VALUE_CALC = 1;
    static final int MAX_VALUE_CALC = 40;
    static final String[] OPERATORS = new String[]{" + ", " - ", " * "};
    static final int FIRST_INDEX_OPERATORS = 0;
    static final int LAST_INDEX_OPERATORS = 2;
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
        String operator = OPERATORS[Random.getRandom(FIRST_INDEX_OPERATORS, LAST_INDEX_OPERATORS)];

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
                System.out.println("no such action: " + operator);
                break;
        }

        questionExpression = firstRandomNumber + operator + secondRandomNumber;

        return actionResult;
    }
}