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
public class DirectionMovement implements Movement {

 /**
  * A private member that contain the direction.
  */
  private int direction;

  /**
   * A private member that contain time to change direction.
   */
  private int timeToChangeDirection;

  /**
   * A constructor.
   */
  public DirectionMovement() {
    Random rand = new Random();
    direction = rand.nextInt(8) + 1;
    timeToChangeDirection = 0;
  }

  /**
   * a procedure to set the direction.
   * @param i an integer.
   */
  public final void setDirection(int i) {
    direction = i;
  }

  /**
   * A procedure to set when the direction change.
   * @param i integer.
   */
  public final void setTimeToChangeDirection(final int i) {
    timeToChangeDirection = i;
  }

  /**
   * a function to get direction.
   * @return integer.
   */
  public int getDirection() {
    return direction;
  }

  /**
   * a function to get when is the time to change direction.
   * @return an integer.
   */
  public final int getTimeToChangeDirection() {
    return timeToChangeDirection;
  }

  /**
   * a procedure to set direction to random direction.
   */
  public final void setWithRandomDirection() {
    Random rand = new Random();
    if (timeToChangeDirection % (rand.nextInt(30) + 30) == 0) {
      direction = rand.nextInt(8) + 1;
    }
    timeToChangeDirection++;
  }

  @Override
  public final Point move(final Point P1, int d) {
    Point temp = new Point(0, 0);
    temp.setAbsis(P1.getAbsis());
    temp.setOrdinat(P1.getOrdinat());
    switch (direction) {
      case 1:
        temp.geser(0, -d);
        break;
      case 2:
        temp.geser(d, -d);
        break;
      case 3:
        temp.geser(d, 0);
        break;
      case 4:
        temp.geser(d, d);
        break;
      case 5:
        temp.geser(0, d);
        break;
      case 6:
        temp.geser(-1 * d, d);
        break;
      case 7:
        temp.geser(-1 * d, 0);
        break;
      case 8:
        temp.geser(-1 * d, -d);
        break;
      default:
    }
    return temp;
  }
}
