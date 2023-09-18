package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        int userChoice = scanner.nextInt();

        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case GREET:
                Cli.greetingUser();
                break;
            case EVEN:
                Cli.greetingUser();
                Even.gameRule();
                Engine.playGame(userChoice);
                break;
            case CALC:
                Cli.greetingUser();
                Calculator.gameRule();
                Engine.playGame(userChoice);
                break;
            case GCD:
                Cli.greetingUser();
                Gcd.gameRule();
                Engine.playGame(userChoice);
                break;
            case PROGRESSION:
                Cli.greetingUser();
                Progression.gameRule();
                Engine.playGame(userChoice);
                break;
            case PRIME:
                Cli.greetingUser();
                Prime.gameRule();
                Engine.playGame(userChoice);
                break;
            case EXIT:
                break;
            default:
                System.out.println("no such game: " + userChoice);
                break;
        }
    }
}
