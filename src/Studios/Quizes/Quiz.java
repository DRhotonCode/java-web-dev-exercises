package Studios.Quizes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner input = new Scanner(System.in);

    private ArrayList<Question> questions;
    private ArrayList<MultipleChoice> possibleChoices;
    private int totalScore;

    public Quiz(ArrayList<Question> someQuestions, ArrayList<MultipleChoice> aPossibleChoices, int aTotalScore) {
        this.questions = someQuestions;
        this.possibleChoices = aPossibleChoices;
        this.totalScore = aTotalScore;
    }
}
