package Flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Plantation extends JFrame {
    private List<Rose> roses = new ArrayList<>();

    public void plantRose(int x, int y, String name, Color color) {
        RoseType type = RoseFactory.getRoseType(name, color);
        Rose tree = new Rose(x, y, type);
        roses.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Rose rose : roses) {
            rose.draw(graphics);
        }
    }
}
