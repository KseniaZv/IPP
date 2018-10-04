package State;

public class FlowerLifeCycle {
    private State state;

    public FlowerLifeCycle() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}