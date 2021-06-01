/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektsmiley;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

/**
 *
 * @author HuberLu
 */
public class Steuerung implements KeyListener{
    
    Frame OF = new Frame();
    Timer t = new Timer();
    Regentropfen Rt = new Regentropfen();
    Schirm Sc = new Schirm();
    Smiley Sm = new Smiley();
    
    private int x = 100;

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
                x = x - 5;
                break;
            case KeyEvent.VK_D:
                x = x + 5;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
                x = x;
                break;
            case KeyEvent.VK_D:
                x = x;
        }
    }
     
 /*   public void verarbeiteUhrTick(){
        if (pruefeHerrSmiley == true) {
            t.stop();
            System.out.println("Game Over!");
        }
        
        if (regentropfen == 0) {
            t.stop();
            System.out.println("Du hast gewonnen!");
        }
    } */
    
    private void pruefeHerrSmiley(){
        
    }
    
    private void stoppeSpiel(){
        
    }
    
    public void Zeichne(Graphics g) {
        
            
        Sc.Zeichne(g);
        Sm.Zeichne(g);
    }
}
