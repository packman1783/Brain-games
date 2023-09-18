package hexlet.code.games;

import hexlet.code.Random;

public class Calculator implements Game {
    private static final String gameRule = "What is the result of the expression?";
    static final int MIN_VALUE_CALC = 1;
    static final int MAX_VALUE_CALC = 40;
    static final String[] OPERATORS = new String[]{" + ", " - ", " * "};
    static final int START_INDEX_OPERATORS = 0;

    @Override
    public String getRule() {
        return gameRule;
    }

    @Override
    public QuestionAnswer getQuestionAnswer() {
        int firstNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);
        int secondNumberCalc = Random.getRandom(MIN_VALUE_CALC, MAX_VALUE_CALC);
        String operator = OPERATORS[Random.getRandom(START_INDEX_OPERATORS, OPERATORS.length - 1)];

        String question = firstNumberCalc + operator + secondNumberCalc;
        String answer = Integer.toString(randomAction(firstNumberCalc, secondNumberCalc, operator));

        return new QuestionAnswer(question, answer);
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