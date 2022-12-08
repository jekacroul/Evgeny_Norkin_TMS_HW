package Test;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[3];
        Answer answer = new Answer("1885");
        Answer answer1 = new Answer("1886");
        Answer answer2 = new Answer("1887");
        Question [] question = new Question[3];

        question [0]  = new Question("В каком году была изобретена кнопка?", answer);
        question [1]  = new Question("В каком году была изобретена кнопка1?", answer1);
        question [2]  = new Question("В каком году была изобретена кнопка2?", answer2);

//        Logic.fillArray(array);
//        int [] ints = Logic.buttonPush(buttons, array);
//        Logic.compare(ints, array);
//        MainManu.mainMenu(buttons, array, question);
//        Logic.helper(array, arrHelp);
//        System.out.println(question[1].questionText);
//        System.out.println(question[1].answer.getAnswerText());
//        Question question1 = Logic.askQustion(question);
//        System.out.println(question1);
        MainManu.mainMenu(array, question);
    }
}
