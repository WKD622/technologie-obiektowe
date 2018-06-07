import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        ArrayList<Device> users = new ArrayList<>();
        ArrayList<Game> games = new ArrayList<>();

        for (int i = 0; i < 2; ++i)
            games.add(new Game("gra" + i));

        for (int i = 0; i < 10; ++i) {
            Device user = new Device(DeviceType.android);
            user.addGame(games.get(i % 2));
            games.get(i % 2).addObserver(user);
            users.add(user);
        }

        for (Game game : games) {
            game.setResult(random());
            game.notifyObservers();
        }
    }

    public static List<Integer> random() {
        Random generator = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; ++i) list.add(generator.nextInt(10) + 1);
        return list;
    }
}
