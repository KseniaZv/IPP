package Bridge;

public class Bow extends BouquetAccessory {

    public Bow(Color color) {
        super(color);
    }

    @Override
    public void applyColorToAccessory() {
        System.out.print(" You can decorate your bouquet with nice Bow of color ");
        color.applyColorToAccessory();
    }
}
