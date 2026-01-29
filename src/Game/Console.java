package Game;

import Commands.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class for running the game
 */
public class Console {

    private Scanner sc;
    private HashMap<String,Command> commands;
    private boolean isExit;
    private Map world;
    private Player player;
    private Locations location;

    public Console() {
        this.sc = new Scanner(System.in);
        this.commands = new HashMap<>();
        this.isExit = false;
    }

    /**
     * Method for loading needed objects for the game
     */
    public void initialization(){
        commands = new HashMap<>();
        player = new Player();
        //starting location
        location = new Locations("cemetery");
        world = Map.loadGameDataFromResources("/gamedata.json");
        player.setLocation(location);
        commands.put("walk",new Walk(player, world, location));
        commands.put("end",new End());
        commands.put("help",new Help());
        commands.put("tip",new Tip());
        commands.put("pick",new Pick(player));
        commands.put("drop",new Drop(player));
        commands.put("use",new Use(player));
        commands.put("talk",new Talk(world,player));
        commands.put("explore",new Explore(world,player));
        commands.put("map",new Plan());
    }

    /**
     * Method where are commands executed
     */
    public void execute(){
        System.out.println(">> " + "What are you gonna do? If you don't know, type 'help', to see all available commands.");
        String command =  sc.next();
        command = command.trim().toLowerCase();
        if (commands.containsKey(command)){
            System.out.println();
            System.out.println(">> " + commands.get(command).execute(command));
            System.out.println();
            isExit = commands.get(command).exit();
        }else{
            System.out.println(">> Wrong command.");
        }
    }

    /**
     * Method for reading prologue.txt
     */
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

    /**
     * Method for reading ending0.txt
     */
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

    /**
     * Method for reading ending1.txt
     */
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

    /**
     * Method where the game runs
     */
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