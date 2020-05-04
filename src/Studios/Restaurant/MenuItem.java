package Studios.Restaurant;


public class MenuItem {
    private String name;
    private double price = 0.0;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    // setters
    protected void setName(String aName){
        name = aName;
    }
    protected void setPrice(double aPrice){
        price = aPrice;
    }
    protected void setDescription(String aDescription){
        description = aDescription;
    }
    protected void setCategory(String aCategory){
        category = aCategory;
    }
    protected void setIsNew(boolean New){
        isNew = New;
    }
    //getters
    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public boolean getIsNew(){
        return isNew;
    }

}
