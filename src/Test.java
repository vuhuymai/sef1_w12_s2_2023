
public class Test {

	private int _quantity;
	private int _itemPrice;

	double price() {
		// price is base price - quantity discount + shipping return _quantity * _itemPrice -
		// Math.max(0, _quantity - 500) * _itemPrice * 0.05 + Math.min(_quantity * _itemPrice * 0.1, 100.0);
		return computeBasePrice() - computeDiscount() + computeShippingCost();
	}
	
	// one method for price
	private double computeBasePrice() {
		return _quantity * _itemPrice;
	}
	
	// shipping
	private double computeShippingCost() {
		return Math.min(computeBasePrice() * 0.1, 100.0);
	}
	
	// discount
	private double computeDiscount() {
		return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
	}

}




