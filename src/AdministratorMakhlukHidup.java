package makhluk2;

import java.util.Vector;
/**
 * An interface to MakhlukHidup.
 * For monitoring interaction between object within the world.
 * 
 * @author Harry Alvin
 */
interface AdministratorMakhlukHidup {
    /**
     * put in a MakhlukHidup in the monitored list
     * 
     * @param n MakhlukHidup
     */
    public void fillDaftar(MakhlukHidup n);
    /**
     * put out a MakhlukHidup in the monitored list with certain value
     * 
     * @param n MakhlukHidup
     */
    public void pluck(MakhlukHidup n);
    /**
     * put out a MakhlukHidup in the monitored list with certain index
     * 
     * @param i integer index of the MakhlukHidup
     */
    public void pluck(int i);
    /**
     * create a thread to monitor each pair of MakhlukHidup
     */
    public void sinyal();
    /**
     * Get size of the daftar attribute
     * @return integer size, member of AdministratorMakhlukHidup
     */
    public int get_size();
    /**
     * Get the sum of MakhlukHidup in daftar attribute
     * @return integer count, number of MakhlukHidup inside daftar
     */
    public int get_count();
    /**
     * Get the daftar attribute that is represented by Vector
     * @return Vector of MakhlukHidup
     */
    public Vector<MakhlukHidup> get_daftar();
    /**
     * Get the contains of daftar attribute within certain index
     * @param i integer of index MakhlukHidup is placed
     * @return MakhlukHidup that wanted to be extracted from daftar attribute
     */
    public MakhlukHidup get_daftar(int i);
    /**
     * Set the size attribute
     * @param s integer size
     */
    public void set_size(int s);
    /**
     * Set the count attribute
     * @param c integer count
     */
    public void set_count(int c);
}