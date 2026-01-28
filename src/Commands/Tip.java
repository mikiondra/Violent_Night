package Commands;

import java.util.Random;

/**
 * Class for giving tips to player
 */
public class Tip implements Command {

    /**
     * Method giving tips to player
     * @param command for making executes possible
     * @return text giving tips to player
     */
    @Override
    public String execute(String command) {
        Random rd = new Random();
        int tip = rd.nextInt(0,3);
        switch(tip){
            case 0:
                return "In most adventure games you sometimes just do random things in hopes if will work. The same applies here.";
            case 1:
                return "Game is in two parts: Southwestern is first and northeastern is second. Don't go to second part until you are done in first.";
            case 2:
                return "Shack -> Rod -> Bridge -> Fish -> Dohran -> Potion -> Fidly -> Gold -> Dan -> Boat -> Lake";
            default:
                return "Tips don't work lmao";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
