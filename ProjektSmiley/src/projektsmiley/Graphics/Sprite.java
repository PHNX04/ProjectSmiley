/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsmiley.Graphics;

import java.awt.image.BufferedImage;

/**
 *
 * @author Irina
 */
public class Sprite {
    
    public Spritesheet sheet;
    
    public BufferedImage image;
    
    public Sprite(Spritesheet shett, int x, int y) {
        image = sheet.getSprite(x, y);
    }
    
    public BufferedImage getBufferedImage() {
        return image;
    }
}
