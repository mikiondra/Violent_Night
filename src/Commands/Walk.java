package Commands;

public class Walk implements Command {


    @Override
    public String execute() {
        return "You can walk.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
