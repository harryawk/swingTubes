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
    private String nickName;
    private DirectionMovement pergerakan;
    private Color myColor;
    private int maxK = 700;
    
    /**
     *
     * @param i
     */
    public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P2 = pergerakan.move(getPosition(),getKecepatan());
        setPosition(P2);
        int a = getKekenyangan();
        a--;
        setKekenyangan(a);
    }
    
    /**
     *
     * @param name
     */
    public SecondPlayer(String name){
        super();
        mati = false;
        tingkat_kekenyangan = maxK;
        nickName = name;
        pergerakan = new DirectionMovement();
        Random rand = new Random();
        myColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }
    
    public void setMati(boolean t){
        mati = t;
    }
    
    /**
     *
     * @return
     */
    public String nickName(){
        return nickName();
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
        
        //tetap di dalam
        int width  = 1366;
        int height = 768; 
        int x = getPosition().getAbsis();
        int y = getPosition().getOrdinat();
        
        //boundary
        if(x < 100)
        {
            getPosition().setAbsis(width-125);
        }
        else if(x > (width-115))
        {
            getPosition().setAbsis(110);
        }
        else if(y < 100)
        {
            getPosition().setOrdinat(height-125);
        }
        else if(y > (height-115))
        {
            getPosition().setOrdinat(110);
        }
     
    }
    
    @Override
    public int getKecepatan(){
        return 4;
    }
    
    public Color getColor()
    {
        return myColor;
    }

    @Override
    public int getKekenyangan() {
        return tingkat_kekenyangan;
    }

    @Override
    public void setKekenyangan(int k) {
        tingkat_kekenyangan = k;
    }
    
}
