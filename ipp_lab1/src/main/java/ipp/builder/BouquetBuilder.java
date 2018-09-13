package ipp.builder;

public abstract class BouquetBuilder {
    protected Bouquet bouquet;

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void createNewBouquet() {
        bouquet = new Bouquet();
    }

    public abstract void buildName();

    public abstract void buildFlowerComposition();

    public abstract void buildAmount();

    public abstract void buildPacking();

    public abstract void buildCard();

    public abstract void buildAccesory();

}