package State;

public class BudState implements State {
    @Override
    public void doAction(FlowerLifeCycle flowerLifeCycle) {
        System.out.println(" Flower is in Bud State in one month after planting");
        flowerLifeCycle.setState(this);
    }
}

