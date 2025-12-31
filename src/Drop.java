public class Drop implements Command{


    @Override
    public String execute() {
        return "Drops a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
