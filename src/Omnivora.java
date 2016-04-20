package makhluk2;

/**
 * A class that represents an omnivore as an organism within the ecosystem
 * @author Aditio Pangestu
 */
public class Omnivora extends Hewan {
	/**
	 * A constructor
	 * Making a carnivore animals with a default value in every parameter
	 */
	public Omnivora(){
		super();
	}
	
        /**
        * A constructor
        * Making a omnivore animals in a certain position
        * @param P Point define where Omnivora will be created
        */
        public Omnivora(Point P){
            super();
            setPosisi(P);
        }
        
	/**
	 * A member procedure
	 * A process that make the age of the omnivore decrease by one
	 */
	public void memuda(){
            int newUmur = get_umur() - 1;
	    set_umur(newUmur);
	}
	
	/**
	 * A function to check whether the organism is plant or not
	 * @param M is MakhlukHidup to check
	 * @return a boolean
	 */
	public boolean isTumbuhan(MakhlukHidup M){
		if ((M.get_DNA() == '^') || (M.get_DNA() == '!')){
	        return true;
	    }
	    else {
	        return false;
	    }
	}
	
	/**
         * define this MakhlukHidup behavior based on other MakhlukHidup
         * @param M is MakhlukHidup that cause this to react
	 */
	public void Reaction(MakhlukHidup M){
		if (M.getPosisi()== getPosisi()){
        if (get_DNA() == M.get_DNA()) {
            if (M.get_umur() >= get_umur()) {
                setMati(true);
            }
        } else {
            if (isPredator(M.get_DNA()))
                setMati(true);
            else
                if (isTumbuhan(M)){
                    memuda();
                }
                set_tingkat_kekenyangan(get_maks_tingkat_kekenyangan());
	        }
	    } else if (isRadius(2,M.getPosisi())){
	        if ((isTarget(M.get_DNA())) && (getMemburu()))
	            set_Arah_Memburu(getPosisi(),M.getPosisi());
	        else
	            set_Arah_Bebas();
	    }else{
	        set_Arah_Bebas();
	    }
	}
}
