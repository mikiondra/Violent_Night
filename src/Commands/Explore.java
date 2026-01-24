package Commands;

import Game.Map;

/**
 * Class for exploring game locations
 */
public class Explore implements Command {

    private Map map;

    public Explore(Map map) {
        this.map = map;
    }

    /**
     * Method for exploring locations
     * @param command for making executes possible
     * @return text informing player about exploring game's location
     */
    @Override
    public String execute(String command) {
        return "Explores a location.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
