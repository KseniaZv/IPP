package Bridge;

public class WrappingPaper extends BouquetAccessory {

    public WrappingPaper(Color color) {
        super(color);
    }

    @Override
    public void applyColorToAccessory() {
        System.out.print(" It is very beautiful to present a bouquet of flowers in Wrapping Paper of color ");
        color.applyColorToAccessory();
    }
}
