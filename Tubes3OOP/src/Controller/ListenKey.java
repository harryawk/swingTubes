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
    
    public ListenKey(World world)  {
        this.world = world;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
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
            arrayList2.add(VK_W);
            break;
        case VK_S :
            arrayList2.add(VK_S);
            break;
        case VK_A :
            arrayList2.add(VK_A);
            break;
        case VK_D :
            arrayList2.add(VK_D);
            break;            
        default:
            break;
        }
        if (arrayList.size() > 1 && arrayList2.size() > 1) {
            keyReleased(e);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*if (arrayList.size() > 2) {
            arrayList.clear();
            System.out.println("Do Nothing"); //Do nothing
        } else if (arrayList.size() <= 2 || arrayList.size() > 0) {*/
            int i = 0;
            int j = 0;
            while (arrayList.size() > 0 && arrayList2.size() > 0) {
                switch (arrayList.get(i)) {
                    case VK_UP :
                        if (arrayList.size() == 1) {
                            world.setPlayer1Direction(1);
                        } else {
                            if (arrayList.get(i+1) != VK_LEFT && 
                                arrayList.get(i+1) != VK_RIGHT &&
                                arrayList.get(i+1) != VK_DOWN) {
                                world.setPlayer1Direction(1);
                            } else if (arrayList.get(i+1) == VK_LEFT) {
                                world.setPlayer1Direction(8);
                                i++;
                                arrayList.remove(i);
                                i--;
                            } else if (arrayList.get(i+1) == VK_RIGHT) {
                                world.setPlayer1Direction(2);
                                i++;
                                arrayList.remove(i);
                                i--;
                            }
                        }
                        break;
                    case VK_DOWN :
                        if (arrayList.size() == 1) {
                            world.setPlayer1Direction(5);
                        } else {
                            if (arrayList.get(i+1) != VK_LEFT && 
                                    arrayList.get(i+1) != VK_RIGHT &&
                                    arrayList.get(i+1) != VK_UP) {
                                world.setPlayer1Direction(5);
                            } else if (arrayList.get(i+1) == VK_LEFT) {
                                world.setPlayer1Direction(6);
                                i++;
                                arrayList.remove(i);
                                i--;
                            } else if (arrayList.get(i+1) == VK_RIGHT) {
                                world.setPlayer1Direction(4);
                                i++;
                                arrayList.remove(i);
                                i--;
                            }
                        }
                        break;
                    case VK_LEFT :
                        world.setPlayer1Direction(7);
                        break;
                    case VK_RIGHT :
                        world.setPlayer1Direction(3);
                        break;
                    default:
                       break;
                }/*
                switch (arrayList2.get(j)) {
                    case VK_W :
                    if (arrayList2.size() == 1) {
                        world.setPlayer2Direction(1);
                    }
                    else {
                        if (arrayList2.get(j+1) != VK_A && 
                                arrayList2.get(j+1) != VK_D &&
                                arrayList2.get(j+1) != VK_S) {
                            world.setPlayer2Direction(1);
                        } else if (arrayList2.get(j+1) == VK_A) {
                            world.setPlayer2Direction(8);
                            i++;
                            arrayList2.remove(j);
                            i--;
                        } else if (arrayList2.get(j+1) == VK_D) {
                            world.setPlayer2Direction(2);
                            i++;
                            arrayList2.remove(j);
                            i--;
                        }
                    }
                    break;
                    case VK_S :
                        if (arrayList2.size() == 1) {
                            world.setPlayer2Direction(5);
                        } else {
                            if (arrayList2.get(j+1) != VK_A && 
                                    arrayList2.get(j+1) != VK_D &&
                                    arrayList2.get(j+1) != VK_W) {
                                world.setPlayer2Direction(5);
                            } else if (arrayList2.get(j+1) == VK_A) {
                                world.setPlayer2Direction(6);
                                i++;
                                arrayList2.remove(j);
                                i--;
                            } else if (arrayList2.get(j+1) == VK_D) {
                                world.setPlayer2Direction(4);
                                i++;
                                arrayList2.remove(j);
                                i--;
                            }
                        }
                        break;
                    case VK_A :
                        world.setPlayer2Direction(7);
                        break;
                    case VK_D :
                        world.setPlayer2Direction(3);
                        break;
                    default:
                        break;
                }*/
                System.out.println();
                arrayList.remove(i);
//                arrayList2.remove(i);
                if (arrayList.size() < 0) {
                    // Lanjut pengulangan
                } else {
                    break; // arrayList.size() == 0
                }
            }
        /*} else {
            //Do ntohing
        }*/
    }
}
