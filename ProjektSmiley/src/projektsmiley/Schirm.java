/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsmiley;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author HuberLu
 */
public class Schirm extends Spielelement{
    
    private BufferedImage image;
    
    public Schirm() {
        try {
            image = ImageIO.read(new File("Schirm.png"));
        } catch (IOException ex) {
            Logger.getLogger(Schirm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void Zeichne(Graphics g) {
        g.drawImage(image, 0, 0, (ImageObserver) this);
    }
        
}
