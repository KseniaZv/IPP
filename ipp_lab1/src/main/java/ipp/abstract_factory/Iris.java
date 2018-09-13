package ipp.abstract_factory;

public class Iris implements BunchOfFlowers {

    Iris() {
        System.out.println(" Iris is the flower of the Greek goddess Iris who is the messenger of Love");
    }

    @Override
    public void getRoom(String room) {
        System.out.println(" It is good to place a bunch of irises in " + room + " room");
    }
}
