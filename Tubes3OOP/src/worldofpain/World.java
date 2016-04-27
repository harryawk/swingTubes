package worldofpain;

import Builder.ListOfOrganisme;
import Controller.ListenKey;
import Organism.FirstPlayer;
import Organism.Organisme;
import Organism.SecondPlayer;
import java.awt.Graphics;
import java.awt.Color;
import java.util.*;
import javax.swing.*;

/**
 * A World is a singleton that contains information of all object within it and
 * capable to display them.
 *
 * @author Harry Alvin
 */
public class World extends JPanel {

  /**
   * Dunia[][] to store the worlds frame size the limit of MakhlukHidup in World
   * count counter of MakhlukHidup currently in World daftar the list of things
   * that instance of MakhlukHidup lifeState indicates the MakhlukHidup has died
   * or not yet Count counter of age clear() void to clear the console screen
   */
  ListOfOrganisme dunia = new ListOfOrganisme();
  FirstPlayer player1;
  SecondPlayer player2;
  int width;
  int height;
  long lastTime;
  long worldTimer = 30;

  /**
   * A constructor of World class.
   */
  public World() {
    width = 1366;
    height = 768;
    setFocusable(true);
    requestFocusInWindow();
    this.addKeyListener(new ListenKey(this));
    lastTime = System.currentTimeMillis();
  }

  /**
   *
   * @param string
   */
  public void cetak(String string) {
    System.out.println(string);
  }

//=======================================================================================
  /**
   * Draw all current object within world
   */
  public void updateDisplay() throws ExceptionInInitializerError {
    repaint();
  }

  /**
   *
   * @throws ExceptionInInitializerError
   */
  public void updateGame() throws ExceptionInInitializerError {
    //update waktu
    long passedTime = (System.currentTimeMillis() - lastTime) / 1000;
    if (passedTime > 0) {
      lastTime = System.currentTimeMillis();
      worldTimer -= passedTime;
    }

    //gerak
    MoveThread m = new MoveThread(player1);
    m.start();
    m = new MoveThread(player2);
    m.start();
    for (Organisme o : dunia.getList()) {
      m = new MoveThread(o);
      m.start();
    }

    //reaksi
    int i = 0;
    int j = 0;

    //player terhadap player
    if (player1 != null) {
      player1.Reaction(player2);
    }
    if (player2 != null) {
      player2.Reaction(player1);
    }

    //player terhadap NPC
    for (Organisme o : dunia.getList()) {
      if (player1 != null) {
        player1.Reaction(o);
      }
      if (player2 != null) {
        player2.Reaction(o);
      }
    }

    //npc terhadap player
    for (Organisme o : dunia.getList()) {
      if (o != null) {
        if (player1 != null) {
          o.Reaction(player1);
        }
        if (player2 != null) {
          o.Reaction(player2);
        }
      }
    }

    //npc terhadap npc
    for (Organisme o : dunia.getList()) {
      if (o != null) {
        j = 0;

        for (Organisme oo : dunia.getList()) {
          if (i != j && oo != null) {
            o.Reaction(oo);
          }
          j++;
        }
        i++;
      }
    }

    //pluck yang mati
    i = 0;
    ArrayList<Integer> removeList = new ArrayList<Integer>();
    for (Organisme o : dunia.getList()) {
      if (o != null && o.isMati()) {
        removeList.add(i);
      }
      i++;
    }
    for (Integer k : removeList) {
      dunia.deleteOrganismeAt(k.intValue());
    }
  }

  /**
   *
   * @param g
   */
  public void clear(Graphics g) {
    if (g != null) {
      g.clearRect(0, 0, getWidth(), getHeight());
    }
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    clear(g);

    g.setColor(Color.black);
    g.drawString(Long.toString(worldTimer), 700, 80);
    g.drawRect(95, 95, width - 190, height - 190);

    int x = 0;
    int y = 0;

    x = player1.getPosition().getAbsis();
    y = player1.getPosition().getOrdinat();
    g.setColor(player1.getColor());
    g.fillOval(x, y, 20, 20);

    x = player2.getPosition().getAbsis();
    y = player2.getPosition().getOrdinat();
    g.setColor(player2.getColor());
    g.fillOval(x, y, 20, 20);

    for (Organisme o : dunia.getList()) {
      x = o.getPosition().getAbsis();
      y = o.getPosition().getOrdinat();
      g.setColor(o.getColor());
      g.fillOval(x, y, 20, 20);
    }

    if (GameOver()) {
      g.setColor(Color.black);
      if (player1.isMati()) {
        g.drawString("GameOver: kalah", 600, 720);
      } else if (player2.isMati()) {
        g.drawString("GameOver: menang", 600, 720);
      } else if (isTimeout()) {
        g.drawString("GameOver: timeout", 600, 720);
      }
    }
  }

  /*  Draw display at Pc and remove the previous drawing at Px
         *  @param Px is previous position that would be erased
         *  @param Pc is the new position that would be drawn
         *  @param display is the character that would be drawn at Pc
   */
  /**
   *
   * @return
   */
  public boolean GameOver() {
    if (player1.isMati() || player2.isMati()) {
      return true;
    }

    return (isTimeout());
  }

  /**
   *
   * @param o
   */
  public void add(Organisme o) {
    dunia.addOrganisme(o);
  }

  /**
   *
   * @param p
   */
  public void registerPlayer1(FirstPlayer p) {
    player1 = p;
  }

  /**
   *
   * @param p
   */
  public void registerPlayer2(SecondPlayer p) {
    player2 = p;
  }

  /**
   *
   * @param i
   */
  public void setPlayer1Direction(int i) {
    player1.setArah(i);
  }

  /**
   *
   * @param i
   */
  public void setPlayer2Direction(int i) {
    player2.setArah(i);
  }

  /**
   *
   * @return
   */
  public boolean isTimeout() {
    return (worldTimer <= 0);
  }

  public long getTime() {
    return worldTimer;
  }

}
