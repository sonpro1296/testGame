package gfx;

import java.awt.image.BufferedImage;

/**
 * Created by admin on 10/15/2016.
 */
public class Assets {
    public static BufferedImage player, dirt, glass, stone, tree;
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/sheet.png"));
        player = sheet.crop(0, 0, 32, 32);
        dirt = sheet.crop(32, 0, 32, 32);
        glass = sheet.crop(64, 0, 32, 32);
        stone = sheet.crop(96, 0, 32, 32);
        tree = sheet.crop(0, 32, 32, 32);

    }
}
