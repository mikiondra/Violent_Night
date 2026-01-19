public class Main{
    public static void main(String[] args){

        //zkouska funkci
        Map data = Map.loadGameDataFromResources("/gamedata.json");
        System.out.println("Locations: " + data.locations.size());
        System.out.println("Start lokace: " + data.findLocation("loc_3").getName());

        Console c = new Console();
        c.start();

    }
}