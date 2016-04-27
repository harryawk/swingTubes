/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movement;

import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class Point {
  /**
   * A private integer that contain the absis of point.
   */
  private int x;
  /**
   * A private integer that contain the ordinate of point.
   */
  private int y;

  /**
   * A constructor.
   */
  public Point() {
    Random rand = new Random();
    int value1 = rand.nextInt(1366);
    int value2 = rand.nextInt(768);
    x = value1;
    y = value2;
  }

  /**
   * A ctor that construct A Point with absis = _x and ordinate = _y.
   * @param xa is an integer for the absis.
   * @param ya is an integer for the ordinate.
   */
  public Point(final int xa, final int ya) {
    this.x = xa;
    this.y = ya;
  }

  /**
   * A member procedure to make a point move tc x+dx and y+dy.
   * @param dx integer for delta x.
   * @param dy integer for delta y.
   */
  public final void geser(final int dx, final int dy) {
    x += dx;
    y += dy;
  }

  /**
   * Get the absis of the Point.
   * @return an integer which represent abscissa
   */
  public final int getAbsis() {
    return x;
  }

  /**
   * Get the ordinate of the Point.
   * @return an integer which represent ordinate
   */
  public final int getOrdinat() {
    return y;
  }

  /**
   * Set the absis.
   * @param xa is integer of new abscissa
   */
  public final void setAbsis(final int xa) {
    x = xa;
  }

  /**
   * Set the ordinate.
   * @param ya integer of new ordinate
   */
  public final void setOrdinat(final int ya) {
    y = ya;
  }

  /**
   * override toString function.
   * @return the value of x and y in "x y" format as string
   */
  @Override
  public final String toString() {
    return (Integer.toString(x) + " " + Integer.toString(y));
  }
}
