/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofpain;

import builder.OrganismeBuilder;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author CXXXV
 */
public class GameFrame extends JFrame {
  /**
   * the world.
   */
  private World w;
  /**
   * respawn time.
   */
  private int respawnTick = 25;

  /**
   * a constructor.
   */
  public GameFrame() {
    add(initGame());
    pack();
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  public World initGame()
  {
    w = new World();
    setPreferredSize(new Dimension(1366, 768));
    //inisialisasi makhluk
    
    w.registerPlayer1(OrganismeBuilder.makeFirstEater());
    w.registerPlayer2(OrganismeBuilder.makeSecondEater());

    //Make food
    for (int i = 1; i <= 4; i++) {
      w.add(OrganismeBuilder.makeEaterNPC());
    }

    //Make food
    for (int i = 1; i <= 10; i++) {
      w.add(OrganismeBuilder.makeFood());
    }
    
    return w;
  }

  /**
   * a procedure to update game.
   */
  public final void updateGame() {
    w.updateGame();
    if (w.getTime() < respawnTick) {
      for (int i = 1; i <= 2; i++) {
        w.add(OrganismeBuilder.makeFood());
      }
      respawnTick -= 5;
    }
  }

  /**
   * a procedure to update the display of the game.
   */
  public final void updateDisplay() {
    w.updateDisplay();
    repaint();
  }

  /**
   * the game over procedure.
   * @return boolean.
   */
  public final boolean GameOver() {
    return w.GameOver();
  }
  
  public void waitContinue()
  {
    System.out.println("Wait");
    while(w.gamestate() != 1)
    {
       System.out.print("");
    }
  }
}
