import java.awt.image.CropImageFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import com.google.gson.Gson;

public class Map {

   public ArrayList<Locations> locations;
   public ArrayList<Characters> characters;
   public ArrayList<Items> items;


   public static Map loadGameDataFromResources(String resourcePath){
      Gson gson = new Gson();
      try(InputStream is = Main.class.getResourceAsStream(resourcePath)){
          if(is == null){
              throw new IllegalStateException("File not found: " + resourcePath);
          }
          return gson.fromJson(new InputStreamReader(is, StandardCharsets.UTF_8),Map.class);
      }catch (Exception e){
          throw new RuntimeException("Mistake during reading JSON: " + e.getMessage());
      }
   }

   public Locations findLocation(String id){
       for(Locations l : locations){
           if(l.getId().equals(id)){
               return l;
           }
       }
       throw new IllegalArgumentException("Location doesn't exist: " + id);
   }
}
