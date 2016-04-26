/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Instinct.CautionMovement;
import Movement.Point;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class Food implements Organisme{
    private Point position;
    private boolean mati;
    private CautionMovement pergerakan;
    private int kecepatan;
    
    public Food() {
        position = new Point();
        mati = false;
        pergerakan = new CautionMovement();
        setKecepatan();
    }
    
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
    }
    
     public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    public void setKecepatan(){
        Random rand = new Random();
        kecepatan = rand.nextInt(3)+2;
    }
    
    @Override
    public void move() {
        setPosition(pergerakan.move(getPosition()));
    }
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    @Override
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setMati(boolean t){
        mati = t;
    }
    
    @Override
    public String name(){
        return "F";
    }
    
    @Override
    public boolean isMati(){
        return mati;
    }
 
    @Override
    public void Reaction(Organisme M){
        if (isRadius(10,M.getPosition())) {
            if ((M.name() == "2") || (M.name() == "N")){
                setMati(true);
            } else
                pergerakan.setWithRandomDirection();
        } else if (isRadius(35,M.getPosition())) {
            if ((M.name() == "N") || (M.name() == "2"))
                pergerakan.run(getPosition(),M.getPosition());
            else
                pergerakan.setWithRandomDirection();
        } else
            pergerakan.setWithRandomDirection();       
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
}
