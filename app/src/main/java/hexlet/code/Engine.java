package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUND = 3;
    static final int NUMBER_WIN_ANSWER = 3;

    public static void gamePlay(int userChoice) {
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = "";
        int countWinAnswer = 0;
        String userAnswer;

        for (int i = 0; i < NUMBER_OF_ROUND; i++) {
            switch (userChoice) {
                case 2:
                    correctAnswer = Even.gameCorrectAnswer();
                    break;
                case 3:
                    correctAnswer = Calculator.gameCorrectAnswer();
                    break;
                case 4:
                    correctAnswer = GCD.gameCorrectAnswer();
                    break;
                case 5:
                    correctAnswer = Progression.gameCorrectAnswer();
                    break;
                case 6:
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

            gameResult(Cli.userName, countWinAnswer);
        }
        scanner.close();
    }

    public static void gameResult(String userName, int countWinAnswer) {
        if (countWinAnswer == NUMBER_WIN_ANSWER) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
