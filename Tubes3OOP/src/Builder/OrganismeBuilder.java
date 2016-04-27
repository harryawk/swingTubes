/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Organism.FirstPlayer;
import Organism.Food;
import Organism.NPCEater;
import Organism.SecondPlayer;

/**
 *
 * @author Ali-pc
 */
public class OrganismeBuilder {

    /**
     *
     */
    public Food makeFood(){
        Food myFood = new Food();
        return myFood;
    }
    
    /**
     *
     */
    public NPCEater makeEaterNPC(){
        NPCEater myNPCEater = new NPCEater();
        return myNPCEater;
    }
    
    /**
     *
     */
    public FirstPlayer makeFirstEater(){
        FirstPlayer myFirst = new FirstPlayer();
        return myFirst;
    }
    
    /**
     *
     */
    public SecondPlayer makeSecondEater(){
        SecondPlayer mySecond = new SecondPlayer();
        return mySecond;
    }
}
