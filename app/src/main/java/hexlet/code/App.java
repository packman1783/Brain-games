package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int userChoice = scanner.nextInt();

        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case 1:
                Cli.greetingUser();
                break;
            case 2:
                Cli.greetingUser();
                Even.gameRule();
                Engine.gamePlay(userChoice);
                break;
            case 3:
                Cli.greetingUser();
                Calculator.gameRule();
                Engine.gamePlay(userChoice);
                break;
            case 4:
                Cli.greetingUser();
                GCD.gameRule();
                Engine.gamePlay(userChoice);
                break;
            case 5:
                Cli.greetingUser();
                Progression.gameRule();
                Engine.gamePlay(userChoice);
                break;
            case 6:
                Cli.greetingUser();
                Prime.gameRule();
                Engine.gamePlay(userChoice);
                break;
            default:
                System.out.println("no such game: " + userChoice);
                break;
        }
    }
}
