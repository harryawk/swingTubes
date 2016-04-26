/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.DirectionMovement;
import Movement.Point;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class Food implements Organisme{
    private Point position;
    private boolean mati;
    private DirectionMovement pergerakan;
    private int kecepatan;
    
    public Food() {
        position = new Point();
        mati = false;
        pergerakan = new DirectionMovement();
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
}
