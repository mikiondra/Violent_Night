package Commands;

import Game.Items;
import Game.Locations;
import Game.Map;
import Game.Player;

/**
 * Class for picking items
 */
public class Pick implements Command {

    private Player player;
    private Map world;
    private Items item;
    private Locations location;

    public Pick(Player player, Map world) {
        this.player = player;
        this.world = world;
    }

    /**
     * Method for picking items
     * @param command for making executes possible
     * @return text informing player about picking item
     */
    @Override
    public String execute(String command) {
        if(world.findLocation(player.getLocation().getId()).getLootTable() != null){
            if(player.getHands() == null){
                return "You picked item";
            }else{
                return "You have full hands.";
            }
        }else{
            return "Nothing is here.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
