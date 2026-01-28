package Commands;

import Game.Player;

/**
 * Class for picking items
 */
public class Pick implements Command {

    private Player player;

    public Pick(Player player) {
        this.player = player;
    }

    /**
     * Method for picking items
     * @param command for making executes possible
     * @return text informing player about picking item
     */
    @Override
    public String execute(String command) {
        return "Picks a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
