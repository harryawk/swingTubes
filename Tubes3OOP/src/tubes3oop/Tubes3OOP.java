/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes3oop;

import javax.swing.JOptionPane;
import worldofpain.GameFrame;

/**
 *
 * @author Ali-pc
 */
public class Tubes3OOP {

  /**
   * @param args the command line arguments
   */
  public static void main(final String[] args) {
    //inisialisasi dunia
  
    while(true)
    {
      
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
      w.waitContinue();
      w.dispose();
    }
  }
}
