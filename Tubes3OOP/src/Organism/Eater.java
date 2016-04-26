package Organism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali-pc
 */
import Movement.Point;


public abstract class Eater implements Organisme{
    private Point position = new Point();
    
    public Eater(){
    }
    
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
    }
    
    @Override
    public Point getPosition(){
        return position;
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
    
    @Override
    public abstract String name();
    
    @Override
    public abstract boolean isMati();
    
    @Override
    public abstract void move();
}
