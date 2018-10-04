package Strategy;

public class OutOfTownDelivery implements Delivery {
    @Override
    public int doPayment(int priceOfOrder) {
        return priceOfOrder + 20;
    }
}
