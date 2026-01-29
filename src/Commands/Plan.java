package Commands;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Class for opening game plan
 */
public class Plan implements Command{

    /**
     * Method for opening plan
     * @param command for making executes possible
     * @return plan
     */
    @Override
    public String execute(String command) {
        try(BufferedReader br = new BufferedReader(new FileReader("Resources/map.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            return "Mistake during reading.";
        }
        return "You looked at your map.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
