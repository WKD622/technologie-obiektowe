import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program{
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();
        ArrayList<Game> games = new ArrayList<>();
        for(int i=0;i<2;++i)
            games.add(new Game("gra" + i));

        for(int i=0;i<10;++i) {
            Device device = new Device(DeviceType.android);
            device.addGame(games.get(i%2));
            games.get(i%2).addObserver(device);
            devices.add(device);
        }

        Device device = devices.get(0);

        device.addGame(games.get(1));
        games.get(1).addObserver(device);

        for(Game game: games){
            game.setResult(random());
            game.notifyObservers();
        }

        Game game = games.get(0);
        device.removeGame(game);
        game.removeObserver(device);

        game.setResult(random());
        game.notifyObservers();

    }

    public static List<Integer> random(){
        Random generator = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<6;++i)list.add(generator.nextInt(10) + 1);
        return list;
    }
}
