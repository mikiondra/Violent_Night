package Commands;

import Game.Player;

/**
 * Class for using items
 */
public class Use implements Command {

    private Player p;

    public Use(Player p) {
        this.p = p;
    }

    /**
     *
     * @param command for making executes possible
     * @return text informing player about using item
     */
    @Override
    public String execute(String command) {
        return "Uses a item.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
