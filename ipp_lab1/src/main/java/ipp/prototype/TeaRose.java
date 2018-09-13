package ipp.prototype;

public class TeaRose extends Rose {

    public TeaRose()
    {
        this.roseType = "TeaRose";
    }

    @Override
    public void addRose() {
        System.out.println("TeaRose added to shop");
    }
}
