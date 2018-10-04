package ChainOfResponsibility;

public class Florist implements Order {
    private Order order;
    private String performerName;

    public Florist(String performerName) {
        this.performerName = performerName;
    }

    @Override
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void create(Bouquet bouquet) {
        System.out.println(" " + performerName + " forwards request to " + order.getOrder());
        order.create(bouquet);
    }

    @Override
    public String getOrder() {
        return performerName;
    }
}
