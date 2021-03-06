/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsmiley.Graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author lucas
 */
public class Spritesheet {
    
    private BufferedImage sheet;
    
    public Spritesheet(String path) {
        try {
            sheet = ImageIO.read(getClass().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public BufferedImage getSprite(int x, int y) {
        return sheet.getSubimage(x*32-32, y*32-32, 32, 32);
    }
}
