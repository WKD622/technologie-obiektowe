import java.util.ArrayList;
import java.util.List;

public class User {
    /**
     * niepoprawny camel case dla pól - z dużej litery.
     */
    private DeviceType system;
    private List<Game> subscribedGames = new ArrayList<>();
    private long uniqueID;


    /**
     * notify słowo kluczowe, nie można nadpisać.
     */
    public void notifyUser(Game game){
        System.out.printf("Hello " , uniqueID,". You are notified by ", game, ".");
    }

    public void addGame(Game game){
        subscribedGames.add(game);
    }


}
