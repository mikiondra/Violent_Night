package Commands;

public class Use implements Command {


    @Override
    public String execute() {
        return "Uses a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
