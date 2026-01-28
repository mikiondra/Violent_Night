package Commands;

import Game.Map;

/**
 * Class for talking with NPCs
 */
public class Talk implements Command {

    private Map world;

    public Talk(Map world) {
        this.world = world;
    }

    /**
     * Method for talking with NPCs
     * @param command for making executes possible
     * @return text informing player that their talks with NPC
     **/
    @Override
    public String execute(String command) {
        return world.findCharacter("loc_0").getTalk();
    }

     @Override
     public boolean exit() {
     return false;
     }
}
