/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import worldofpain.World;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;
import java.util.ArrayList;

/**
 * A class to listen keystroke that pressed by user while the application is.
 * running.
 * @author Harry Alvin
 */
public class ListenKey implements KeyListener {
  /**
   * a world private member.
   */
  private final World world;
  /**
   * a priivate ArrayList member.
   */
  private ArrayList<Integer> arrayList;
  /**
   * a private arraylist member.
   */
  private ArrayList<Integer> arrayList2;
  /**
   * A private Array List member.
   */
  private Thread t1, t2;
  /**
   * A private boolean member.
   */
  private boolean wBef, sBef, dBef, aBef, upBef, downBef, leftBef, rightBef;

  /**
   * A constructor with parameter.
   * @param worlds the world that its keystroke want to be listened
   */
  public ListenKey(final World worlds) {
    this.world = worlds;
    arrayList = new ArrayList();
    arrayList2 = new ArrayList();
  }

  @Override
  /**
   * a procedure to get the typed key.
   * @param e KeyEvent.
   */
  public final void keyTyped(final KeyEvent e) {

  }

  @Override
  /**
   * An procedure that response when key pressed.
   * @param e Keystroke that being pressed
   */
  public final void keyPressed(final KeyEvent e) {
    switch (e.getKeyCode()) {
      case VK_UP:
        arrayList.add(VK_UP);
        upBef = true;
        break;
      case VK_DOWN:
        arrayList.add(VK_DOWN);
        downBef = true;
        break;
      case VK_LEFT:
        arrayList.add(VK_LEFT);
        leftBef = true;
        break;
      case VK_RIGHT:
        arrayList.add(VK_RIGHT);
        rightBef = true;
        break;
      case VK_W:
        arrayList2.add(VK_W);
        wBef = true;
        break;
      case VK_S:
        arrayList2.add(VK_S);
        sBef = true;
        break;
      case VK_A:
        arrayList2.add(VK_A);
        aBef = true;
        break;
      case VK_D:
        arrayList2.add(VK_D);
        dBef = true;
        break;
      default:
        break;
    }
    
    world.continueGame();
  }

  /**
   * function to check was there a keystroke pressed.
   * @return boolean tell that there was another keystroke before
   */
  public final boolean isAllFalse() {
    return (!wBef && !sBef && !dBef && !aBef && !upBef
            && !downBef && !leftBef && !rightBef);
  }

