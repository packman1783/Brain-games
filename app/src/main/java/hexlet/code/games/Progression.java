package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.GameData;
import hexlet.code.Random;

public final class Progression implements Game {
    private static final String GAME_RULE = "What number is missing in the progression?";
    private static final int MIN_VALUE_PROGRESSION = 1;
    private static final int MAX_VALUE_PROGRESSION = 100;
    private static final int MIN_DIFF_PROGRESSION = 1;
    private static final int MAX_DIFF_PROGRESSION = 10;
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    private static final int START_REPLACE_INDEX_PROGRESSION = 1;

    @Override
    public String getRule() {
        return GAME_RULE;
    }

    @Override
    public GameData getQuestionAnswer() {
        int firstNumber = Random.getRandom(MIN_VALUE_PROGRESSION, MAX_VALUE_PROGRESSION);
        int step = Random.getRandom(MIN_DIFF_PROGRESSION, MAX_DIFF_PROGRESSION);
        int lengthProgression = Random.getRandom(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
        int hiddenIndex = Random.getRandom(START_REPLACE_INDEX_PROGRESSION, lengthProgression);

        int[] progression = getProgression(firstNumber, step, lengthProgression);

        String answer = Integer.toString(progression[hiddenIndex - 1]);
        String question = getProgressionString(progression, answer);

        return new GameData(question, answer);
    }

    private static int[] getProgression(int firstNumber, int step, int lengthProgression) {
        int[] progression = new int[lengthProgression];

        for (int i = 0; i < lengthProgression; i++) {
            progression[i] = firstNumber + step * i;
        }

        return progression;
    }

    private static String getProgressionString(int[] progression, String hiddenNumber) {
        String[] progressionStr = new String[progression.length];
        for (int i = 0; i < progression.length; i++) {
            progressionStr[i] = Integer.toString(progression[i]);
        }

        return String
                .join(" ", progressionStr)
                .replace(hiddenNumber, "..");
    }
}
