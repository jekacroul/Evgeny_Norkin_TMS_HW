package Test;

public class Question {
    String questionText;
    long id;
    int counter;
    Answer answer;

    public Question(String questionText, Answer answer) {
        this.questionText = questionText;
        this.answer = answer;
        this.id = counter++;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionText='" + questionText + '\'' +
                ", id=" + id +
                ", counter=" + counter +
                ", answer=" + answer +
                '}';
    }
}
