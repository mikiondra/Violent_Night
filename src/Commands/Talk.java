package Commands;

import Game.Map;
import Game.Player;

/**
 * Class for talking with NPCs
 */
public class Talk implements Command {

    private Map world;
    private Player player;

    public Talk(Map world, Player player) {
        this.world = world;
        this.player = player;
    }

    /**
     * Method for talking with NPCs
     * @param command for making executes possible
     * @return text informing player that their talks with NPC
     **/
    @Override
    public String execute(String command) {
        return world.findCharacter(player.getLocation().getId()).getTalk();
    }

     @Override
     public boolean exit() {
     return false;
     }
}
