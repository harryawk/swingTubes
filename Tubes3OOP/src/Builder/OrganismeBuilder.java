/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import organism.FirstPlayer;
import organism.Food;
import organism.NPCEater;
import organism.SecondPlayer;

/**
 *
 * @author Ali-pc.
 */
public class OrganismeBuilder {
    /**
     * @return a static food.
     */
    public static Food makeFood() {
      Food myFood = new Food();
      return myFood;
    }

    /**
     * @return NPCEater.
     */
    public static NPCEater makeEaterNPC() {
      NPCEater myNPCEater = new NPCEater();
      return myNPCEater;
    }

    /**
     * @return FirstPlayer.
     */
    public static FirstPlayer makeFirstEater() {
      FirstPlayer myFirst = new FirstPlayer();
      myFirst.setArah(0);
      return myFirst;
    }

    /**
     * a function to make second player.
     * @return a static SecondPlayer.
     */
    public static SecondPlayer makeSecondEater() {
      SecondPlayer mySecond = new SecondPlayer();
      return mySecond;
    }
}
