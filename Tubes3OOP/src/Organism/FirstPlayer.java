/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organism;

/**
 *
 * @author Ali-pc
 */
import movement.DirectionMovement;
import movement.Point;
import java.awt.Color;

/**
 * A class that implement the first player.
 * @author CXXXV
 */
public class FirstPlayer extends Eater {
  /**
   * a boolean private member.
   */
  private boolean mati;

  /**
   * a boolean private member.
   */
  private int win;

  /**
   * a Direction Movement private member named "pergerakan".
   */
  private DirectionMovement pergerakan;

  /**
   * A constructor.
   */
  public FirstPlayer() {
    super();
    mati = false;
    win = 0;
    pergerakan = new DirectionMovement();
  }

  /**
   * a function to set direction.
   * @param i an integer.
   */
  public final void setArah(final int i) {
    pergerakan.setDirection(i);
  }

  @Override
  /**
   * a procedure to move.
   */
  public final void move() {
    Point newP = pergerakan.move(getPosition(), getKecepatan()); //New Position.
    setPosition(newP);
  }

  @Override
  /**
   * a procedure to set the death or First Player.
   * @param t a boolean.
   */
  public final void setMati(final boolean t) {
    mati = t;
  }

  @Override
  /**
   * a function that return a name.
   * @return a String.
   */
  public final String name() {
    return "1";
  }

  @Override
  /**
   * a function to get death variable.
   * @return a boolean
   */
  public final boolean isMati() {
    return mati;
  }

  @Override
  /**
   * a function to get the velocity of the FirstPlayer.
   * @return an integer.
   */
  public final int getKecepatan() {
    return 6;
  }

  /**
   * a function to get win condition of the First Player.
   * @return an integer.
   */
  public final int getWin() {
    return win;
  }

  @Override
  /**
   * a function that return the Color of the First Player.
   * @return a Color.
   */
  public final Color getColor() {
    return Color.blue;
  }

  @Override
  /**
   * a procedure to React.
   * @param m an Organisme.
   */
  public final void Reaction(final Organisme m) {
    if (isRadius(20, m.getPosition()) && m != null) {
      if (m.name() != "2") {
        setMati(true);
      } else {
        win = 1;
      }
    }
    boundaryRespon();
  }
}
