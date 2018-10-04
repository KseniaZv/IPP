package State;

public class FadeState implements State {
    @Override
    public void doAction(FlowerLifeCycle flowerLifeCycle) {
        System.out.println(" Flower is in Fade State - the last step in its life cycle");
        flowerLifeCycle.setState(this);
    }
}
