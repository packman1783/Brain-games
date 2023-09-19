package hexlet.code.games;

import hexlet.code.Random;

public final class Prime implements Game {
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_VALUE_PRIME = 0;
    private static final int MAX_VALUE_PRIME = 100;

    @Override
    public String getRule() {
        return GAME_RULE;
    }

    @Override
    public QuestionAnswer getQuestionAnswer() {
        int randomNumber = Random.getRandom(MIN_VALUE_PRIME, MAX_VALUE_PRIME);
        String answer = isPrime(randomNumber) ? "yes" : "no";

        return new QuestionAnswer(Integer.toString(randomNumber), answer);
    }

    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }

        for (int i = 2; i < randomNumber / 2; i++) {
            if (randomNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
