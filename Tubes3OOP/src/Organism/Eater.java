/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;


import Movement.*;

/**
 *
 * @author Ali-pc
 */
public class Eater extends Organisme{
    private int kecepatan;
     private int tingkat_kekenyangan;
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(int k){
        kecepatan = k;
    }
    
    public int get_tingkat_kekenyangan(){
        return tingkat_kekenyangan;
    }
    
    public void set_tingkat_kekenyangan(int k){
        tingkat_kekenyangan = k;
    }
    
    public Eater(){
        super();
    }

    @Override
    public void Reaction(Organisme M) {
        if (M.getPosisi()== getPosisi()){
            if (M.get_DNA() == 'F'){
               set_tingkat_kekenyangan(40); //40 Maksimum tingkat kekenyangan
            }
        }
        else if (isRadius(1,M.getPosisi())){
            /* Kalau Ketemu player 1 gerak menjauh */
            setDirection(0);
            if (M.get_DNA() == '1'){
               Point posisi1 = new Point();
               gerakMenjauh(getPosisi(), M.getPosisi());
               run();
               posisi1 = move(getPosisi());
               setPosisi(posisi1);
            }
        }
    }

    @Override
    public void run() {
        kecepatan++;
   }
}
