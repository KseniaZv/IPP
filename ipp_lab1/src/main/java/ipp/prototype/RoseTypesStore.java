package ipp.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoseTypesStore {

    private static Map<String, Rose> roseMap = new HashMap<String, Rose>();

    static {
        roseMap.put("LaevigataRose", new LaevigataRose());
        roseMap.put("ChinaRose", new ChinaRose());
        roseMap.put("TeaRose", new TeaRose());
    }

    public static Rose getRose(String roseName) {
        return (Rose) roseMap.get(roseName).clone();
    }
}