package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Prime {
    public static void askPrime() {
        Scanner scanner = new Scanner(System.in);

        Engine.greetingUser();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 100) + 2;
            boolean isRandomNumberPrime = isSimple(randomNumber);

            System.out.println("Question: " + randomNumber);

            String userAnswer = scanner.nextLine();

            if (isRandomNumberPrime == true) {
                if (userAnswer.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else if (userAnswer.equals("no")) {
                    System.out.println("'no' is the wrong answer ;(. The correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Engine.userName + "!");
                    break;
                } else {
                    System.out.println("Incorrect answer, need 'yes' or 'no'.");
                    break;
                }
            } else {
                if (userAnswer.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else if (userAnswer.equals("yes")) {
                    System.out.println("'yes' is the wrong answer ;(. The correct answer was 'no'.");
                    System.out.println("Let's try again, " + Engine.userName + "!");
                    break;
                } else {
                    System.out.println("Incorrect answer, need 'yes' or 'no'.");
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Engine.userName + " !");
        }
        scanner.close();
    }

    public static boolean isSimple(int randomNumber) {
        for (int j = 2; j < randomNumber / 2; j++) {
            if(randomNumber % j == 0) {
                return false;
            }
        }
        return true;
    }
}
