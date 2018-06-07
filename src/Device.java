import java.util.ArrayList;
import java.util.List;

public class Device {

    private DeviceType system;
    private List<Game> subscribedGames;
    private long uniqueID;
    private static long id;

    public List<Game> getSubscribedGames() {
        return subscribedGames;
    }

    public Device(DeviceType system) {
        this.system = system;
        this.uniqueID = id++;
        subscribedGames = new ArrayList<>();
    }

    void notifyUser(Game game, List<Integer> result) {
        System.out.println("Hello " + uniqueID + ". You are notified by " + game + ". Result: " + result);
    }

    public void addGame(Game game) {
        subscribedGames.add(game);
    }

    public void removeGame(Game game) {
        subscribedGames.remove(game);
    }

    @Override
    public String toString() {
        return "I'm " + uniqueID + "running " + system + ".";
    }
}
