package organism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import movement.Point;

/**
 * A class to implement an eater organism.
 * @author Ali-pc
 */
public abstract class Eater implements Organisme {
  /**
   * A private Point of current position.
   */
  private Point position;

  /**
   * A constructor.
   */
  public Eater() {
    position = new Point();
  }

  @Override
  public final Point getPosition() {
    return position;
  }

  @Override
  /**
   * An abstract method that return name of the eater.
   */
  public abstract String name();

  @Override
  /**
   * An abstract method to check if the eater already die or not.
   */
  public abstract boolean isMati();

  @Override
  /**
   * An abstract method to move the eater.
   */
  public abstract void move();

  /**
   * a function check if some point is near to eater current position.
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
   * A public procedure to respon the boundary of the box frame.
   */
  public final void boundaryRespon() {
    //tetap di dalam.
    int width = 1366;
    int height = 768;
    int x = getPosition().getAbsis();
    int y = getPosition().getOrdinat();

    //boundary.
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

  /**
   * Set the current position of the.
   * @param p A point.
   */
  public final void setPosition(final Point p) {
    position.setAbsis(p.getAbsis());
    position.setOrdinat(p.getOrdinat());
  }

}
