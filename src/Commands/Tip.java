package Commands;

/**
 * Class for giving tips to player
 */
public class Tip implements Command {

    /**
     * Method giving tips to player
     * @param command for making executes possible
     * @return text giving tips to player
     */
    @Override
    public String execute(String command) {
        return "Helps with actual problem.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
