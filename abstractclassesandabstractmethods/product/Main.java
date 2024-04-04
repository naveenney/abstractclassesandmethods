package abstractclassesandabstractmethods.product;

public class Main{
public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    ElectronicsProduct electronicsProduct = new ElectronicsProduct("Laptop",12000,"Dell");
    ClothingProduct clothingProduct = new ClothingProduct("T-shirt",20,"M","Blue");
    BookProduct bookProduct = new BookProduct("Java Programming",300,"John Doe");

    cart.addProduct(electronicsProduct);
    cart.addProduct(clothingProduct);
    cart.addProduct(bookProduct);

    cart.displayCart();
}
}