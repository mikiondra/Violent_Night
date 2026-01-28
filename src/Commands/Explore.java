package Commands;

import Game.Map;

/**
 * Class for exploring game locations
 */
public class Explore implements Command {

    private Map world;

    public Explore(Map world) {
        this.world = world;
    }

    /**
     * Method for exploring locations
     * @param command for making executes possible
     * @return text informing player about exploring game's location
     */
    @Override
    public String execute(String command) {
        return world.findLocation("loc_3").getExplore();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
