import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public static void main(String[] argc) {
		
		Checkout pricing = new BasicCheckout();
		pricing.addPrice("Apple", 0.25);
		pricing.addPrice("Orange", 0.6);

		//Apply discount
		pricing = new DiscountValue(pricing, "Apple", 2, 0.25); 
		pricing = new DiscountValue(pricing, "Orange", 3, 0.60);
		
		List<String> shoppingCart = new ArrayList<>();
		shoppingCart.add("Apple");
		shoppingCart.add("Orange");
		shoppingCart.add("Apple");
		shoppingCart.add("Apple");

		//Display calculated price
		System.out.println(pricing.calculateTotal(shoppingCart));
	}
}
