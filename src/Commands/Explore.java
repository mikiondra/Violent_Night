package Commands;

public class Explore implements Command {


    @Override
    public String execute() {
        return "Explores a location.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
