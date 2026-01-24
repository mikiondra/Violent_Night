package Commands;

/**
 * Class for helping the player
 */
public class Help implements Command {

    /**
     * Class for helping the player
     * @param command for making executes possible
     * @return text helping the player
     */
    @Override
    public String execute(String command) {
        return "walk,end,help,tip,pick,drop,use,talk,explore";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
