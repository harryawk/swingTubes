/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instinct;

import movement.DirectionMovement;
import movement.Point;

/**
 * a Caution Movement class.
 * @author Ali-pc
 */
public class CautionMovement extends DirectionMovement implements Instinct {

  /**
   * a procedure that makes the organism move with a different direction from.
   * predator location.
   * @param awal a Point.
   * @param predator a Point.
   */
  @Override
  public final void run(final Point awal, final Point predator) {
    if ((awal.getAbsis() == predator.getAbsis()) && (awal.getOrdinat()
            > predator.getOrdinat())) {
      setDirection(5);
    } else if ((awal.getAbsis() < predator.getAbsis()) && (awal.getOrdinat()
            > predator.getOrdinat())) {
      setDirection(6);
    } else if ((awal.getAbsis() < predator.getAbsis()) && (awal.getOrdinat()
            == predator.getOrdinat())) {
      setDirection(7);
    } else if ((awal.getAbsis() < predator.getAbsis()) && (awal.getOrdinat()
            < predator.getOrdinat())) {
      setDirection(8);
    } else if ((awal.getAbsis() == predator.getAbsis()) && (awal.getOrdinat()
            < predator.getOrdinat())) {
      setDirection(1);
    } else if ((awal.getAbsis() > predator.getAbsis()) && (awal.getOrdinat()
            < predator.getOrdinat())) {
      setDirection(2);
    } else if ((awal.getAbsis() > predator.getAbsis()) && (awal.getOrdinat()
            == predator.getOrdinat())) {
      setDirection(3);
    } else {
      setDirection(4);
    }
  }
}
