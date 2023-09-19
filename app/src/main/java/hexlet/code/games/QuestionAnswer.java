package hexlet.code.games;

public class QuestionAnswer {
    private final String question;
    private final String answer;

    public QuestionAnswer(String someQuestion, String someAnswer) {
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
