/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Instinct.CautionMovement;
import Movement.DirectionMovement;
import Movement.Point;
import Instinct.CautionMovement;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class NPCEater extends Eater {
    private String nickName;
    private boolean mati;
    private CautionMovement pergerakan;
    Color myColor;
    
    public NPCEater(String name){
        mati = false;
        pergerakan = new CautionMovement();
        Random rand = new Random();
        myColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }
    
    public void setMati(boolean t){
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
    
    public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        setPosition(pergerakan.move(getPosition(),getKecepatan()));
    }
    
    @Override
    public void Reaction(Organisme M){
        if (isRadius(50,M.getPosition())){
            if (M.name() == "F")
                hunt(M);
            else if (M.name() == "1")
                pergerakan.run(getPosition(),M.getPosition());
            else
                pergerakan.setWithRandomDirection();
        }
        else{
            pergerakan.setWithRandomDirection();
        }
        
        int width  = 1366;
        int height = 768; 
        System.out.println(getPosition().getOrdinat());
        
        //boundary
        
        if ((getPosition().getAbsis() >= 0 && getPosition().getAbsis() < width) && (height
                < getPosition().getOrdinat()))
            setArah(1);
        else if ((width < getPosition().getAbsis()) && (height
                < getPosition().getOrdinat()))
            setArah(2);
        else if ((width < getPosition().getAbsis()) && ((getPosition().getOrdinat() >= 0 && getPosition().getOrdinat() < height)))
            setArah(3);
        else if ((width < getPosition().getAbsis()) && (height
                > getPosition().getOrdinat()))
            setArah(4);
        else if (((getPosition().getAbsis() >= 0 && getPosition().getAbsis() < width)) && (height 
                > getPosition().getOrdinat()))
            setArah(5);
        else if ((width > getPosition().getAbsis()) && (height 
                > M.getPosition().getOrdinat()))
            setArah(6);
        else if ((width > getPosition().getAbsis()) && ((getPosition().getOrdinat() >= 0 && getPosition().getOrdinat() < height)))
            setArah(7);
        else if(isOutside(width, height))
            setArah(8);
            
    }
    
    @Override
    public int getKecepatan(){
        return 6;
    }
    
    public void hunt(Organisme M){
        if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            setArah(1);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            setArah(2);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            setArah(3);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            setArah(4);
        else if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            setArah(5);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            setArah(6);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            setArah(7);
        else
            setArah(8);
    }
}
