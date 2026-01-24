package Commands;

/**
 * Class for ending game
 */
public class End implements Command {

    /**
     * Method for ending game
     * @return text informing about ending game
     */
    @Override
    public String execute(String command) {
        return "Ends the game.";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
