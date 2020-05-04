package Exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");

        double length = input.nextDouble();
        System.out.println("What is the width of your rectangle?");

        double width = input.nextDouble();
        System.out.println("The Area of your rectangle is " + (length * width));

        input.close();
    }
}
