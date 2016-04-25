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
    
    public NPCEater(String name){
        nickName = name;
        mati = false;
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

    @Override
    public void move() {
        DirectionMovement D = new DirectionMovement();
        Point P1 = getPosition();
        Point P2 = D.moveWithRandomDirection(getPosition()); //Posisi yang baru
        setPrecPosition(P1);
        setPosition(P2);
    }
    
    //Gerak dengan arah terkontrol
    public void move(int i){
        DirectionMovement D = new DirectionMovement();
        Point P1 = getPosition();
        D.setDirection(i);
        Point P2 = D.move(getPosition()); //Posisi yang baru
        setPrecPosition(P1);
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
            move(1);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                < M.getPosition().getOrdinat()))
            move(2);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            move(3);
        else if ((getPosition().getAbsis() < M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            move(4);
        else if ((getPosition().getAbsis() == M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            move(5);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                > M.getPosition().getOrdinat()))
            move(6);
        else if ((getPosition().getAbsis() > M.getPosition().getAbsis()) && (getPosition().getOrdinat() 
                == M.getPosition().getOrdinat()))
            move(7);
        else
            move(8);
    }
}
