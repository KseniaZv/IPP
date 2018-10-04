package ChainOfResponsibility;

public class Bouquet {
    private final String flowerName;
    private final int amount;
    private final String color;

    public Bouquet(String flowerName, int amount, String color) {
        this.flowerName = flowerName;
        this.amount = amount;
        this.color = color;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getAmount() {
        return amount;
    }

    public String getColor() {
        return color;
    }
}
