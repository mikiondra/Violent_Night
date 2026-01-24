package Commands;

import Game.Player;

/**
 * Class for dropping items
 */
public class Drop implements Command {

    private Player p;

    public Drop(Player p) {
        this.p = p;
    }

    /**
     * Method for dropping item
     * @param command for making executes possible
     * @return text informing player about dropping item
     */
    @Override
    public String execute(String command) {
        return "Drops a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
