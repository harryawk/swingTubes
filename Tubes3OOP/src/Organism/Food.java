/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organism;

import instinct.CautionMovement;
import movement.Point;
import java.awt.Color;
import java.util.Random;

/**
 * A class to implement food object.
 * @author Ali-pc
 */
public class Food implements Organisme {
  /**
   * A private point of the position.
   */
  private Point position;

  /**
   * A private boolean member.
   */
  private boolean mati;

  /**
   * A private Caution Movement member.
   */
  private CautionMovement pergerakan;

  /**
   * A private integer member.
   */
  private int kecepatan;

  /**
   * A Constructor.
   */
  public Food() {
    position = new Point();
    mati = false;
    pergerakan = new CautionMovement();
    setKecepatan();
  }

  /**
   * a procedure to set position.
   * @param p a Point.
   */
  public final void setPosition(final Point p) {
    position.setAbsis(p.getAbsis());
    position.setOrdinat(p.getOrdinat());
  }

  /**
   * a procedure to set the direction.
   * @param i integer.
   */
  public final void setArah(final int i) {
    pergerakan.setDirection(i);
  }

  /**
   * a procedure to set velocity.
   */
  public final void setKecepatan() {
    Random rand = new Random();
    kecepatan = rand.nextInt(2) + 2;
  }

  @Override
  /**
   * A procedure to move.
   */
  public final void move() {
    setPosition(pergerakan.move(getPosition(), getKecepatan()));
  }

  @Override
  public final Point getPosition() {
    return position;
  }

  @Override
  /**
   * a function to get Color.
   * @return a Color.
   */
  public final Color getColor() {
    return Color.yellow;
  }

  @Override
  /**
   * A function to get the velocity.
   * @return an integer.
   */
  public final int getKecepatan() {
    return 2;
  }

  /**
   * a procedure to set the death of the organism.
   * @param t a boolean.
   */
  public final void setMati(final boolean t) {
    mati = t;
  }

  @Override
  /**
   * a function that return the name of the Second Player.
   * @return a String.
   */
  public final String name() {
    return "F";
  }

  @Override
  public final boolean isMati() {
    return mati;
  }

  @Override
  /**
   * a procedure to React.
   * @param m an Organisme.
   */
  public final void Reaction(final Organisme m) {
    if (isRadius(20, m.getPosition()) && m != null) {
      if ((m.name() == "2") || (m.name() == "N")) {
        setMati(true);
      } else {
        pergerakan.setWithRandomDirection();
      }
    } else if (isRadius(45, m.getPosition())) {
      if ((m.name() == "N") || (m.name() == "2")) {
        pergerakan.run(getPosition(), m.getPosition());
        pergerakan.setTimeToChangeDirection(1);
      } else {
        pergerakan.setWithRandomDirection();
      }
    } else {
      pergerakan.setWithRandomDirection();
    }

    boundaryRespon();
  }

  /**
   * a function that return true if the point is inside the radius.
   * @param rad an integer.
   * @param p a Point.
   * @return a boolean.
   */
  public final boolean isRadius(final int rad, final Point p) {
    int xa, ya;
    xa = getPosition().getAbsis() - p.getAbsis();
    if (xa < 0) {
      xa = 0 - xa;
    }
    ya = getPosition().getOrdinat() - p.getOrdinat();
    if (ya < 0) {
      ya = 0 - ya;
    }
    return ((ya <= rad) && (xa <= rad));
  }

  /**
   * a procedure to respone the boundary of the box frame.
   */
  public final void boundaryRespon() {
    //tetap di dalam
    int width = 1366;
    int height = 768;
    int x = getPosition().getAbsis();
    int y = getPosition().getOrdinat();

    //boundary
    if (x < 100) {
      getPosition().setAbsis(width - 125);
    } else if (x > (width - 115)) {
      getPosition().setAbsis(110);
    } else if (y < 100) {
      getPosition().setOrdinat(height - 125);
    } else if (y > (height - 115)) {
      getPosition().setOrdinat(110);
    }
  }
}
