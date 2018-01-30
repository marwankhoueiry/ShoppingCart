import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCheckout implements Checkout {

    private final Map<String, Double> basePrice = new HashMap<>();

    public void addPrice(String item, double price) {
        basePrice.put(item, price);
    }

    @Override
    public double calculateTotal(List<String> shoppingCart) {
        return shoppingCart.stream().mapToDouble(basePrice::get).sum();
    }

}