package Commands;

public class Talk implements Command {


    @Override
    public String execute() {
        return "Talks with a character.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
