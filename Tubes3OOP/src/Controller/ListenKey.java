/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import WorldOfPaint.*;
import Movement.Point;
import javax.swing.*;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.util.ArrayList;

/**
 * A class to listen keystroke that pressed by user while the application is running
 * @author Harry Alvin
 */
public class ListenKey implements KeyListener {
    private World world;
    private ArrayList<Integer> arrayList;
    
    public ListenKey(World world)  {
        this.world = world;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
        case VK_DOWN :
            System.out.println("Bawah");
            break;
        default:
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    
}
