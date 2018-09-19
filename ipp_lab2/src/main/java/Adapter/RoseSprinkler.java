package Adapter;

public class RoseSprinkler {
    private final int holeRadius;

    public RoseSprinkler(int holeRadius) {
        this.holeRadius = holeRadius;
        System.out.println(" Watering Can helps to water outdoors plants");
        System.out.println(" Use Rose Sprinkler in order to spray water to indoor flowers");
        System.out.println(" You can buy an adapter for Water Can -> Rose Sprinkler in our shop");
        System.out.println(" You can choose different adapters:");
    }

    public int getHoleRadius() {
        return holeRadius;
    }
}
