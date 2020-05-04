package Exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int [] numArray = {1, 1, 2, 3, 5, 8};
        for(int i : numArray){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
        String doctorSeuss = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        String[] seussSplit = doctorSeuss.split(" ");
        String[] sentenceSplit = doctorSeuss.split("\\.");
        System.out.println(Arrays.toString(seussSplit));
        System.out.println(Arrays.toString(sentenceSplit));
    }
}
