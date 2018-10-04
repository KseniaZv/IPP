package Strategy;

public class CityDelivery implements Delivery {
    @Override
    public int doPayment(int priceOfOrder) {
        return priceOfOrder + 5;
    }
}
