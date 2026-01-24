package Game;

/**
 * Class for NPC objects
 */
public class Characters {

    private String id;
    private String name;
    private String homeLocation;
    private String talk;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTalk() {
        return talk;
    }

    @Override
    public String toString() {
        return "Game.Characters{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                ", talk='" + talk + '\'' +
                '}';
    }
}
