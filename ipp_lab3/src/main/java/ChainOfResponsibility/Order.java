package ChainOfResponsibility;

public interface Order {

    void setOrder(Order order);

    void create(Bouquet bouquet);

    String getOrder();
}
