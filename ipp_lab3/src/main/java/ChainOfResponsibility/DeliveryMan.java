package ChainOfResponsibility;

public class DeliveryMan implements Order {
    private Order order;
    private String performerName;

    public DeliveryMan(String performerName) {
        this.performerName = performerName;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void create(Bouquet bouquet) {
            System.out.println(" Get bouquet by " + performerName);
    }

    @Override
    public String getOrder() {
        return performerName;
    }
}
