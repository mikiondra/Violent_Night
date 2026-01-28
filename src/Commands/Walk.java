package Commands;
import Game.Player;

/**
 *  Class fow walking within game map
 */
public class Walk implements Command {

  private Player player;

    public Walk(Player player) {
        this.player = player;
    }

    /**
     * Method for walking within game map
     * @param command for making executes possible
     * @return text informing player about moving
     */
    @Override
    public String execute(String command) {
        //TODO walking
       
        return "You can walk.";
    }

    @Override
    public boolean exit() {
        return false;
    }

}
