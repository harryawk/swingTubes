/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes3oop;

import worldofpain.GameFrame;
import Movement.*;
import Organism.*;
import Controller.ListenKey;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author Ali-pc
 */
public class Tubes3OOP {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //inisialisasi dunia
    GameFrame w = new GameFrame();

    //game-loop
    while (!w.GameOver()) {
      w.updateGame();
      w.updateDisplay();

      try {
        Thread.sleep(33);
      } catch (Exception e) {

      }
    }

    //finalisasi
    w.updateDisplay();
  }
}
