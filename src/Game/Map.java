package Game;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.google.gson.Gson;

/**
 * Class for handling world of the game
 */
public class Map {

   public ArrayList<Locations> locations;
   public ArrayList<Characters> characters;
   public ArrayList<Items> items;

    /**
     * Method for reading JSON file
     * @param resourcePath way to JSON file
     * @return saves data from JSON to this class for further operations
     */
   public static Map loadGameDataFromResources(String resourcePath){
      Gson gson = new Gson();
      try(InputStream is = Map.class.getResourceAsStream(resourcePath)){
          if(is == null){
              throw new IllegalStateException("File not found: " + resourcePath);
          }
          return gson.fromJson(new InputStreamReader(is, StandardCharsets.UTF_8),Map.class);
      }catch (Exception e){
          throw new RuntimeException("Mistake during reading JSON: " + e.getMessage());
      }
   }

    /**
     * Method for finding if dedicated location exists
     * @param id String of dedicated location
     * @return correct location
     */
   public Locations findLocation(String id){
       for(Locations l : locations){
           if(l.getId().equals(id)){
               return l;
           }
       }
       throw new IllegalArgumentException("Location doesn't exist: " + id);
   }

    /**
     * Method for finding if dedicated character exists in their homeLocation
     * @param homeLocation String of dedicated location of the character
     * @return correct character
     */
   public Characters findCharacter(String homeLocation){
       for(Characters ch : characters){
           if(ch.getHomeLocation().equals(homeLocation)){
               return ch;
           }
       }
       throw new IllegalArgumentException("Character doesn't exist: " + homeLocation);
   }

}
