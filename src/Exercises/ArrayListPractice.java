package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] arg){
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(15,14,25,36,12,1,2,4,9,10));
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("Dave","dog","words","quits"));
        Scanner input = new Scanner(System.in);


        System.out.println(sumEven(numList));

        System.out.println("Enter word length:");
        int length = input.nextInt();

        input.close();

        printFiveLetterWords(wordList, length);

    }

    public static int sumEven(ArrayList<Integer> arr){
        int sum = 0;

        for(int i : arr){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> arr, int length){
        for(String word : arr){
            if(word.length() == length){
                System.out.println(word);
            }
        }
    }

}
