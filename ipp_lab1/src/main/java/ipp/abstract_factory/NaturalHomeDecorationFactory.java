package ipp.abstract_factory;

class NaturalHomeDecorationFactory extends HomeDecorationFactory{
    @Override
    public PotPlants createPotPlants() {
        return new Orchid();
    }

    @Override
    public BunchOfFlowers createBunchOfFlowers() {
        return new Iris();
    }
}
