package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Scanner;


public class Progression {
    public static void askProgression() {
        Scanner scanner = new Scanner(System.in);

        Engine.greetingUser();

        System.out.println("What number is missing in the progression?");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            int minLength = 5;
            int maxLength = 10;
            int minValue = 1;
            int maxValue = 100;
            int minDiff = 1;
            int maxDiff = 10;

            int length = (int) (Math.random() * (maxLength - minLength + 1)) + minLength;
            int firstNum = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
            int difference = (int) (Math.random() * (maxDiff - minDiff + 1)) + minDiff;
            int replaceIndex = (int) (Math.random() * length);
            int hiddenValue = 0;

            int[] progression = new int[length];
            progression[0] = firstNum;

            for (int j = 1; j < length; j++) {
                if (j == replaceIndex) {
                    hiddenValue = progression[j - 1] + difference;
                    progression[j] = hiddenValue;
                } else {
                    progression[j] = progression[j - 1] + difference;
                }
            }

            String progressionString = Arrays.toString(progression);
            progressionString = progressionString.replace(Integer.toString(hiddenValue), "..");

            System.out.println("Question: " + progressionString);

            int userAnswer = scanner.nextInt();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer == hiddenValue) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + hiddenValue + ".");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Engine.userName + " !");
        }
        scanner.close();
    }
}
