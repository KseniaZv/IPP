package ipp.builder;

public class EngagementBouquetBuilder extends BouquetBuilder {

    @Override
    public void buildName() {
        bouquet.setName("Engagement Bouquet");
    }

    @Override
    public void buildFlowerComposition() {
        bouquet.setFlowers("Forget-me-not");
    }

    @Override
    public void buildAmount() {
        bouquet.setAmount(15);
    }

    @Override
    public void buildPacking() {
        bouquet.setPacking("Paper");
    }

    @Override
    public void buildCard() {
        bouquet.setCard("Lovely Engagement Day!");
    }

    @Override
    public void buildAccesory() {
        bouquet.setAccessory("bow");
    }
}
