package Commands;

/**
 * Interface for player's actions in the game
 */
public interface Command {

    /**
     * Method which executes player's actions
     * @param command for making executes possible
     * @return text that informs player of their action
     */
    String execute(String command);

    /**
     * Method for ending the game within player's action
     * @return false or true, the majority of commands have false, only End has true, which ends the game
     */
    boolean exit();
}
