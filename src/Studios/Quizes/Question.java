package Studios.Quizes;

import java.util.Scanner;

public abstract class Question {

    Scanner input = new Scanner(System.in);

    private String question;
    private int points;

    public Question(String aQuestion, int aPoints) {
        this.question = aQuestion;
        this.points = aPoints;
    }

    public void displayQuestion(){System.out.println(question);}

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public abstract int getAnswers();

    public abstract void displayAnswers();

}
