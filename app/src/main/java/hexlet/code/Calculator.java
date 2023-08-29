package hexlet.code;

import java.util.Scanner;

public class Calculator {
    public static void askCalculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");

        int count = 0;

        for (int i = 0; i < 3; i++) {
            int randomNum1 = (int) (Math.random() * 100);
            int randomNum2 = (int) (Math.random() * 100);
            int randomCalc = (int) (Math.random() * 3);
            String expression = "";
            int result = 0;

            switch (randomCalc) {
                case 0:
                    expression = randomNum1 + " + " + randomNum2;
                    result = randomNum1 + randomNum2;
                    break;
                case 1:
                    expression = randomNum1 + " - " + randomNum2;
                    result = randomNum1 - randomNum2;
                    break;
                case 2:
                    expression = randomNum1 + " * " + randomNum2;
                    result = randomNum1 * randomNum2;
                    break;
            }
            System.out.println("Question :" + expression);

            int userAnswer = scanner.nextInt();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + " !");
        }
        scanner.close();
    }
}
