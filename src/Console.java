
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Console {

    private Scanner sc;
    private HashMap<String,Command> commands;
    private boolean isExit;

    public Console() {
        this.sc = new Scanner(System.in);
        this.commands = new HashMap<>();
        this.isExit = false;
    }

    public void initialization(){
        commands.put("walk",new Walk());
        commands.put("end",new End());
        commands.put("help",new Help());
        commands.put("tip",new Tip());
        commands.put("pick",new Pick());
        commands.put("drop",new Drop());
        commands.put("use",new Use());
        commands.put("talk",new Talk());
        commands.put("explore",new Explore());
    }

    public void execute(){
        System.out.println("Type 'help', to see all available commands.");
        String command = sc.next();
        command = command.trim().toLowerCase();
        if (commands.containsKey(command)){
            System.out.println(">> " + commands.get(command).execute());
            isExit = commands.get(command).exit();
        }else{
            System.out.println("Wrong command.");
        }
    }

    public String prologue(){
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("prologue.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                list.add(line);
            }
            return list.toString();
        }catch (Exception e){
            return "Mistake during reading.";
        }
    }

    public String ending0(){
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("Ending0.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                list.add(line);
            }
            return list.toString();
        }catch (Exception e){
            return "Mistake during reading.";
        }
    }

    public void start(){
        initialization();
        prologue();
        do{
           execute();
        }while(!isExit);
        if(isExit){
            ending0();
        }
    }
}