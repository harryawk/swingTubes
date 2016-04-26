/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import WorldOfPaint.*;
import javax.swing.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.util.ArrayList;

/**
 * A class to listen keystroke that pressed by user while the application is running
 * @author Harry Alvin
 */
public class ListenKey extends Thread implements KeyListener {
    private World world;
    private ArrayList<Integer> arrayList;
    private ArrayList<Integer> arrayList2;
    
    /**
     * Listen A key from world
     * @param world the world that its keystroke want to be listened
     */
    public ListenKey(World world)  {
        this.world = world;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    /**
     * An procedure that response when key pressed
     * @param e Keystroke that being pressed
     */
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case VK_UP :
                world.setPlayer1Direction(1);
                break;
            case VK_DOWN :
                world.setPlayer1Direction(5);
                break;
            case VK_LEFT :
                world.setPlayer1Direction(7);
                break;
            case VK_RIGHT :
                world.setPlayer1Direction(3);
                break;
            case VK_W :
                world.setPlayer2Direction(1);
                break;
            case VK_S :
                world.setPlayer2Direction(5);
                break;
            case VK_A :
                world.setPlayer2Direction(7);
                break;
            case VK_D :
                world.setPlayer2Direction(3);
                break;
            default:
               break;
        }
    }

    @Override
    /**
     * An procedure that response when key released
     * @param e Keystroke that is released after being pressed
     */
    public void keyReleased(KeyEvent e) {
        
    }
}
