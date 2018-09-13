package ipp.abstract_factory;

public class FlowerDecorationMaker {
    private static HomeDecorationFactory factory = null;

    public static HomeDecorationFactory getFactory(String choice) {
        if (choice.equals("artificial")) {
            factory = new ArtificialHomeDecorationFactory();
        } else if (choice.equals("natural")) {
            factory = new NaturalHomeDecorationFactory();
        }
        return factory;
    }
}
