package Commands;

import Game.Locations;
import Game.Map;
import Game.Player;

/**
 * Class for exploring game locations
 */
public class Explore implements Command {

    private Map world;
    private Player player;

    public Explore(Map world, Player player) {
        this.world = world;
        this.player = player;
    }

    /**
     * Method for exploring locations
     * @param command for making executes possible
     * @return text informing player about exploring game's location
     */
    @Override
    public String execute(String command) {
        return world.findLocation(player.getLocation().getId()).getExplore();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
