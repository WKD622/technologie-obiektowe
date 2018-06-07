import java.util.ArrayList;
import java.util.List;

public class User {

    private DeviceType system;
    private List<Game> subscribedGames = new ArrayList<>();
    private long uniqueID;


    public void notifyUser(Game game) {
        System.out.println("Hello " + uniqueID + ". You are notified by " + game.toString() + ".");
    }

    public void addGame(Game game) {
        subscribedGames.add(game);
    }


}
