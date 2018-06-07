import java.util.ArrayList;
import java.util.List;

public class Game {
    private String gameName;
    private long gameID;
    private List<Integer> result;
    private List<Device> observers;
    private static Long id = new Long(0);

    public Game(String gameName) {
        this.gameName = gameName;
        this.gameID = id++;
        result = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public String getGameName() {
        return gameName;
    }

    public List<Integer> getResult() {
        return result;
    }

    public void addObserver(Device user) {
        observers.add(user);
    }

    public void removeObserver(Device user) {
        observers.remove(user);
    }

    public void notifyObservers() {
        for (Device usr : observers)
            usr.notifyUser(this, getResult());
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "(" + gameName + " id: " + gameID + ")";
    }
}
