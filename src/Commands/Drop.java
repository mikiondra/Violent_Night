package Commands;

import Game.Items;
import Game.Map;
import Game.Player;

import java.util.Scanner;

/**
 * Class for dropping items
 */
public class Drop implements Command {

    private Player player;
    private Map world;
    private Items item;

    public Drop(Player player, Map world) {
        this.player = player;
        this.world = world;
    }

    /**
     * Method for dropping item
     * @param command for making executes possible
     * @return text informing player about dropping item
     */
    @Override
    public String execute(String command) {
        Scanner sc = new Scanner(System.in);
        if(player.getHands() != null){
            System.out.println("Are you sure?");
            System.out.println("Each item you can find only once.");
            item = player.getHands();
            String answer = sc.next();
            answer = answer.trim().toLowerCase();
            switch (answer){
                case "yes":
                    player.setHands(null);
                    return "You lost: " + world.findItem(item.getId()).getName();
                case "no":
                    return "You decided to still have that item: " + world.findItem(item.getId()).getName();
                default:
                    return "You didn't decide.";
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
