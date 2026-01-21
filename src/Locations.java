import java.util.ArrayList;

/**
 * Class for locations objects
 */
public class Locations {

    private String id;
    private String name;
    private String explore;
    private ArrayList<String> neighbours;
    private ArrayList<String> lootTable;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", explore='" + explore + '\'' +
                ", neighbours=" + neighbours +
                ", lootTable=" + lootTable +
                '}';
    }
}
