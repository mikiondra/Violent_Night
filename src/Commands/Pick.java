package Commands;

import Game.Items;
import Game.Map;
import Game.Player;
import java.util.Scanner;

/**
 * Class for picking items
 */
public class Pick implements Command {

    private Player player;
    private Map world;
    private Items item;

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
        Scanner sc =new Scanner(System.in);
        if(world.findLocation(player.getLocation().getId()).getLootTable() != null){
            if(player.getHands() == null){
                System.out.println("What item do you want?");
                String thing = sc.next();
                thing = thing.trim().toLowerCase();
                if(world.findLocation(player.getLocation().getId()).getLootTable().contains(thing) && world.findLocation(player.getLocation().getId()).isAvailable()){
                    item = new Items(thing);
                    player.setHands(item);
                    world.findLocation(player.getLocation().getId()).setLootTable(null);
                    return "You picked: " + world.findItem(player.getHands().getId()).getName();
                }else{
                   return "This item isn't here.";
                }
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
