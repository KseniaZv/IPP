package Decorator;

public class BottomDecorator extends Decorator {
    public BottomDecorator(Vessel vessel) {
        super(vessel);
    }

    public void decorate() {
        super.decorate();
        System.out.println(" - Put colorful small stones at the bottom of the vase");
    }
}