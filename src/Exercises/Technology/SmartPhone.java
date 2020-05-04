package Exercises.Technology;

public class SmartPhone extends Computer {

    private boolean hasFaceRecognition;

   public SmartPhone(String aBrand, String aModel, int aProductionDate, boolean aHasFaceRecognition) {
       super(aBrand, aModel, aProductionDate);
       hasFaceRecognition = aHasFaceRecognition;
   }

    public boolean getHasFaceRecognition() {
        return hasFaceRecognition;
    }

    public void setHasFaceRecognition(boolean hasFaceRecognition) {
        this.hasFaceRecognition = hasFaceRecognition;
    }

    public String siri(){
        return "Go ahead, I'm listening...";
    }
}
