package checkout;

public class Checkout {
    private double itemCount;
    private double itemPrice;
    private double totalPrice;

    public void add(Integer itemCount, double itemPrice) {
        totalPrice += itemPrice * itemCount;
    }
    public double total() {
        return totalPrice;
    }
}
