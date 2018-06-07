import java.util.ArrayList;
import java.util.List;

public class User {

    private DeviceType system;
    private List<Game> subscribedGames;
    private long uniqueID;


    public User(DeviceType system, long uniqueID){
        this.system = system;
        this.uniqueID = uniqueID;
        subscribedGames = new ArrayList<>();
    }

    void notifyUser(Game game) {
        System.out.println("Hello " + uniqueID + ". You are notified by " + game + ".");
    }

    public void addGame(Game game) {
        subscribedGames.add(game);
    }

    @Override
    public String toString() {
        return "I'm " +uniqueID + "running " + system + ".";
    }
}
