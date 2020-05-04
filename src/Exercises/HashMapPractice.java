package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Double> IDs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID#: ");
            newID = input.nextLine();

            if (!newID.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                IDs.put(newID, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newID.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> ID : IDs.entrySet()) {
            System.out.println(ID.getKey() + " (" + ID.getValue() + ")");
            sum += ID.getValue();
        }

        double avg = sum / IDs.size();
        System.out.println("Average grade: " + avg);
    }
}
