package Game;

/**
 * Class for handling player interactions
 */
public class Player {

    private Locations location;
    private Items hands;

    public Player() {
    }

    public void setLocation(Locations location){
      this.location = location;
    }

    public Locations getLocation() {
        return location;
    }

    public Items getHands() {
        return hands;
    }

    public void setHands(Items hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Player{" +
                "location=" + location +
                '}';
    }
}
