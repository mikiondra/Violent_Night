package Commands;

import Game.Items;
import Game.Locations;
import Game.Map;
import Game.Player;

/**
 * Class for using items
 */
public class Use implements Command {

    private Player player;
    private Map world;
    private Items item;
    private Locations location;

    public Use(Player player, Map world) {
        this.world = world;
        this.player = player;
    }

    /**
     *
     * @param command for making executes possible
     * @return text informing player about using item
     */
    @Override
    public String execute(String command) {
        //navrh jak by to mohlo fungovat
        if(world.findItem(player.getHands().getId()).equals(new Items("boat")) && world.findLocation(player.getLocation().getId()).equals(new Locations("lake"))){
            return "You completed demo.";
        }else{
            return "Nothing happened.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
