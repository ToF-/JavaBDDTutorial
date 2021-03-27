package checkout;

public class Checkout {
    private int itemCount;
    private int itemPrice;
    private int totalPrice;

    public void add(Integer itemCount, int itemPrice) {
        totalPrice += itemPrice * itemCount;
    }
    public long total() {
        return totalPrice;
    }
}
