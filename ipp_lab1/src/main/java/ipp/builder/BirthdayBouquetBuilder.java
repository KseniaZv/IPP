package ipp.builder;

public class BirthdayBouquetBuilder extends BouquetBuilder {

    @Override
    public void buildName() {
        bouquet.setName("Birthday Bouquet");
    }

    @Override
    public void buildFlowerComposition() {
        bouquet.setFlowers("Camellia");
    }

    @Override
    public void buildAmount() {
        bouquet.setAmount(19);
    }

    @Override
    public void buildPacking() {
        bouquet.setPacking("Cellophane");
    }

    @Override
    public void buildCard() {
        bouquet.setCard("Have A Cool BirthDay!");
    }

    @Override
    public void buildAccesory() {
        bouquet.setAccessory("Ribbon");
    }

}
