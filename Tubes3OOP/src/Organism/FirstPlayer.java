/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

/**
 *
 * @author Ali-pc
 */

import Movement.*;
import Instinct.*;

public class FirstPlayer extends Eater{
    private String nickName;
    private boolean mati;
    private int win;
    private DirectionMovement pergerakan;
    
     public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P1 = getPosition();
        Point P2 = pergerakan.move(getPosition()); //Posisi yang baru
        setPrecPosition(P1);
        setPosition(P2);
    }
    
    public FirstPlayer(String name){
        nickName = name;
        mati = false;
        win = 0;
        pergerakan = new DirectionMovement();
    }
    
    
    
    public void setMati(boolean t){
        mati = t;
    }
    
    public String nickName(){
        return nickName;
    }
    
    @Override
    public String name() {
        return "1";
    }

    @Override
    public boolean isMati() {
        return mati;
    }
    
    public int getWin(){
        return win;
    }
    
    public void Reaction(Organisme M){
        if (getPosition() == M.getPosition()){
            if ((M.name() != "2") && (M.name() != "N")){
                setMati(true);
            }
            else{
                if (M.name() != "2"){
                    move();
                }
                else{
                    win = 1;
                }
            }
        }
        else{
            move();
        }
    }
}
