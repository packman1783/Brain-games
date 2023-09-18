package hexlet.code.games;

import hexlet.code.Random;

import java.util.Arrays;

public class Progression implements Game {
    private static final String gameRule = "What number is missing in the progression?";
    final static int MIN_VALUE_PROGRESSION = 1;
    final static int MAX_VALUE_PROGRESSION = 100;
    final static int MIN_DIFF_PROGRESSION = 1;
    final static int MAX_DIFF_PROGRESSION = 10;
    final static int MIN_LENGTH_PROGRESSION = 5;
    final static int MAX_LENGTH_PROGRESSION = 10;
    final static int START_REPLACE_INDEX_PROGRESSION = 0;

    @Override
    public String getRule() {
        return gameRule;
    }

    @Override
    public QuestionAnswer getQuestionAnswer() {
        int firstNumber = Random.getRandom(MIN_VALUE_PROGRESSION, MAX_VALUE_PROGRESSION);
        int step = Random.getRandom(MIN_DIFF_PROGRESSION, MAX_DIFF_PROGRESSION);
        int lengthProgression = Random.getRandom(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
        int hiddenIndex = Random.getRandom(START_REPLACE_INDEX_PROGRESSION, lengthProgression);

        int[] progression = getProgression(firstNumber, step, lengthProgression);

        String answer = Integer.toString(progression[hiddenIndex - 1]);
        String question = Arrays
                .toString(progression)
                .replace(answer, "..");

        return new QuestionAnswer(question, answer);
    }

    private static int[] getProgression(int firstNumber, int step, int lengthProgression) {
        int[] progression = new int[lengthProgression];

        for (int i = 0; i < lengthProgression; i++) {
            progression[i] = firstNumber + step * i;
        }

        return progression;
    }
}