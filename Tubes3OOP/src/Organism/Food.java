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
public class Food implements Organisme{
    private Point position;
    private Point precPosition;
    private boolean mati;
    private DirectionMovement pergerakan;
    
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
        pergerakan = new DirectionMovement();
    }
    
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
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    public void setPrecPosition(Point P){
        precPosition.setAbsis(P.getAbsis());
        precPosition.setOrdinat(P.getOrdinat());
    }
    
    public void setMati(boolean t){
        mati = t;
    }
    
    public Point getPrecPosition(){
        return precPosition;
    }
    
    @Override
    public String name(){
        return "F";
    }
    
    @Override
    public boolean isMati(){
        return mati;
    }
 
    public void Reaction(Organisme M){
        if ((M.name() == "2") || (M.name() != "N")){
            setMati(true);
        }
        else{
            if (M.name() != "1"){
                move();
            }
            else{
            }
        }
    }   
    
    public boolean isOutside(int width, int height)
    {
        if(getPosition().getAbsis() > width || getPosition().getAbsis() < 0)
        {
            return true;
        }
        
        if(getPosition().getOrdinat() > height || getPosition().getAbsis() < 0)
        {
            return true;
        }
        
        return false;
    }
}
