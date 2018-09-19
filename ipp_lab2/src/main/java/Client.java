import java.awt.Color;

import Adapter.*;
import Bridge.*;
import Decorator.BottomDecorator;
import Decorator.MaterialDecorator;
import Decorator.Vase;
import Decorator.Vessel;
import Facade.SeedsMaker;
import Flyweight.*;

public class Client {
    static int CANVAS_SIZE = 500;
    static int ROSES_TO_DRAW = 1000000;
    static int ROSE_TYPES = 5;

    public static void main(String[] args) {
        System.out.println("\n***** Welcome To Flower Shop *****\n");

        System.out.println("--- BRIDGE");
        BouquetAccessory wrappingPaper = new WrappingPaper(new YellowColor());
        wrappingPaper.applyColorToAccessory();
        BouquetAccessory ribbon = new Ribbon(new BlueColor());
        ribbon.applyColorToAccessory();
        BouquetAccessory bow = new Bow(new PinkColor());
        bow.applyColorToAccessory();
        System.out.println("\n");

        System.out.println("--- ADAPTER");
        RoseSprinkler roseSprinkler = new RoseSprinkler(1);
        WateringCanAdapter wateringCanAdapter;
        for (int i = 2; i < 6; i++) {
            wateringCanAdapter = new WateringCanAdapter(i);
            wateringCanAdapter.getAmountOfHoles(roseSprinkler);
        }
        System.out.println("\n");

        System.out.println("--- DECORATOR");
        Vessel vessel = new BottomDecorator(new MaterialDecorator(new Vase(20, 30, "glass")));
        vessel.decorate();
        System.out.println("\n");

        System.out.println("--- FACADE");
        SeedsMaker seedsMaker = new SeedsMaker();
        seedsMaker.plantHydrangea();
        seedsMaker.plantPetunia();
        seedsMaker.plantFuchsia();
        System.out.println("\n");

        System.out.println("--- FLYWEIGHT");
        Plantation plantation = new Plantation();
        for (int i = 0; i < Math.floor(ROSES_TO_DRAW / ROSE_TYPES); i++) {
            plantation.plantRose(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Avon Rose", Color.WHITE);
            plantation.plantRose(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Blaze Rose", Color.RED);
            plantation.plantRose(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Queen Elizabeth Rose", Color.PINK);
            plantation.plantRose(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Mollineux Rose", Color.YELLOW);
            plantation.plantRose(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Graham Thomas Rose", Color.ORANGE);
        }
        plantation.setSize(CANVAS_SIZE, CANVAS_SIZE);
        plantation.setVisible(true);

        System.out.println(" " + ROSES_TO_DRAW + " roses drawn");
        System.out.println(" Memory usage:");
        System.out.println(" ROSE size (8 bytes) * " + ROSES_TO_DRAW);
        System.out.println(" + RoseTypes size (~30 bytes) * " + ROSE_TYPES + "");
        System.out.println(" Total: " + ((ROSES_TO_DRAW * 8 + ROSE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((ROSES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}