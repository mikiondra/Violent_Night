package Commands;

import Game.Player;

/**
 * Class for dropping items
 */
public class Drop implements Command {

    private Player player;

    public Drop(Player player) {
        this.player = player;
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
