package Decorator;

public class Vase implements Vessel {
    private int width, height;
    private String material;

    public Vase(int width, int height, String material) {
        this.width = width;
        this.height = height;
        this.material = material;
    }

    @Override
    public void decorate() {
        System.out.println(" Vase for flowers: \n" +
                " - height " + height + "\n" +
                " - width " + width + "\n" +
                " - made of " + material + "\n" +
                "\n How can you decorate it?");
    }
}