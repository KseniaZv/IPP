package ipp.factory_method;

public class Rose implements Flowers {
    @Override
    public void symbolize(String color, String sentiment) {
        System.out.println(" " + color + " Rose Symbolize " + sentiment);
    }
}
