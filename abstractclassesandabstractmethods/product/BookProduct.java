package abstractclassesandabstractmethods.product;


class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getDescription() {
        return name+"by"+author;
    }
}