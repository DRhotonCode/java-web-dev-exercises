package Studios.Quizes;

import java.util.Scanner;
import java.util.ArrayList;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswers;

    public MultipleChoice(int points, String question, int someCorrectAnswers, ArrayList<String> somePossibleAnswers){
        super(question, points);
        this.correctAnswers = someCorrectAnswers;
        this.possibleAnswers = somePossibleAnswers;
        setPoints(1);
    }

    @Override
    public int getAnswers() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter the number corresponding to the answer: ");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrect(result)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void displayAnswers() {
        for(int i=0; i < possibleAnswers.size(); i++){
            System.out.println(i +" : " + possibleAnswers.get(i));
        }
    }

    public boolean isCorrect (int possibleAnswer){
        if (possibleAnswer == correctAnswers){
            return true;
        } else {
            return false;
        }
    }
}
