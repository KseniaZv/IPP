package Command;

public class DecorationCommand implements Command {

    Decoration decoration;

    public DecorationCommand(Decoration decoration) {
        this.decoration = decoration;
    }

    @Override
    public void execute() {
        decoration.makeDecoration();
    }

}
