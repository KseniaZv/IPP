package Bridge;

public class Ribbon extends BouquetAccessory {

    public Ribbon(Color color) {
        super(color);
    }

    @Override
    public void applyColorToAccessory() {
        System.out.print(" If you want your bouquet to look charming You should use Ribbon of color ");
        color.applyColorToAccessory();
    }
}
