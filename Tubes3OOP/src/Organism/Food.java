/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;
import Movement.CautionMovement;
import Movement.*;

/**
 *
 * @author Ali-pc
 */
public class Food extends Organisme{
    private int kecepatan;
    
    public Food(){
        super();
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setKecepatan(int k){
        kecepatan = k;
    }

    @Override
    public void Reaction(Organisme M) {
        if (M.getPosisi()== getPosisi()){
            if (M.get_DNA() == 'E'){
               setMati(true);
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
        

