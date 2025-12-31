public class End implements Command{


    @Override
    public String execute() {
        return "Ends the game.";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
