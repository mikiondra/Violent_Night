package Commands;

public class Tip implements Command {


    @Override
    public String execute() {
        return "Helps with actual problem.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
