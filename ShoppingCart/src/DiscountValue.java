import java.util.Collections;
import java.util.List;

public class DiscountValue implements Checkout {

    private final Checkout baseCheckout;
    private final String discountedItem;
    private final int minimumAmount;
    private final double discountValue;

    public DiscountValue(Checkout base, String item, int min, double discount) {
         this.baseCheckout = base;
         this.discountedItem = item;
         this.minimumAmount = min;
         this.discountValue = discount;
    }

    @Override
    public double calculateTotal(List<String> shoppingCart) {
        int count = Collections.frequency(shoppingCart, discountedItem);
        double deduction = (count / minimumAmount) * discountValue;
        return baseCheckout.calculateTotal(shoppingCart) - deduction;
    }

	@Override
	public void addPrice(String string, double d) {
		baseCheckout.addPrice(string, d);
	}
}