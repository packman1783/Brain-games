package hexlet.code;

public final class GameData {
    private final String question;
    private final String answer;

    public GameData(String someQuestion, String someAnswer) {
        this.question = someQuestion;
        this.answer = someAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
