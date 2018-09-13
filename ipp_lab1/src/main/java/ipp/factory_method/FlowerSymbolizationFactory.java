package ipp.factory_method;

public class FlowerSymbolizationFactory {
    public static Flowers getSymbolsOfFlowers(String criteria) {
        if (criteria.equals("rose"))
            return new Rose();
        else if (criteria.equals("lily"))
            return new Lily();
        else if (criteria.equals("chamomile"))
            return new Chamomile();
        return null;
    }
}
