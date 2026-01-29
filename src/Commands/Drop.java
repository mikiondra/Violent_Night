package Commands;

import Game.Map;
import Game.Player;

/**
 * Class for dropping items
 */
public class Drop implements Command {

    private Player player;
    private Map world;

    public Drop(Player player, Map world) {
        this.player = player;
        this.world = world;
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
