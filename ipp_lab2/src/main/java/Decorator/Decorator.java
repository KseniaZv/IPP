package Decorator;

abstract class Decorator implements Vessel {
    private Vessel vessel;

    public Decorator(Vessel vessel) {
        this.vessel = vessel;
    }

    public void decorate() {
        vessel.decorate();
    }
}