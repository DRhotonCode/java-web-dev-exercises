package Exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        double gallons = input.nextDouble();

        System.out.println("You are getting " + (miles/gallons) + "MPG");

        input.close();
    }
}
