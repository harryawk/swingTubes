package makhluk2;

/**
 * a base class for all organism within the ecosystem
 * @author Aditio Pangestu
 */
public abstract class MakhlukHidup {
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
	 * A table attribute that contains the predator's DNA of this organism
	 */
	private char[] predator;
	
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
	 * A constant value that contains the predator table size
	 */
	private int ukuran_predator;
	
	/**
	 * A boolean value, used to check wheter the organism die or not
	 */
	private boolean mati;
	
	/**
	 * A constructor
	 * Making an organism with a default value in every parameter
	 */
	public MakhlukHidup(){
                posisi = new Point();
                PPosisi = new Point();
		umur = 0;
		DNA = '*';
		ulang_tahun = 0;
		ukuran_predator = 10;
		predator = new char[ukuran_predator];
		for (int i=0; i<ukuran_predator; i++)
			predator[i] = ' ';
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
	public char getPredator(int i){
		return predator[i];
	}
	
	/**
	 * A getter for predator table size
	 * @return an integer
	 */ 
	public int getUkuranPredator(){
		return ukuran_predator;
	}
	
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
	 * A setter for Predator
	 * @param i is integer argument for table index, this integer is always valid
	 * @param _predator is char of the predator's DNA
	 */
	public void setPredator(int i, char _predator){
		predator[i] = _predator;
	}
	
	/**
	 * A setter for mati
	 * @param _mati is boolean that used to tell if organism die or not
	 */
	public void setMati(boolean _mati){
		mati = _mati;
	}
	
	/**
	 * A normal member that takes one char argument and return boolean
	 * @param DNA_predator is char of the Predator's DNA
	 * @return a boolean that is true if the DNA is in the predator table and false if either.
	 */
	public boolean isPredator(char DNA_predator){
		int i = 0;
		boolean stopCheckingIsPredator = false;
		while (i < getUkuranPredator() && (!stopCheckingIsPredator) ) {
			if (getPredator(i) == DNA_predator) {
				stopCheckingIsPredator = true;
			} else {
				i++;
			}
		}
		return (i < getUkuranPredator());
	}
	
	/**
	 * A normal member that takes two argument and return boolean
	 * @param rad is integer, the radius of circle
	 * @param p is Point of another organism
	 * @return a boolean that is true if the coordinate of another organism is in the radius
	 * area of this organism Position and false if either
	 */
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
	
	/**
	 * A pure virtual member
         * define this MakhlukHidup behavior based on other MakhlukHidup
         * @param M is MakhlukHidup that cause this to react
	 */
	public abstract void Reaction( MakhlukHidup M);
}
