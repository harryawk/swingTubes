/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instinct;

import movement.Point;

/**
 *
 * @author Ali-pc
 */
public interface Instinct {

  /**
   * a method for run.
   * @param awal a Point.
   * @param predator a Point.
   */
  void run(Point awal, Point predator);
}
