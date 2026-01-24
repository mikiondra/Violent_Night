package Commands;

import Game.Map;

/**
 * Class for talking with NPCs
 */
public class Talk implements Command {

    private Map map;

    public Talk(Map map) {
        this.map = map;
    }

    /**
     * Method for talking with NPCs
     * @param command for making executes possible
     * @return text informing player that their talks with NPC
     */
    @Override
    public String execute(String command) {
        return "Talks with a character.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
