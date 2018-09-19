package Flyweight;

import java.awt.*;

public class Rose {
    private int x;
    private int y;
    private RoseType type;

    public Rose(int x, int y, RoseType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
