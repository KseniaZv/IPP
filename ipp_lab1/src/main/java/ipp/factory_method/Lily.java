package ipp.factory_method;

public class Lily implements Flowers{
    @Override
    public void symbolize(String color, String sentiment) {
        System.out.println(" " + color + " Lily Symbolize " + sentiment);
    }
}
