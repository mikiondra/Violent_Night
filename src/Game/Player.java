package Game;

/**
 * Class for handling player interactions
 */
public class Player {

    private Locations location;

    public void setLocation(Locations location){
      this.location = location;
    }

    public Locations getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Player{" +
                "location=" + location +
                '}';
    }
}
