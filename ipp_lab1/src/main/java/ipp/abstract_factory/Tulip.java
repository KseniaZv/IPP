package ipp.abstract_factory;

public class Tulip implements BunchOfFlowers {

    Tulip() {
        System.out.println(" Tulip flower is usually cup-shaped with three petals and three sepals");
    }

    @Override
    public void getRoom(String room) {
        System.out.println(" It is good to place a bunch of tulips in " + room + " room");
    }
}
