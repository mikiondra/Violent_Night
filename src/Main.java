import Game.Console;
import Game.Map;

public class Main{
    public static void main(String[] args){

        //zkouska funkci
        Map data = Map.loadGameDataFromResources("/gamedata.json");
        System.out.println("Game.Locations: " + data.locations.size());
        System.out.println("Game.Locations: " + data.characters.size());
        System.out.println("Game.Locations: " + data.items.size());
        System.out.println("Game.Locations: " + data.locations.size());
        System.out.println("Start lokace: " + data.findLocation("loc_3").getName());

        Console c = new Console();
        c.start();

    }
}