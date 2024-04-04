package abstractclassesandabstractmethods.product;

public class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String getDescription() {
        return color +" "+ size +" "+ name;
    }
}