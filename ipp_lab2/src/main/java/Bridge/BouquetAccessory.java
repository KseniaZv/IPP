package Bridge;

public abstract class BouquetAccessory {
    //Composition - implementor
    protected Color color;

    public BouquetAccessory(Color color) {
        this.color = color;
    }

    abstract public void applyColorToAccessory();
}