package Observer;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    private List<Gardener> gardeners = new ArrayList<>();
    private int state;

    public void add(Gardener g) {
        gardeners.add(g);
    }

    public void execute() {
        for (Gardener gardener : gardeners) {
            gardener.takeCare();
        }
    }
}
