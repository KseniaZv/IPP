package Facade;

public class SeedsMaker {
    private Seeds hydrangea;
    private Seeds petunia;
    private Seeds fuchsia;

    public SeedsMaker() {
        hydrangea = new Hydrangea();
        petunia = new Petunia();
        fuchsia = new Fuchsia();
    }

    public void plantHydrangea() {
        hydrangea.plant();
    }

    public void plantPetunia() {
        petunia.plant();
    }

    public void plantFuchsia() {
        fuchsia.plant();
    }
}