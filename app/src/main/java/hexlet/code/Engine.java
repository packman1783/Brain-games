package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.App.EVEN;
import static hexlet.code.App.CALC;
import static hexlet.code.App.GCD;
import static hexlet.code.App.PROGRESSION;
import static hexlet.code.App.PRIME;

public class Engine {
    static final int NUMBER_OF_ROUND = 3;
    static final int NUMBER_WIN_ANSWER = 3;

    public static void playGame(int userChoice) {
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = "";
        int countWinAnswer = 0;
        String userAnswer;

        for (int i = 0; i < NUMBER_OF_ROUND; i++) {
            switch (userChoice) {
                case EVEN:
                    correctAnswer = Even.gameCorrectAnswer();
                    break;
                case CALC:
                    correctAnswer = Calculator.gameCorrectAnswer();
                    break;
                case GCD:
                    correctAnswer = Gcd.gameCorrectAnswer();
                    break;
                case PROGRESSION:
                    correctAnswer = Progression.gameCorrectAnswer();
                    break;
                case PRIME:
                    correctAnswer = Prime.gameCorrectAnswer();
                    break;
                default:
                    System.out.println("no such game: " + userChoice);
                    break;
            }
            userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countWinAnswer++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }

            if (countWinAnswer == NUMBER_WIN_ANSWER) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        }
        scanner.close();
    }
}
