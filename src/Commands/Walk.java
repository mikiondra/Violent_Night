package Commands;
import Game.Locations;
import Game.Map;
import Game.Player;

import java.util.Scanner;

/**
 *  Class fow walking within game map
 */
public class Walk implements Command {

  private Player player;
  private Map world;
  private Locations location;

    public Walk(Player player, Map world, Locations location) {
        this.player = player;
        this.world = world;
        this.location = location;
    }

    /**
     * Method for walking within game map
     * @param command for making executes possible
     * @return text informing player about moving
     */
    @Override
    public String execute(String command) {
        //TODO walking
        Scanner sc = new Scanner(System.in);
        System.out.println("Where are you going?");
        String way = sc.next();
        way = way.trim().toLowerCase();
        if(world.findLocation(player.getLocation().getId()).getNeighbours().contains(way)){
            location = new Locations(way);
            player.setLocation(location);
            return "You walked to: " + world.findLocation(player.getLocation().getId()).getName();
        }else{
            return "You can't go there.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
