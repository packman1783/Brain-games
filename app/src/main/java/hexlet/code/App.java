package hexlet.code;

import hexlet.code.games.*;

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
                Engine.greetingUser();
                break;
            case 2:
                Even.askEvenNumber();
                break;
            case 3:
                Calculator.askCalculate();
                break;
            case 4:
                GCD.askGCD();
                break;
            case 5:
                Progression.askProgression();
                break;
            case 6:
                Prime.askPrime();
                break;
            default:
                break;
        }
    }
}
