package ipp.builder;

public class Bouquet {
    private String name;
    private String flowers;
    private int amount;
    private String packing;
    private String card;
    private String accessory;

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowers(String flowers) {
        this.flowers = flowers;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getFlowers() {
        return flowers;
    }

    public int getAmount() {
        return amount;
    }

    public String getPacking() {
        return packing;
    }

    public String getCard() {
        return card;
    }

    public String getAccesory() {
        return accessory;
    }

    public String getName() {
        return name;
    }

    public void printBouquet() {
        System.out.println(" *** " + name + "***\n" +
                " Flowers: " + flowers + "\n" +
                " Amount: " + amount + "\n" +
                " Packing: " + packing + "\n" +
                " Card: " + card + "\n" +
                " Accessory: " + accessory + "\n");
    }
}
