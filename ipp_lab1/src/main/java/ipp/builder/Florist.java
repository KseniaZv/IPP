package ipp.builder;

public class Florist {
    private BouquetBuilder bouquetBuilder;

    public void setBouquetBuilder(BouquetBuilder bouquetBuilder) {
        this.bouquetBuilder = bouquetBuilder;
    }

    public Bouquet getBouquet() {
        return bouquetBuilder.getBouquet();
    }

    public void constructBouquet() {
        bouquetBuilder.createNewBouquet();
        bouquetBuilder.buildName();
        bouquetBuilder.buildFlowerComposition();
        bouquetBuilder.buildAmount();
        bouquetBuilder.buildPacking();
        bouquetBuilder.buildCard();
        bouquetBuilder.buildAccesory();
    }
}