package Command;

public class BouquetInvoker {

    Command command;

    public BouquetInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }

}