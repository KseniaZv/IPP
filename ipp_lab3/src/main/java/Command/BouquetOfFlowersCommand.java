package Command;

public class BouquetOfFlowersCommand implements Command {

    BouquetOfFlowers bouquetOfFlowers;

    public BouquetOfFlowersCommand(BouquetOfFlowers bouquetOfFlowers) {
        this.bouquetOfFlowers = bouquetOfFlowers;
    }

    @Override
    public void execute() {
        bouquetOfFlowers.makeBouquet();
    }

}
