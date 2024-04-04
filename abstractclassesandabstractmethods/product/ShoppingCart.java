package abstractclassesandabstractmethods.product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> products;

	public ShoppingCart() {
		products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public double calculateTotalPrice() {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}

	public void displayCart() {
		for (Product product : products) {
			System.out.println(product.getDescription() + product.getPrice());
		}
		System.out.println("Total Price:" + calculateTotalPrice());
	}
}