  @Override
  /**
   * An procedure that response when key released.
   * @param e Keystroke that is released after being pressed
   */
  public final void keyReleased(final KeyEvent e) {
    if (isAllFalse()) {
      if (arrayList.size() > 0) {
        switch (arrayList.get(0)) {
          case VK_UP:
            arrayList.clear();
            world.setPlayer1Direction(1);
            break;
          case VK_DOWN:
            arrayList.clear();
            world.setPlayer1Direction(5);
            break;
          case VK_LEFT:
            arrayList.clear();
            world.setPlayer1Direction(7);
            break;
          case VK_RIGHT:
            arrayList.clear();
            world.setPlayer1Direction(3);
            break;
          default:
            break;
        }
      }
      //===============================
      if (arrayList2.size() > 0) {
        switch (arrayList2.get(0)) {
          case VK_W:
            arrayList2.clear();
            world.setPlayer2Direction(1);
            break;
          case VK_S:
            arrayList2.clear();
            world.setPlayer2Direction(5);
            break;
          case VK_A:
            arrayList2.clear();
            world.setPlayer2Direction(7);
            break;
          case VK_D:
            arrayList2.clear();
            world.setPlayer2Direction(3);
            break;
          default:
            break;
        }
      }
    } else { //loop == 2
      if (arrayList.size() == 2) {
        switch (arrayList.get(0)) {
          case VK_UP:
            switch (arrayList.get(1)) {
              case VK_LEFT:
                world.setPlayer1Direction(8);
                arrayList.clear();
                break;
              case VK_RIGHT:
                world.setPlayer1Direction(2);
                arrayList.clear();
                break;
              case VK_DOWN:
                world.setPlayer1Direction(1);
                arrayList.remove(0);
                keyReleased(e);
                break;
              case VK_UP:
                world.setPlayer1Direction(1);
                arrayList.remove(0);
                keyReleased(e);
              default:
                break;
            }
            break;
          case VK_DOWN:
            switch (arrayList.get(1)) {
              case VK_LEFT:
                world.setPlayer1Direction(6);
                arrayList.clear();
                break;
              case VK_RIGHT:
                world.setPlayer1Direction(4);
                arrayList.clear();
                break;
              case VK_DOWN:
                world.setPlayer1Direction(5);
                arrayList.remove(0);
                keyReleased(e);
                break;
              case VK_UP:
                world.setPlayer1Direction(5);
                arrayList.remove(0);
                keyReleased(e);
              default:
                break;
            }
            break;
          case VK_LEFT:
            switch (arrayList.get(1)) {
              case VK_UP:
                world.setPlayer1Direction(8);
                arrayList.clear();
                break;
              case VK_DOWN:
                world.setPlayer1Direction(6);
                arrayList.clear();
                break;
              case VK_LEFT:
                world.setPlayer1Direction(7);
                arrayList.remove(0);
                keyReleased(e);
                break;
              case VK_RIGHT:
                world.setPlayer1Direction(7);
                arrayList.remove(0);
                keyReleased(e);
              default:
                break;
            }
            break;
          case VK_RIGHT:
            switch (arrayList.get(1)) {
              case VK_UP:
                world.setPlayer1Direction(2);
                arrayList.clear();
                break;
              case VK_DOWN:
                world.setPlayer1Direction(4);
                arrayList.clear();
                break;
              case VK_LEFT:
                world.setPlayer1Direction(3);
                arrayList.remove(0);
                keyReleased(e);
                break;
              case VK_RIGHT:
                world.setPlayer1Direction(3);
                arrayList.remove(0);
                keyReleased(e);
              default:
                break;
            }
            break;
          default:
            break;
        }
      } else {
        if (arrayList.size() > 0) {
          switch (arrayList.get(0)) {
            case VK_UP:
              arrayList.clear();
              world.setPlayer1Direction(1);
              break;
            case VK_DOWN:
              arrayList.clear();
              world.setPlayer1Direction(5);
              break;
            case VK_LEFT:
              arrayList.clear();
              world.setPlayer1Direction(7);
              break;
            case VK_RIGHT:
              arrayList.clear();
              world.setPlayer1Direction(3);
              break;
            default:
              break;
          }
        }
        upBef = false;
        downBef = false;
        leftBef = false;
        rightBef = false;
      }
      //======================================
      if (arrayList2.size() == 2) {
        switch (arrayList2.get(0)) {
          case VK_W:
            switch (arrayList2.get(1)) {
              case VK_A:
                world.setPlayer2Direction(8);
                arrayList2.clear();
                break;
              case VK_D:
                world.setPlayer2Direction(2);
                arrayList2.clear();
                break;
              case VK_S:
                world.setPlayer2Direction(1);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              case VK_W:
                world.setPlayer2Direction(1);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              default:
                break;
            }
            break;
          case VK_S:
            switch (arrayList2.get(1)) {
              case VK_A:
                world.setPlayer2Direction(6);
                arrayList2.clear();
                break;
              case VK_D:
                world.setPlayer2Direction(4);
                arrayList2.clear();
                break;
              case VK_S:
                world.setPlayer2Direction(5);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              case VK_W:
                world.setPlayer2Direction(5);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              default:
                break;
            }
            break;
          case VK_A:
            switch (arrayList2.get(1)) {
              case VK_W:
                world.setPlayer2Direction(8);
                arrayList2.clear();
                break;
              case VK_S:
                world.setPlayer2Direction(6);
                arrayList2.clear();
                break;
              case VK_D:
                world.setPlayer2Direction(7);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              case VK_A:
                world.setPlayer2Direction(7);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              default:
                break;
            }
            break;
          case VK_D:
            switch (arrayList2.get(1)) {
              case VK_W:
                world.setPlayer2Direction(2);
                arrayList2.clear();
                break;
              case VK_S:
                world.setPlayer2Direction(4);
                arrayList2.clear();
                break;
              case VK_A:
                world.setPlayer2Direction(3);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              case VK_D:
                world.setPlayer2Direction(3);
                arrayList2.remove(0);
                keyReleased(e);
                break;
              default:
                break;
            }
            break;
          default:
            break;
        }
      } else {
        if (arrayList2.size() > 0) {
          switch (arrayList2.get(0)) {
            case VK_W:
              arrayList2.clear();
              world.setPlayer2Direction(1);
              break;
            case VK_S:
              arrayList2.clear();
              world.setPlayer2Direction(5);
              break;
            case VK_A:
              arrayList2.clear();
              world.setPlayer2Direction(7);
              break;
            case VK_D:
              arrayList2.clear();
              world.setPlayer2Direction(3);
              break;
            default:
              break;
          }
        }
        wBef = false;
        sBef = false;
        aBef = false;
        dBef = false;
      }
    }
  }
}
