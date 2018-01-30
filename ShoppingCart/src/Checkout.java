import java.util.List;

public interface Checkout {
    double calculateTotal(List<String> shoppingCart);

	void addPrice(String string, double d);

}