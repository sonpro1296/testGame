package tiles;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by admin on 10/17/2016.
 */
public class Tile {

    public static final int TILEWIDTH = 32,
                            TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;
    public Tile(BufferedImage texture, int id){
        this.id = id;
        this.texture = texture;
    }
    public void tick(){
    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid(){
        return false;
    }
    public int getId(){
        return id;
    }
}
