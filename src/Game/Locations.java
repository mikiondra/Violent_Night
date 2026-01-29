package Game;

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

    public Locations(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExplore() {
        return explore;
    }

    public ArrayList<String> getNeighbours() {
        return neighbours;
    }

    public void setLootTable(ArrayList<String> lootTable) {
        this.lootTable = lootTable;
    }

    public ArrayList<String> getLootTable() {
        return lootTable;
    }

    @Override
    public String toString() {
        return "Game.Locations{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", explore='" + explore + '\'' +
                ", neighbours=" + neighbours +
                ", lootTable=" + lootTable +
                '}';
    }
}
