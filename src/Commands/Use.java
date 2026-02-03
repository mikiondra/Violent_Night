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
        if(player.getHands() != null){
            if(world.findLocation(player.getLocation().getId()).equals(world.findLocation("bridge")) && world.findItem(player.getHands().getId()).equals(world.findItem("rod"))){
                world.findLocation("bridge").setAvailable(true);
                return "You have fished a big fish.";
            }if(world.findLocation(player.getLocation().getId()).equals(world.findLocation("forest")) && world.findItem(player.getHands().getId()).equals(world.findItem("fish"))){
                world.findLocation("forest").setAvailable(true);
                world.findCharacter("forest").setTalk("Dohran: Thanks my undead friend.");
                player.setHands(null);
                return "Dohran: That's a good fish, I am giving you this potion for your assistance.";
            }if(world.findLocation(player.getLocation().getId()).equals(world.findLocation("hills")) && world.findItem(player.getHands().getId()).equals(world.findItem("potion"))){
                world.findLocation("hills").setAvailable(true);
                world.findCharacter("hills").setTalk("Fidly: Ahhhhhhhhhh, my eyes.");
                player.setHands(null);
                return "Fidly: What you did? " + "You can pick up now 'his' wealth.";
            }if(world.findLocation(player.getLocation().getId()).equals(world.findLocation("port")) && world.findItem(player.getHands().getId()).equals(world.findItem("gold"))){
                world.findLocation("port").setAvailable(true);
                world.findCharacter("port").setTalk("Dan: Enjoy your new boat.");
                player.setHands(null);
                return "Dan: Hm, okay here it is.";
            }if(world.findLocation(player.getLocation().getId()).equals(world.findLocation("lake")) && world.findItem(player.getHands().getId()).equals(world.findItem("boat"))){
                world.findLocation("lake").setEnding(true);
                player.setHands(null);
                return "You reached your end.";
            }else{
                return "You can't use it here.";
            }
        }else{
            return "You have empty hands.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
