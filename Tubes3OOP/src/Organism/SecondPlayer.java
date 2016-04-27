/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.DirectionMovement;
import Movement.Point;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class SecondPlayer extends Eater{
    private boolean mati;
    private int tingkat_kekenyangan;
    private DirectionMovement pergerakan;
    private Color myColor;
    private final int maxK = 700;
    
    /**
     *
     * @param i
     */
    public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        setPosition(pergerakan.move(getPosition(),getKecepatan()));
        int a = getKekenyangan();
        a--;
        setKekenyangan(a);
    }
    
    /**
     *
     * @param name
     */
    public SecondPlayer(){
        super();
        mati = false;
        tingkat_kekenyangan = maxK;
        pergerakan = new DirectionMovement();
        Random rand = new Random();
        myColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }
    
    public void setMati(boolean t){
        mati = t;
    }
    
    
    @Override
    public String name() {
        return "2";
    }
    
    @Override
    public boolean isMati() {
        return mati;
    }
    
    public void Reaction(Organisme M){
        if (isRadius(20,M.getPosition())){
            if (M.name() == "1"){
                setMati(true);
            }
            else if (M.name() == "F"){
                tingkat_kekenyangan = maxK;
            }
        }
        
        //cek kekenyangan
        if (getKekenyangan() == 0){
            setMati(true);
        }
        
        boundaryRespon();
    }
    
    @Override
    public int getKecepatan(){
        return 4;
    }
    
    @Override
    public Color getColor()
    {
        return myColor;
    }

    public int getKekenyangan() {
        return tingkat_kekenyangan;
    }

    public void setKekenyangan(int k) {
        tingkat_kekenyangan = k;
    }
    
}
