package tilegame;

import display.*;

/**
 * Created by admin on 10/10/2016.
 */
public class Launcher {
    public static void main(String[] args) {
        Game game = new Game("Title!", 400, 400);
        game.start();
    }
}
