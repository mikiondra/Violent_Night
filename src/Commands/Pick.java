package Commands;

public class Pick implements Command {


    @Override
    public String execute() {
        return "Picks a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
