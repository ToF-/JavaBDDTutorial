package checkout;

public class Checkout {
    private int itemCount;
    private int itemPrice;

    public void add(Integer itemcount, int bananaprice) {
        itemCount = itemcount;
        itemPrice = bananaprice;
    }
    public long total() {
        return itemPrice * itemCount;
    }
}
