import java.util.List;

public class Game {
    private String gameName;
    private long gameID;
    private List<Integer> result;
    private List<User> observers;

    public String getGameName() {
        return gameName;
    }

    public List<Integer> getResult() {
        return result;
    }

    public void addObserver(User user) {
        observers.add(user);
    }

    public void removeObserver(User user){
        observers.remove(user);
    }

    public void notifyObservers() {
        System.out.printf("notify");
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }


}
