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
    private ArrayList<Integer> arrayList2;
    private Thread t1,t2;
    private boolean wBef, sBef, dBef, aBef, upBef, downBef, leftBef, rightBef;
    
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
        System.out.println(e.paramString());
    }

    @Override
    /**
     * An procedure that response when key pressed
     * @param e Keystroke that being pressed
     */
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case VK_UP :
                arrayList.add(VK_UP);
                upBef = true;
                break;
            case VK_DOWN :
                arrayList.add(VK_DOWN);
                downBef = true;
                break;
            case VK_LEFT :
                arrayList.add(VK_LEFT);
                leftBef = true;
                break;
            case VK_RIGHT :
                arrayList.add(VK_RIGHT);
                rightBef = true;
                break;
            case VK_W :
                arrayList2.add(VK_W);
                wBef = true;
                break;
            case VK_S :
                arrayList2.add(VK_S);
                sBef = true;
                break;
            case VK_A :
                arrayList2.add(VK_A);
                aBef = true;
                break;
            case VK_D :
                arrayList2.add(VK_D);
                dBef = true;
                break;
            default:
               break;
        }
        if (arrayList.size() > 0 && arrayList2.size() > 0) {
            execute();
        }
    }
    
    public void execute() {
        if (arrayList.size() >= 2) {
                //arrayList dan arrayList2
            t1 = new Thread(new Runnable() {
                public void run() {
                    try {
                        if (upBef) {
                            if (arrayList.get(1) == VK_LEFT) {
                                world.setPlayer2Direction(8);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else if (arrayList.get(1) == VK_RIGHT) {
                                world.setPlayer2Direction(2);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else {
                                world.setPlayer2Direction(1); arrayList.remove(0); upBef=false;
                            }
                        } else if (downBef) {
                            if (arrayList.get(1) == VK_LEFT) {
                                world.setPlayer2Direction(6);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else if (arrayList.get(1) == VK_RIGHT) {
                                world.setPlayer2Direction(4);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else {
                                world.setPlayer2Direction(5); arrayList.remove(0); upBef=false;
                            }
                        } else if (leftBef) {
                            if (arrayList.get(1) == VK_UP) {
                                world.setPlayer2Direction(8);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else if (arrayList.get(1) == VK_DOWN) {
                                world.setPlayer2Direction(6);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else {
                                world.setPlayer2Direction(7); arrayList.remove(0); upBef=false;
                            }
                        } else if (rightBef) {
                            if (arrayList.get(1) == VK_UP) {
                                world.setPlayer2Direction(2);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else if (arrayList.get(1) == VK_DOWN) {
                                world.setPlayer2Direction(4);
                                arrayList.remove(0); arrayList.remove(0); upBef=false;
                            } else {
                                world.setPlayer2Direction(3); arrayList.remove(0); upBef=false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            t2 = new Thread(new Runnable() {
                public void run() {
                    try {
                        if (wBef) {
                            if (arrayList2.get(1) == VK_A) {
                                world.setPlayer1Direction(8);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else if (arrayList2.get(1) == VK_D) {
                                world.setPlayer1Direction(2);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else {
                                world.setPlayer1Direction(1); arrayList2.remove(0); upBef=false;
                            }
                        } else if (sBef) {
                            if (arrayList2.get(1) == VK_A) {
                                world.setPlayer1Direction(6);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else if (arrayList2.get(1) == VK_D) {
                                world.setPlayer1Direction(4);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else {
                                world.setPlayer1Direction(5); arrayList2.remove(0); upBef=false;
                            }
                        } else if (aBef) {
                            if (arrayList2.get(1) == VK_W) {
                                world.setPlayer1Direction(8);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else if (arrayList2.get(1) == VK_S) {
                                world.setPlayer1Direction(6);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else {
                                world.setPlayer1Direction(7); arrayList2.remove(0); upBef=false;
                            }
                        } else if (dBef) {
                            if (arrayList2.get(1) == VK_W) {
                                world.setPlayer1Direction(2);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else if (arrayList2.get(1) == VK_S) {
                                world.setPlayer1Direction(4);
                                arrayList2.remove(0); arrayList2.remove(0); upBef=false;
                            } else {
                                world.setPlayer1Direction(3); arrayList2.remove(0); upBef=false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } else {
            if (arrayList.size() > 0) {
                t1 = new Thread(new Runnable() {
                    public void run() {
                        switch (arrayList.get(0)) {
                            case VK_UP :
                                world.setPlayer1Direction(1);
                                arrayList.remove(0);
                                break;
                            case VK_DOWN :
                                world.setPlayer1Direction(5);
                                arrayList.remove(0);
                                break;
                            case VK_LEFT :
                                world.setPlayer1Direction(7);
                                arrayList.remove(0);
                                break;
                            case VK_RIGHT :
                                world.setPlayer1Direction(3);
                                arrayList.remove(0);
                                break;
                            default :
                                break;
                        }
                    }
                });
                t1.start();
            }
            if (arrayList2.size() > 0) {
                t2 = new Thread(new Runnable() {
                    public void run() {
                        switch (arrayList2.get(0)) {
                            case VK_W :
                                world.setPlayer2Direction(1);
                                arrayList2.remove(0);
                                break;
                            case VK_S :
                                world.setPlayer2Direction(5);
                                arrayList2.remove(0);
                                break;
                            case VK_A :
                                world.setPlayer2Direction(7);
                                arrayList2.remove(0);
                                break;
                            case VK_D :
                                world.setPlayer2Direction(3);
                                arrayList2.remove(0);
                                break;
                            default:
                               break;
                        }
                    }
                });
                t2.start();
            }
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
