package Adapter;

public class WateringCanAdapter {
    private final WateringCan wateringCan;

    public WateringCanAdapter(int radius) {
        wateringCan = new WateringCan(radius);
    }

    public void getAmountOfHoles(RoseSprinkler roseSprinkler) {
        int amount = (int) ((2 * wateringCan.getRadius()) * (3 * roseSprinkler.getHoleRadius()) * Math.sqrt(2));
        System.out.println(" Watering Can with hole radius: " + wateringCan.getRadius() +
                " -> Rose Sprinkler with amount of holes: " + amount);
    }
}
