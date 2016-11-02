package tiles;

import gfx.Assets;

import java.awt.image.BufferedImage;

/**
 * Created by admin on 10/17/2016.
 */
public class RockTile extends Tile {
    public RockTile(int id) {
        super(Assets.stone, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
