package hexlet.code.games;

import hexlet.code.Random;

import java.util.Arrays;

public class Progression {
    final static int MIN_VALUE_PROGRESSION = 1;
    final static int MAX_VALUE_PROGRESSION = 100;
    final static int MIN_DIFF_PROGRESSION = 1;
    final static int MAX_DIFF_PROGRESSION = 10;
    final static int MIN_LENGTH_PROGRESSION = 5;
    final static int MAX_LENGTH_PROGRESSION = 10;
    final static int START_REPLACE_INDEX_PROGRESSION = 0;

    public static void gameRule() {
        System.out.println("What number is missing in the progression?");
    }

    public static String gameCorrectAnswer() {

        int firstNumber = Random.getRandom(MIN_VALUE_PROGRESSION, MAX_VALUE_PROGRESSION);
        int difference = Random.getRandom(MIN_DIFF_PROGRESSION, MAX_DIFF_PROGRESSION);
        int lengthProgression = Random.getRandom(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
        int replaceIndex = Random.getRandom(START_REPLACE_INDEX_PROGRESSION, lengthProgression - 1);
        int hiddenNumber;

        int[] progression = new int[lengthProgression];
        progression[0] = firstNumber;

        for (int i = 1; i < lengthProgression; i++) {
            progression[i] = progression[i - 1] + difference;
        }

        hiddenNumber = progression[replaceIndex];

        String progressionString = Arrays
                .toString(progression)
                .replace(Integer.toString(hiddenNumber), "..");

        System.out.println("Question: " + progressionString);

        return Integer.toString(hiddenNumber);
    }
}