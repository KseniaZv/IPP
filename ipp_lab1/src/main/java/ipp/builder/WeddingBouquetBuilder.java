package ipp.builder;

public class WeddingBouquetBuilder extends BouquetBuilder {

    @Override
    public void buildName() {
        bouquet.setName("Wedding Bouquet");
    }

    @Override
    public void buildFlowerComposition() {
        bouquet.setFlowers("Peony");
    }

    @Override
    public void buildAmount() {
        bouquet.setAmount(11);
    }

    @Override
    public void buildPacking() {
        bouquet.setPacking("contexture");
    }

    @Override
    public void buildCard() {
        bouquet.setCard("Happy Wedding Day!");
    }

    @Override
    public void buildAccesory() {
        bouquet.setAccessory("glitter");
    }
}
