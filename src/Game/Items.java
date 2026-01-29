package Game;

/**
 * Class for item objects.
 */
public class Items {

    private String id;
    private String name;

    public Items(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Game.Items{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
