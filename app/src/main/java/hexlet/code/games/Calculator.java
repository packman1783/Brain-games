package hexlet.code.games;

import hexlet.code.Random;

public final class Calculator implements Game {
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final int MIN_VALUE_CALC = 1;
    private static final int MAX_VALUE_CALC = 40;
    private static final String[] OPERATORS = new String[]{" + ", " - ", " * "};
    private static final int START_INDEX_OPERATORS = 0;

    @Override
    public String getRule() {
        return GAME_RULE;
    }

    @Override
    public GameData getQuestionAnswer() {
        int firstNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);
        int secondNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);
        String operator = OPERATORS[Random.getRandom(START_INDEX_OPERATORS, OPERATORS.length - 1)];

        String question = firstNumberCalc + operator + secondNumberCalc;
        String answer = Integer.toString(randomAction(firstNumberCalc, secondNumberCalc, operator));

        return new GameData(question, answer);
    }

    public static int randomAction(int firstNumber, int secondNumber, String operator) {
        int result = 0;

        switch (operator) {
            case " + ":
                result = firstNumber + secondNumber;
                break;
            case " - ":
                result = firstNumber - secondNumber;
                break;
            case " * ":
                result = firstNumber * secondNumber;
                break;
            default:
                System.exit(0);
        }

        return result;
    }
}
