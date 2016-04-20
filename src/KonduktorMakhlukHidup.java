package makhluk2;
/**
 * An interface to told the MakhlukHidup to do it's behavior
 * 
 * @author Harry Alvin
 */
interface KonduktorMakhlukHidup {
    /**
     * Increasing the MskhlukHidup age according to it's duration to birthday celebration
     * @param m1 is a MakhlukHidup
     */
    public void aging(MakhlukHidup m1);
    /**
     * Pausing the lifeState of MakhlukHidup in the world
     */
    public void pause();
    /**
     * Returning the lifeState of MakhlukHidup in the world to normal
     */
    public void resume();
    /**
     * Set the count attribute to c
     * @param c is integer that count attribute want to be set
     */
    public void setCount(int c);
    /**
     * Get the count attributes
     * @return integer that represents the count attribute
     */
    public int getCount();
    /**
     * Analyzing what kind of MakhlukHidup is the m1
     * @param m1 is a MakhlukHidup class
     */
    public void hidup(MakhlukHidup m1);
    /**
     * Command the object that instance of Manusia to do Manusia's behavior
     * @param m1 is a Manusia class
     */
    public void hidup(Manusia m1);
    /**
     * Command the object that instance of Herbivora to do Herbivora's behavior
     * @param m1 is a Manusia class
     */
    public void hidup(Herbivora m1);
    /**
     * Command the object that instance of Karnivora to do Karnivora's behavior
     * @param m1 is a Karnivora class
     */
    public void hidup(Karnivora m1);
    /**
     * Command the object that instance of Omnivora to do Omnivora's behavior
     * @param m1 is a Omnivora class
     */
    public void hidup(Omnivora m1);
    /**
     * Command the object that instance of Tumbuhan to do Tumbuhan's behavior
     * @param t1 is a Tumbuhan class
     */
    public void hidup(Tumbuhan t1);
}