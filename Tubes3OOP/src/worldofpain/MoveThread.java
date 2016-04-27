/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofpain;

import java.lang.*;
import Organism.Organisme;

/**
 *
 * @author CXXXV
 */
public class MoveThread extends Thread {

  MoveThread(Organisme o) {
    organisme = o;
  }

  private Organisme organisme;

  @Override
  public void run() {
    organisme.move();
  }

}
