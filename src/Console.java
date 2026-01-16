import Commands.*;

import java.io.BufferedReader;
import java.io.FileReader;
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
        String command =  sc.next();
        command = command.trim().toLowerCase();
        if (commands.containsKey(command)){
            System.out.println(">> " + commands.get(command).execute());
            isExit = commands.get(command).exit();
        }else{
            System.out.println(">> Wrong command.");
        }
    }

    public void prologue(){
        try(BufferedReader br = new BufferedReader(new FileReader("Resources/prologue.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Mistake during reading.");
        }
    }

    public void ending0(){
        try(BufferedReader br = new BufferedReader(new FileReader("Resources/Ending0.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Mistake during reading.");
        }
    }

    public void ending1(){
        try(BufferedReader br = new BufferedReader(new FileReader("Resources/Ending1.txt"))){
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Mistake during reading.");
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