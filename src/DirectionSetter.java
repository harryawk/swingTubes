package makhluk2;
/**
 * An interface that set every directions move of MakhlukHidup
 * 
 * @author Aditio Pangestu
 */
interface DirectionSetter {
	
    /**
     * A setter for Arah.
     * @param arah is integer argument that will be assigned to dircetion.
     * It has value between 1 to 8.
     */
	void set_Arah(int arah);
    
    /**
     * A setter for Arah.
     * Set direction attribute with random integer which has value between 1 to 8.
     */
    void set_Arah_Bebas();
    
    /**
     * A setter for Arah.
     * Set direction attribute with integer which references direction from origin to destination
     * @param Awal A point argument describe the origin
     * @param Target A point argument describe the destination.
     */
    void set_Arah_Memburu(Point Awal, Point Target);
    
    /**
     * A setter for Arah.
     * Set direction attribute with integer which references direction which away from predator
     * @param Awal A point argument describe the origin
     * @param Predator A point argument describe the predator.
     */
    void set_Arah_Menjauh(Point Awal, Point Predator);

}