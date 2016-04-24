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
public abstract class Organisme extends CautionMovement{
    /**
	 * An attribute that save organism's age
	 */
	private int umur;
	
	/**
	 * An attribute that save the birthday of organism
	 */
	private int ulang_tahun;
	
	/**
	 * An attribute that save the DNA character of organism
	 */
	private char DNA;
	
	
	/**
	 * An integer constant value for organism's age-limit
	 */
	private int batas_umur;
	
	/**
	 * A Point that contains the position of organism
	 */
	private Point posisi;
	
	/**
	 * A Point that contains the previous position of organism
	 */
	private Point PPosisi;
	
	
	/**
	 * A boolean value, used to check wheter the organism die or not
	 */
	private boolean mati;
	
	/**
	 * A constructor
	 * Making an organism with a default value in every parameter
	 */
	public Organisme(){
                posisi = new Point();
                PPosisi = new Point();
		umur = 0;
		DNA = '*';
		ulang_tahun = 0;
		mati = false;
	}
	
	/**
	 * A normal procedure member
	 * A procedure that increase the age of the organism when this procedure called
	 */ 
	public void menua(){
		umur++;
	}
	
	/**
	 * A virtual member that takes zero argument and return boolean
	 * A function to check if the organism is die or not, "died" defined in the child class
	 * @return boolean, true if die and false if not.
	 */
	public boolean isMati(){
		return mati;
	}
   
	/**
	 * A getter for umur attribute
	 * @return an integer, the age of organism
	 */
	public int get_umur(){
		return umur;
	}
	
	/**
	 * A getter for ulangtahun attribute ( the birthday of organism )
	 * @return an integer
	 */
	public int get_ulang_tahun(){
		return ulang_tahun;
	}
	
	/**
	 * A getter for organism's DNA
	 * @return a char
	 */
	public char get_DNA(){
		return DNA;
	}
	
	/**
	 * A getter for age limit of organism
	 * @return an integer
	 */
	public int get_batas_umur(){
		return batas_umur;
	}
	
	/**
	 * A getter for organism Position
	 * @return a point, a coordinate of organism
	 */
	public Point getPosisi(){
		return posisi;
	}
	
	/**
	 * A getter for organism Previous Position
	 * @return a point
	 */
	public Point getPrecPosisi(){
		return PPosisi;
	}
	
	/**
	 * A getter for what is the "i"th predator in predator table
	 * @param i an integer argument
	 * @return a char in Predator[i]
	 */
	
	
	/**
	 * A setter for umur
	 * @param a is integer arguments that will be assigned to umur
	 */
	public void set_umur(int a){
		umur = a;
	}
        
        public void set_batas_umur(int a){
		batas_umur = a;
	}
	
	/**
	 * A setter for ulangtahun
	 * @param a is integer arguments that will be assigned to ulangtahun
	 */
	public void set_ulang_tahun(int a){
		ulang_tahun = a;
	}
	
	/**
	 * A setter for DNA
	 * @param a char argument that will be assigned to DNA
	 */
	public void set_DNA(char a){
		DNA = a;
	}
	
	/**
	 * A setter for Position
	 * @param P is Point argument that will be assigned to Position Cordinate
	 */
	public void setPosisi(Point P){
            posisi = new Point();
            posisi.setAbsis(P.getAbsis());
            posisi.setOrdinat(P.getOrdinat());
	}
	
	/**
	 * A setter for PPosition
	 * @param P is Point argument that will be assigned to PPosition Cordinate
	 */
	public void setPrecPosisi(Point P){
            PPosisi = new Point();
            PPosisi.setAbsis(P.getAbsis());
            PPosisi.setOrdinat(P.getOrdinat());
	}
	
	/**
	 * A setter for mati
	 * @param _mati is boolean that used to tell if organism die or not
	 */
	public void setMati(boolean _mati){
		mati = _mati;
	}
	
	/**
	 * A pure virtual member
         * define this MakhlukHidup behavior based on other MakhlukHidup
         * @param M is MakhlukHidup that cause this to react
	 */
	public abstract void Reaction(Organisme M);
        
        public boolean isRadius (int rad, Point p){
            int _x, _y;
            _x = posisi.getAbsis() - p.getAbsis();
            if (_x < 0)
                    _x = 0 - _x;
            _y = posisi.getOrdinat() - p.getOrdinat();
            if (_y < 0)
                    _y = 0 - _y;
            return ((_y <= rad) &&(_x <= rad));
	}
}
