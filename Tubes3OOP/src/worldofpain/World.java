package worldofpain;

import builder.ListOfOrganisme;
import controller.ListenKey;
import organism.FirstPlayer;
import organism.Organisme;
import organism.SecondPlayer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import movement.Point;

/**
 * A World is a singleton that contains information of all object within it and
 * capable to display them.
 * @author Harry Alvin
 */
public class World extends JPanel {

  /**
   * Dunia[][] to store the worlds frame size the limit of MakhlukHidup in World
   * count counter of MakhlukHidup currently in World daftar the list of things
   * that instance of MakhlukHidup lifeState indicates the MakhlukHidup has died
   * or not yet Count counter of age clear() void to clear the console screen.
   */
  private ListOfOrganisme dunia = new ListOfOrganisme();

  /**
   * first player private member.
   */
  private FirstPlayer player1;

  /**
   * private second player member.
   */
  private SecondPlayer player2;

  /**
   * private member widht.
   */
  private int width;

  /**
   * private member height.
   */
  private int height;

  /**
   * a private long member.
   */
  private long lastTime;

  /**
   * a private long member.
   */
  private long worldTimer = 30;

  /**
   * wether the game over or not
   */
  private int gameState = 1;
  
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
   * Print a string to log.
   * @param string that will be printed.
   */
  public final void cetak(final String string) {
    System.out.println(string);
  }

  //===========================================================================
  /**
   * Draw all current object within world.
   * @throws ExceptionInInitializerError Exception.
   */
  public final void updateDisplay() throws ExceptionInInitializerError {
    repaint();
  }

  /**
   * Update the state of the game.
   * @throws ExceptionInInitializerError Exception.
   */
  public final void updateGame() throws ExceptionInInitializerError {
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

    //reaksi.
    int i = 0;
    int j = 0;

    //player terhadap player.
    if (player1 != null) {
      player1.Reaction(player2);
    }
    if (player2 != null) {
      player2.Reaction(player1);
    }

    //player terhadap NPC.
    for (Organisme o : dunia.getList()) {
      if (player1 != null) {
        player1.Reaction(o);
      }
      if (player2 != null) {
        player2.Reaction(o);
      }
    }

    //npc terhadap player.
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

    //npc terhadap npc.
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
    j = -1;
    ArrayList<Integer> removeList = new ArrayList<>();
    for (Organisme o : dunia.getList()) {
      if (o != null && o.isMati()) {
        removeList.add(i);
        j++;
      }
      i++;
    }
    for (int k=j; k>=0; k--) {
      dunia.deleteOrganismeAt(removeList.get(k));
    }
  }

  /**
   * Clear the game board.
   * @param g is the graphics that will be cleared.
   */
  public final void clear(final Graphics g) {
    if (g != null) {
      g.clearRect(0, 0, getWidth(), getHeight());
    }
  }

  @Override
  public final void paintComponent(final Graphics g) {
    super.paintComponent(g);
    clear(g);

    g.setColor(Color.black);
    g.drawString(Long.toString(worldTimer), 700, 80);
    g.drawRect(95, 95, width - 190, height - 190);

    int x;
    int y;

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
        g.drawString("Player2 win!", 600, 720);
      } else if (player2.isMati()) {
        g.drawString("Player1 win!", 600, 720);
      } else if (isTimeout()) {
        g.drawString("Player2 win!", 600, 720);
      }
    }
  }

  /**
   * Condition wether the game is over or not.
   * @return true if the game achieve over state.
   */
  public final boolean GameOver() {
    if (player1.isMati() || player2.isMati()) {
      killAllNPC();
      gameState = 0;
      return true;
    }

    return (isTimeout());
  }

  /**
   * Add an organism to the world.
   * @param o is organism that will be added to the world.
   */
  public final void add(final Organisme o) {
    if(player1.isRadius(30, o.getPosition()))
    {
      o.setPosition(new Point(800,800));
    }
    dunia.addOrganisme(o);
  }

  /**
   * Change player1 with input.
   * @param p is the player1 that will be added to the world.
   */
  public final void registerPlayer1(final FirstPlayer p) {
    player1 = p;
  }

  /**
   * Change player2 with input.
   * @param p is the player2 that will be added to the world.
   */
  public final void registerPlayer2(final SecondPlayer p) {
    player2 = p;
  }

  /**
   * Assign direction to player1.
   * @param i is the direction that will be assigned to player1.
   */
  public final void setPlayer1Direction(final int i) {
    player1.setArah(i);
  }

  /**
   * Assign direction to player2.
   * @param i is the direction that will be assigned to player2.
   */
  public final void setPlayer2Direction(final int i) {
    player2.setArah(i);
  }

  /**
   * Condition wether time(30 seconds) has passed.
   * @return wether time(30 seconds) has passed.
   */
  public final boolean isTimeout() {
    return (worldTimer <= 0);
  }

  /**
   * Get time(in second) left to timeout.
   * @return the remaining time before timeout.
   */
  public final long getTime() {
    return worldTimer;
  }
  
  public void killAllNPC(){
    while(!dunia.getList().isEmpty()){
      dunia.deleteOrganismeAt(0);
    }
  }
  
  public void continueGame(){
    gameState = 1;
  }
  
  public int gamestate(){
    return gameState;
  }
}
