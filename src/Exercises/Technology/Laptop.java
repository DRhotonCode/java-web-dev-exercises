package Exercises.Technology;

public class Laptop extends Computer {

    private double screenSize;

    public Laptop(String aBrand, String aModel, int aProductionDate, double aScreenSize){
        super(aBrand, aModel, aProductionDate);
        this.screenSize = aScreenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
