package states;

import entities.Player;
import gfx.Assets;
import tilegame.Game;

import java.awt.*;

/**
 * Created by admin on 10/15/2016.
 */
public class GameState extends State {

    private Player player;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
    }

    @Override
    public void tick() {
        player.tick();

    }

    @Override
    public void render(Graphics g) {
        player.render(g);
    }
}
