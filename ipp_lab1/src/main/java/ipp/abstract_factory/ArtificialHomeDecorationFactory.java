package ipp.abstract_factory;

class ArtificialHomeDecorationFactory extends HomeDecorationFactory{
    @Override
    public PotPlants createPotPlants() {
        return new Fern();
    }

    @Override
    public BunchOfFlowers createBunchOfFlowers() {
        return new Tulip();
    }
}
