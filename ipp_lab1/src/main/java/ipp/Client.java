package ipp;

import ipp.prototype.RoseTypesStore;
import ipp.singleton.*;
import ipp.factory_method.*;
import ipp.abstract_factory.*;
import ipp.builder.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("\n***** Welcome To Flower Shop *****\n");
        System.out.println("--- SINGLETON");
        FlowerShopWebsite website = FlowerShopWebsite.getInstance();
        website.showWebsite();

        System.out.println("\n--- FACTORY METHOD");
        Flowers flower = FlowerSymbolizationFactory.getSymbolsOfFlowers("rose");
        flower.symbolize("Red", "Love");
        flower = FlowerSymbolizationFactory.getSymbolsOfFlowers("lily");
        flower.symbolize("Pink", "Prosperity");
        flower = FlowerSymbolizationFactory.getSymbolsOfFlowers("chamomile");
        flower.symbolize("White", "Devotion");

        System.out.println("\n--- ABSTRACT FACTORY");
        HomeDecorationFactory factory1 = FlowerDecorationMaker.getFactory("natural");
        BunchOfFlowers bunch1 = factory1.createBunchOfFlowers();
        bunch1.getRoom("dining");
        PotPlants bunch2 = factory1.createPotPlants();
        bunch2.getPlace("window sill");
        HomeDecorationFactory factory2 = FlowerDecorationMaker.getFactory("artificial");
        PotPlants pot1 = factory2.createPotPlants();
        pot1.getPlace("table");
        BunchOfFlowers pot2 = factory2.createBunchOfFlowers();
        pot2.getRoom("bed");

        System.out.println("\n--- BUILDER");
        Florist florist = new Florist();
        BouquetBuilder weddingBouquetBuilder = new WeddingBouquetBuilder();
        BouquetBuilder engagementBouquetBuilder = new EngagementBouquetBuilder();
        BouquetBuilder birthdayBouquetBuilder = new BirthdayBouquetBuilder();

        florist.setBouquetBuilder(weddingBouquetBuilder);
        florist.constructBouquet();
        Bouquet bouquet1 = florist.getBouquet();
        bouquet1.printBouquet();

        florist.setBouquetBuilder(engagementBouquetBuilder);
        florist.constructBouquet();
        Bouquet bouquet2 = florist.getBouquet();
        bouquet2.printBouquet();

        florist.setBouquetBuilder(birthdayBouquetBuilder);
        florist.constructBouquet();
        Bouquet bouquet3 = florist.getBouquet();
        bouquet3.printBouquet();

        System.out.println("--- PROTOTYPE");
        RoseTypesStore.getRose("LaevigataRose").addRose();
        RoseTypesStore.getRose("ChinaRose").addRose();
        RoseTypesStore.getRose("TeaRose").addRose();
        RoseTypesStore.getRose("ChinaRose").addRose();
        RoseTypesStore.getRose("LaevigataRose").addRose();
    }
}