package Decorator;

public class MaterialDecorator  extends Decorator {
    public MaterialDecorator(Vessel vessel) {
        super(vessel);
    }
    public void decorate() {
        super.decorate();
        System.out.println(" - Draw a modern pattern with acrylic paint");
    }
}