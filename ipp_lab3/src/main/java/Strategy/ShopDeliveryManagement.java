package Strategy;

public class ShopDeliveryManagement {
    private Delivery delivery;

    public ShopDeliveryManagement(Delivery delivery) {
        this.delivery = delivery;
    }

    public int executeDelivery(int priceOfOrder) {
        return delivery.doPayment(priceOfOrder);
    }
}