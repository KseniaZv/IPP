package ipp.singleton;

public class FlowerShopWebsite {

    private static FlowerShopWebsite website = new FlowerShopWebsite();

    // A private Constructor prevents any other class from instantiating.
    private FlowerShopWebsite() {
    }

    // Static 'instance' method
    public static FlowerShopWebsite getInstance() {
        return website;
    }

    // Other methods protected by singleton-ness
    public static void showWebsite() {
        System.out.println(" Flowers for Everybody => www.flowershop.com ");
    }
}