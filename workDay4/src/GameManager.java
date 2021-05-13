public class GameManager implements GameService {

    @Override
    public void add(Game game) {
        System.out.println("oyun eklendi: "+ game.getName());
    }

    @Override
    public void delete(Game game) {

    }

    @Override
    public void update(Game game) {

    }
}
