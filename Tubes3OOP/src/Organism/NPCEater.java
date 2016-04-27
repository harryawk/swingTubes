/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organism;

import instinct.CautionMovement;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class NPCEater extends Eater {

  private boolean mati;
  private CautionMovement pergerakan;
  private Color myColor;

  /**
   *
   * @param name
   */
  public NPCEater() {
    mati = false;
    pergerakan = new CautionMovement();
    Random rand = new Random();
    myColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
  }

  public void setMati(boolean t) {
    mati = t;
  }

  @Override
  public String name() {
    return "N";
  }

  @Override
  public boolean isMati() {
    return mati;
  }

  /**
   *
   * @param i
   */
  public void setArah(int i) {
    pergerakan.setDirection(i);
  }

  @Override
  public void move() {
    setPosition(pergerakan.move(getPosition(), getKecepatan()));
  }

  @Override
  public Color getColor() {
    return myColor;
  }

  @Override
  public void Reaction(Organisme M) {
    if (M != null && isRadius(100, M.getPosition())) {
      if (M.name() == "F") {
        if (pergerakan.getTimeToChangeDirection() % 5 == 0) {
          hunt(M);
          pergerakan.setTimeToChangeDirection(1);
        }
      } else if (M.name() == "1") {
        if (pergerakan.getTimeToChangeDirection() % 5 == 0) {
          pergerakan.run(getPosition(), M.getPosition());
          pergerakan.setTimeToChangeDirection(1);
        }
      } else {
        pergerakan.setWithRandomDirection();
      }
    } else {
      pergerakan.setWithRandomDirection();
    }
    boundaryRespon();
  }

  @Override
  public int getKecepatan() {
    return 4;
  }

  /**
   * a method to implement hunt
   *
   * @param M
   */
  public void hunt(Organisme M) {
    if (M != null) {
      if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              > M.getPosition().getOrdinat())) {
        setArah(1);
      } else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              > M.getPosition().getOrdinat())) {
        setArah(2);
      } else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              == M.getPosition().getOrdinat())) {
        setArah(3);
      } else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              < M.getPosition().getOrdinat())) {
        setArah(4);
      } else if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              < M.getPosition().getOrdinat())) {
        setArah(5);
      } else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              < M.getPosition().getOrdinat())) {
        setArah(6);
      } else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat()
              == M.getPosition().getOrdinat())) {
        setArah(7);
      } else {
        setArah(8);
      }
    }
  }
}
