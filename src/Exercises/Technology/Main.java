package Exercises.Technology;

public class Main {
    public static void main(String[] arg){
        Laptop mac = new Laptop("Apple","MacBook Pro", 2006, 13.5);
        SmartPhone iphone = new SmartPhone("Apple","Iphone 12",2020,true);

        System.out.println("This " + iphone.getBrand() + " product is an "
                + iphone.getModel() + " and was created in " + iphone.getProductionDate() + " ID# = " + iphone.getId());
        System.out.println(iphone.siri());
        System.out.println("********************");
        System.out.println("This " + mac.getBrand() + " product is an "
                + mac.getModel() + " and was created in " + mac.getProductionDate() + " ID# = " + mac.getId());
    }
}
