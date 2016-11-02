package states;

import tilegame.Game;

import java.awt.*;

/**
 * Created by admin on 10/15/2016.
 */
public abstract class State {
    private static State currentState = null;

    protected Game game;

    public static State getState() {
        return currentState;
    }

    public static void setState(State state) {
        currentState = state;
    }

    public State(Game game){

        this.game = game;
    }

    public abstract void tick();

    public abstract void render(Graphics g);
}
