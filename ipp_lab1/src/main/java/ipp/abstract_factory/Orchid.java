package ipp.abstract_factory;

public class Orchid implements PotPlants {

    Orchid() {
        System.out.println(" Orchid is the most beautiful and delicate flower");
    }

    @Override
    public void getPlace(String place) {
        System.out.println(" It is good to place orchid at the " + place);
    }

}
