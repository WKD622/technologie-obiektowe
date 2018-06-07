import java.util.ArrayList;
import java.util.List;

public class User {

    private DeviceType system;
    private List<Game> subscribedGames;
    private long uniqueID;
    private static Long id = new Long(0);

    public List<Game> getSubscribedGames() {
        return subscribedGames;
    }

    public User(DeviceType system) {
        this.system = system;
        this.uniqueID = id++;
        subscribedGames = new ArrayList<>();
    }

    void notifyUser(Game game) {
        System.out.println("Hello user " + uniqueID + ". You are notified by game" + game + ".");
    }

    public void addGame(Game game) {
        subscribedGames.add(game);
    }

    @Override
    public String toString() {
        return "I'm " + uniqueID + "running " + system + ".";
    }
}
