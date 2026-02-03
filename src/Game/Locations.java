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
    private boolean available;
    private boolean ending;

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isEnding() {
        return ending;
    }

    public void setEnding(boolean ending) {
        this.ending = ending;
    }

    public ArrayList<String> getLootTable() {
        return lootTable;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", explore='" + explore + '\'' +
                ", neighbours=" + neighbours +
                ", lootTable=" + lootTable +
                ", available=" + available +
                '}';
    }
}
