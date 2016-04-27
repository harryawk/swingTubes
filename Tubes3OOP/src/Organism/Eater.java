package Organism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class to implement an eater organism
 * @author Ali-pc
 */
import Movement.Point;

public abstract class Eater implements Organisme{
    private Point position = new Point();
    private int tingkat_kekenyangan;
    
    /**
     * A constructor
     */
    public Eater(){
    }
    
    /**
     * Set the current position of the 
     * @param P
     */
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
        tingkat_kekenyangan = 300;
    }
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    /**
     * a function check if some point is near to eater current position
     * @param rad
     * @param p
     * @return
     */
    public boolean isRadius (int rad, Point p){
        int _x, _y;
        _x = getPosition().getAbsis() - p.getAbsis();
        if (_x < 0)
                _x = 0 - _x;
        _y = getPosition().getOrdinat() - p.getOrdinat();
        if (_y < 0)
                _y = 0 - _y;
        return ((_y <= rad) && (_x <= rad));
    }
    
    @Override
    /**
     * An abstract method that return name of the eater
     */
    public abstract String name();
    
    @Override
    /**
     * An abstract method to check if the eater already die or not
     */
    public abstract boolean isMati();
    
    @Override
    /**
     * An abstract method to move the eater
     */
    public abstract void move();
    
    /**
     * a method to check if the eater is outside the box or not
     * @param width an integer
     * @param height an integer
     * @return 
     */
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
    
    @Override
    public int getKekenyangan(){
        return tingkat_kekenyangan;
    }
    
    @Override
    public void setKekenyangan(int k){
        tingkat_kekenyangan = k;
    }
}
