package Strategy;

public class AbroadDelivery implements Delivery {
    @Override
    public int doPayment(int priceOfOrder) {
        return priceOfOrder + 150;
    }
}
