package State;

public class BloomState implements State{
    @Override
    public void doAction(FlowerLifeCycle flowerLifeCycle) {
        System.out.println(" Flower is in Bloom State approximately eleven days after making a bouquet");
        flowerLifeCycle.setState(this);
    }
}
