import Game.Console;
import Game.Locations;
import Game.Map;

public class Main{
    public static void main(String[] args){

    //zkouska funkci
        Map data = Map.loadGameDataFromResources("/gamedata.json");
        System.out.println("Game.Locations: " + data.locations.size());
        System.out.println("Game.Characters: " + data.characters.size());
        System.out.println("Game.Items: " + data.items.size());
        System.out.println(data.findLocation("shack").getLootTable());

    Console c = new Console();
    c.start();
  }
}