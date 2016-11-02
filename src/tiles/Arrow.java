package tiles;

import javax.swing.*;
import java.awt.*;

/**
 * Created by admin on 10/18/2016.
 */
public class Arrow {
    protected ImageIcon texture = new ImageIcon("/arrow.png");
    protected int direction;
    protected int x, y, width, height;
    public Arrow(ImageIcon texture, int direction, int x, int y, int width, int height){
        this.texture = texture;
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void tick(){

    }

    public void render(ImageIcon g, int x, int y){
        
    }

}
