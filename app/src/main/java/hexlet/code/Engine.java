package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.QuestionAnswer;

import java.util.Scanner;

public class Engine {
    static final int NUMBER_OF_ROUND = 3;

    public Engine(Game game) {
        int countWinAnswer = 0;

        Scanner scanner = new Scanner(System.in);

        Cli.greetingUser();
        System.out.println(game.getRule());

        for (int i = 0; i < NUMBER_OF_ROUND; i++) {
            QuestionAnswer quiz = game.getQuestionAnswer();
            String question = quiz.getQuestion();
            String answer = quiz.getAnswer();

            System.out.println("Question: " + question);

            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer)) {
                countWinAnswer++;
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + answer);
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
        }

        if (countWinAnswer == NUMBER_OF_ROUND) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
