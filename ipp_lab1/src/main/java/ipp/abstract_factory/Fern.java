package ipp.abstract_factory;

public class Fern implements PotPlants {

    Fern() {
        System.out.println(" Fern is plant that does not have flowers");
    }

    @Override
    public void getPlace(String place) {
        System.out.println(" It is good to place fern at the " + place);
    }
}
