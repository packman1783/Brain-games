package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class GCD {
    public static void askGCD() {
        Scanner scanner = new Scanner(System.in);

        Engine.greetingUser();

        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            int randomNum1 = (int) (Math.random() * 100) + 1;
            int randomNum2 = (int) (Math.random() * 100) + 1;

            System.out.println("Question :" + randomNum1 + " " + randomNum2);

            int userAnswer = scanner.nextInt();

            System.out.println("Your answer: " + userAnswer);

            while (randomNum1 != randomNum2) {
                if (randomNum1 > randomNum2) {
                    randomNum1 = randomNum1 - randomNum2;
                }
                if (randomNum2 > randomNum1) {
                    randomNum2 = randomNum2 - randomNum1;
                }
            }
            int result = randomNum1;

            if (userAnswer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
        scanner.close();
    }

}
