package hexlet.code.games;

import hexlet.code.Random;

public class Calculator {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 40;
    static final String[] OPERATORS = new String[]{" + ", " - ", " * "};
    static final int FIRST_INDEX_OPERATORS = 0;
    static final int LAST_INDEX_OPERATORS = 2;
    static String expression;

    public static void gameRule() {
        System.out.println("What is the result of the expression?");
    }

    public static String gameCorrectAnswer() {
        int randomNumber1 = Random.getRandom(MIN_VALUE, MAX_VALUE);
        int randomNumber2 = Random.getRandom(MIN_VALUE, MAX_VALUE);

        int result = randomAction(randomNumber1, randomNumber2);
        System.out.println("Question :" + expression);

        return Integer.toString(result);
    }

    public static int randomAction(int randomNumber1, int randomNumber2) {
        String action = OPERATORS[Random.getRandom(FIRST_INDEX_OPERATORS, LAST_INDEX_OPERATORS)];

        int actionResult = 0;

        switch (action) {
            case " + ":
                actionResult = randomNumber1 + randomNumber2;
                break;
            case " - ":
                actionResult = randomNumber1 - randomNumber2;
                break;
            case " * ":
                actionResult = randomNumber1 * randomNumber2;
                break;
            default:
                System.out.println("no such action: " + action);
                break;
        }
        expression = randomNumber1 + action + randomNumber2;
        return actionResult;
    }
}