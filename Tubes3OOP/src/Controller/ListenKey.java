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
public class ListenKey implements KeyListener {
    private World world;
    private ArrayList<Integer> arrayList;
    
    public ListenKey(World world)  {
        this.world = world;
        arrayList = new ArrayList();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
        case VK_UP :
            arrayList.add(VK_UP);
            break;
        case VK_DOWN :
            arrayList.add(VK_DOWN);
            break;
        case VK_LEFT :
            arrayList.add(VK_LEFT);
            break;
        case VK_RIGHT :
            arrayList.add(VK_RIGHT);
            break;
        case VK_W :
            arrayList.add(VK_W);
            break;
        case VK_S :
            arrayList.add(VK_S);
            break;
        case VK_A :
            arrayList.add(VK_A);
            break;
        case VK_D :
            arrayList.add(VK_D);
            break;            
        default:
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (arrayList.size() > 2) {
            System.out.println("Do nothing"); //Do nothing
        } else if (arrayList.size() <= 2 || arrayList.size() > 0) {
            int i = 0;
            while (arrayList.size() > 0) {
                switch (arrayList.get(i)) {
                    case VK_UP :
                        System.out.print("atas");
                        break;
                    case VK_DOWN :
                        System.out.print("bawah");
                        break;
                    case VK_LEFT :
                        System.out.print("kiri");
                        break;
                    case VK_RIGHT :
                        System.out.print("kanan");
                        break;
                    case VK_W :
                        System.out.print("atas");
                        break;
                    case VK_S :
                        System.out.print("bawah");
                        break;
                    case VK_A :
                        System.out.print("kiri");
                        break;
                    case VK_D :
                        System.out.print("kanan");
                        break;
                    default:
                        break;
                }
                System.out.println();
                arrayList.remove(i);
                if (arrayList.size() < 0) {
                    // Lanjut pengulangan
                } else {
                    break; // arrayList.size() == 0
                }
            }
        } else {
            //Do ntohing
        }
    }

    
}