/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

/**
 * a class that represents a human who hunt down illegal hunter
 * @author Ali Akbar
 */
public class Polisi extends Manusia{
    /**
    *  	ctor that take one argument to set the position of the Polisi
    * 	@param P is a Point, first position of Polisi class
    */
    public Polisi(Point P){
        super();
        set_DNA('C');
        set_umur(80);
        set_ulang_tahun(5);
        setPosisi(P);
        set_Kecepatan(3);
        set_Arah(1);
        //setPredator
        setPredator(0,'u');
        setPredator(1,'g');
        setPredator(2,'m');
        setPredator(3,'b');
        setPredator(4,'h');
        setPredator(5,'y');
        setPredator(6,'!');

        //setTarget
        setTarget(0,'H');
        setTarget(1,'^');
    }
    /**
    * define this MakhlukHidup behavior based on other MakhlukHidup
    * @param M is MakhlukHidup that cause this to react
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
        }else if (isRadius(10,M.getPosisi())){
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
