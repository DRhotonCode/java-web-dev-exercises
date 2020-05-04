package Studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double r = input.nextDouble();

        double circleArea = (Circle.getArea(r));
        System.out.println("The area of a circle of radius " + r + " is: " + (circleArea));

        input.close();
    }
}
