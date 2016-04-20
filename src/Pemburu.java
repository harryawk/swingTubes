/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

/**
 * A class that represents an illegal hunter which hunt animals within the ecosystem.
 * @author Ali Akbar
 */
public class Pemburu extends Manusia{
    /**
    *  	ctor that take one argument to set the position of the Pemburu
    * 	@param P is a Point, represent the first position of Pemburu in world
    */
    public Pemburu(Point P){
        super();
        set_DNA('C');
        set_umur(80);
        set_ulang_tahun(5);
        setPosisi(P);
        set_Kecepatan(3);
        set_Arah(1);
        setPredator(0,'C');
        setPredator(1,'!');
        setTarget(0,'u');
        setTarget(1,'g');
        setTarget(2,'m');
        setTarget(3,'b');
        setTarget(4,'h');
        setTarget(5,'y');
        setTarget(6,'^');
    }
    
    
    /**
    * A procedure that make the pemburu react to the other MakhlukHidup
    * @param M is a MakhlukHidup which this react to
    */
    @Override
    public void Reaction(MakhlukHidup M){
        if (M.getPosisi()== getPosisi()){
            if (get_DNA() == M.get_DNA()) {
                if (M.get_umur() >= get_umur())
                    setMati(true);
            } else if (isPredator(M.get_DNA())) {
                    setMati(true);
            }
        } else if (isRadius(6,M.getPosisi())){
            if (isTarget(M.get_DNA()) && (M.get_DNA() != '^')){
                set_Arah_Memburu(getPosisi(),M.getPosisi());
                setSedangMemburu(true);
            }
            else if (!getSedangMemburu())
                set_Arah_Bebas();
        } else if(isRadius(2,M.getPosisi())) {
            if (isPredator(M.get_DNA()))
                set_Arah_Menjauh(getPosisi(),M.getPosisi());
            else if (!getSedangMemburu())
                set_Arah_Bebas();
        } else {
            if (!getSedangMemburu())
                set_Arah_Bebas();
        }
    }
}
