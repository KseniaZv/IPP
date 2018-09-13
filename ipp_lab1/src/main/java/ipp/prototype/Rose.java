package ipp.prototype;

public abstract class Rose implements Cloneable {

    protected String roseType;

    public abstract void addRose();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
