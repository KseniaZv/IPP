package ipp.prototype;

public class ChinaRose extends Rose {

    public ChinaRose()
    {
        this.roseType = "ChinaRose";
    }

    @Override
    public void addRose() {
        System.out.println("ChinaRose added to shop");
    }
}
