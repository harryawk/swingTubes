/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.DirectionMovement;
import Movement.Point;

/**
 *
 * @author Ali-pc
 */
public class NPCEater extends Eater {
    private String nickName;
    private boolean mati;
    private DirectionMovement pergerakan;
    
    public NPCEater(String name){
        nickName = name;
        mati = false;
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
        Point P1 = getPosition();
        Point P2 = pergerakan.move(getPosition()); //Posisi yang baru
        setPosition(P2);
    }
    
    public boolean isRadius (int rad, Point p){
        int _x, _y;
        _x = getPosition().getAbsis() - p.getAbsis();
        if (_x < 0)
                _x = 0 - _x;
        _y = getPosition().getOrdinat() - p.getOrdinat();
        if (_y < 0)
                _y = 0 - _y;
        return ((_y <= rad) &&(_x <= rad));
    }
    
    public void Reaction(Organisme M){
        if (isRadius(1,M.getPosition())){
            hunt(M);
        }
        else{
            move();
        }
    }
    
    public void hunt(Organisme M){
        if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            setArah(1);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            setArah(2);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            setArah(3);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            setArah(4);
        else if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            setArah(5);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            setArah(6);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            setArah(7);
        else
            setArah(8);
    }
}
