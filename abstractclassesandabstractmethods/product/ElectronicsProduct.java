package abstractclassesandabstractmethods.product;

class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getDescription() {
        return name + " by " + brand;
    }
}