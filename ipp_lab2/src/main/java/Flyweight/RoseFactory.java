package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RoseFactory {
    static Map<String, RoseType> roseTypes = new HashMap<>();

    public static RoseType getRoseType(String name, Color color) {
        RoseType result = roseTypes.get(name);
        if (result == null) {
            result = new RoseType(name, color);
            roseTypes.put(name, result);
        }
        return result;
    }
}
