import ChainOfResponsibility.*;
import Command.*;
import Observer.*;
import State.*;
import Strategy.*;


public class Client {

    public static void main(String[] args) {
        System.out.println("\n***** Welcome To Flower Shop *****\n");

        System.out.println("--- STRATEGY");
        ShopDeliveryManagement deliveryManagement = new ShopDeliveryManagement(new CityDelivery());
        System.out.println(" Total price with City Delivery is : " + deliveryManagement.executeDelivery(100) + "$");
        deliveryManagement = new ShopDeliveryManagement(new OutOfTownDelivery());
        System.out.println(" Total price with Out Of Town Delivery is : " + deliveryManagement.executeDelivery(100) + "$");
        deliveryManagement = new ShopDeliveryManagement(new AbroadDelivery());
        System.out.println(" Total price with Abroad Delivery is : " + deliveryManagement.executeDelivery(100) + "$");
        System.out.println("\n");

        System.out.println("--- STATE");
        FlowerLifeCycle flowerLifeCycle = new FlowerLifeCycle();
        BudState budState = new BudState();
        budState.doAction(flowerLifeCycle);
        BloomState bloomState = new BloomState();
        bloomState.doAction(flowerLifeCycle);
        FadeState fadeState = new FadeState();
        fadeState.doAction(flowerLifeCycle);
        System.out.println("\n");

        System.out.println("--- OBSERVER");
        Greenhouse greenhouse = new Greenhouse();
        greenhouse.add(new BunchOfFlowers());
        greenhouse.add(new PotPlants());
        greenhouse.execute();
        System.out.println("\n");

        System.out.println("--- COMMAND");
        BouquetOfFlowers bouquetOfFlowers = new BouquetOfFlowers();
        Command bouquetOfFlowersCommand = new BouquetOfFlowersCommand(bouquetOfFlowers);
        Decoration decoration = new Decoration();
        Command decorationCommand = new DecorationCommand(decoration);
        BouquetInvoker bouquetInvoker = new BouquetInvoker(bouquetOfFlowersCommand);
        bouquetInvoker.invoke();
        bouquetInvoker.setCommand(decorationCommand);
        bouquetInvoker.invoke();
        System.out.println("\n");

        System.out.println("--- CHAIN OF RESPONSIBILITY");
        Order seller = new Seller("Seller");
        Order florist = new Florist("BouquetFlorist");
        Order packer = new Packer("Decorator");
        Order deliveryMan = new DeliveryMan("DeliveryMan");
        seller.setOrder(florist);
        florist.setOrder(packer);
        packer.setOrder(deliveryMan);
        Bouquet bouquet = new Bouquet("Rose", 11, "pink");
        seller.create(bouquet);
    }
}