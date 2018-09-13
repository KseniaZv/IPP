package ipp.factory_method;

public class Chamomile implements Flowers{
    @Override
    public void symbolize(String color, String sentiment) {
        System.out.println(" " + color + " Chamomile Symbolize " + sentiment);
    }
}

