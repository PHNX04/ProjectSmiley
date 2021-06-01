/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsmiley;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;


/**
 *
 * @author HuberLu
 */
public class Smiley extends Spielelement{
    
    private BufferedImage image;
    
    private int zustand = 0;
    private int frame = 0;
    
    public boolean heult(){
        if (zustand == 6) {
            
            return true;
        }
        return false;
    }
    
    public void verschlechtern() {
      /*  if (Regentropfen.gibY && Regentropfen.gibX == mrSmiley.gibY && mrSmiley.gibX) {
            zustand ++;
        } */
    }
    
    public void initialsiere(){
        
    }
    
 /*   protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, (ImageObserver) this);
    }
*/
    public void Zeichne(Graphics g) {
        g.drawImage(Smiley[frame].getBufferedImage(), x, y , width, height, null);
    }
}
