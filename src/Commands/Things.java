package Commands;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Class for informing player about objects in the game
 */
public class Things implements Command{

    /**
     * Method for showing list of objects
     * @param command for making executes possible
     * @return list of objects in this game
     */
    @Override
    public String execute(String command) {
        try(BufferedReader br = new BufferedReader(new FileReader("Resources/objects.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            return "Mistake during reading.";
        }
        return "You looked at list of objects.";
    }


    @Override
    public boolean exit() {
        return false;
    }
}
