package Test;

public class Answer {
    String answerText;
    long id;
    int counter;

    public Answer(String answerText) {
        this.answerText = answerText;
        this.id = counter++;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerText='" + answerText + '\'' +
                ", id=" + id +
                ", counter=" + counter +
                '}';
    }
}
