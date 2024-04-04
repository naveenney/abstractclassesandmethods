package abstractclassesandabstractmethods.product;

abstract class Product {
    protected String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }
}