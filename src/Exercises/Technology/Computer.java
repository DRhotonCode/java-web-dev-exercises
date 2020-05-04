package Exercises.Technology;

public class Computer extends AbstractEntity{

    private String brand;
    private String model;
    private int productionDate;
//    private boolean overHeat = false;

    public Computer(String aBrand, String aModel, int aProductionDate){
        this.brand = aBrand;
        this.model = aModel;
        this.productionDate = aProductionDate;
//        this.overHeat = isOverHeat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

}
