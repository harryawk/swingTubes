
package makhluk2;

import jcurses.system.*;
import jcurses.event.*;
import jcurses.util.*;
import jcurses.widgets.*;
import net.slashie.libjcsi.wswing.WSwingConsoleInterface;
import net.slashie.libjcsi.jcurses.JCursesConsoleInterface;
import net.slashie.libjcsi.ConsoleSystemInterface;
import java.util.*;
import java.io.*;

/**
 *  A World is a singleton that 
 *  contains information of all object within it and capable to display them.
 *  @author Harry Alvin
 */
class World  {
        /**
         * Dunia[][] to store the world's frame
         * size the limit of MakhlukHidup in World
         * count counter of MakhlukHidup currently in World
         * daftar the list of things that instance of MakhlukHidup
         * lifeState indicates the MakhlukHidup has died or not yet
         * Count counter of age
         * clear() void to clear the console screen
         */
        char Dunia[][] = new char[35][35];
        

///Administrator///=========================================================================
	private int size=10; //banyak makhluk maksimal
	private int count=0; //banyak makhluk dalam daftar
	private Vector<MakhlukHidup> daftar = new Vector<MakhlukHidup>(10);//array pointer objek makhluk
        
///Konduktor///=============================================================================
    private int lifeState;
    private int Count;

//private//=======================================================================================
        
	private void resetCursor()
	{
            //
	}
	//=======================================================================================
	private void moveCursor(int x, int y)
	{
		//System call set cursor to (x,y) at console
	}
	//=======================================================================================
	private void cursorSwitch(boolean b)
	{/*
	    HANDLE out = GetStdHandle(STD_OUTPUT_HANDLE);

	    CONSOLE_CURSOR_INFO     cursorInfo;

	    GetConsoleCursorInfo(out, cursorInfo);
	    cursorInfo.bVisible = b; // set the cursor visibility
	    SetConsoleCursorInfo(out, cursorInfo);*/
	}
        
	private void clear()
	{
		CLS n = new CLS();
		try {
			n.clear();
		} catch (IOException e1) {}
		catch (InterruptedException e2) {}
		finally {}
	}

//public//=============================================================================================
        
//World//==============================================================================================
	/**
	 *  A constructor of World class
	 */
        public World() {
            
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++)  {
                    Dunia[i][j] = '.';
                }
            }
        }
        /**
	 *  Store an empty world (all dot)
	 */
        public void printDunia() {
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 30; j++)  {
                    System.out.print(Dunia[i][j]);
                }
                System.out.println();
            }
        }
        /**
	 *  Draw an empty world (all dot)
	 */
        public void initDisplay() throws ExceptionInInitializerError
	{
            clear();
            size = 10;
            count = 0;
            lifeState = 1;
            Count = 0;
            resetCursor();
	    for(int i=0; i<30; i++)
	    {
	        for(int j=0; j<30; j++)
	        {
	            System.out.print(Dunia[i][j]);
	        }
	        System.out.println();
	    }
	}
        
        
//=======================================================================================
	/**
	 *  Draw all current object within world
	 */
        public void updateDisplay() throws ExceptionInInitializerError
	{
	    for(int i=0; i<get_count(); i++)
	    {
	        if(get_daftar(i) != null)
	        {
	            if(!get_daftar(i).isMati())
	            {
	                draw(get_daftar(i));
	            }
	            else
	            {
	                endDraw(get_daftar(i));
	                pluck(i);
	            }
	        }
	    }
	}
        
        /**
	 * update the position of a makhlukhidup within world matrix
         * @param i is index of would be updated makhlukhidup
	 */
	public void updateMakhluk(int i) throws ExceptionInInitializerError
	{
		boolean end = false;
		while(!end)
		{
			if(get_daftar(i) != null)
			{
				if(!get_daftar(i).isMati())
				{
					draw(get_daftar(i));
					try {
                                            Thread.sleep(100);
                                        } catch (InterruptedException e) {
                                            
                                        } finally {
                                            
                                        }
				}
				else
				{
					endDraw(get_daftar(i));
					try {
                                            Thread.sleep(3000);
                                        } catch (InterruptedException e1) {
                                            
                                        } finally {
                                            
                                        }
					pluck(i);
					end = true;
				}
			}
		}
	}
        /**
	 *  Draw display at Pc and remove the previous drawing at Px
         *  @param Px is previous position that would be erased
         *  @param Pc is the new position that would be drawn
         *  @param display is the character that would be drawn at Pc
	 */
	public void draw(Point Px, Point Pc, char display) throws ExceptionInInitializerError
	{
		int ex_X = Px.getAbsis();
		int ex_Y = Px.getOrdinat();
		int x = Pc.getAbsis();
		int y = Pc.getOrdinat();
                    
                Dunia[ex_X][ex_Y] = '.';
                //csi.print(ex_X,ex_Y,".");
                Dunia[x][y] = display;
                
                //csi.print(x, y, Character.toString(display));
                    
	}
        /**
	 *  Draw display at Pc and without removing the drawing at Px
         *  @param Pc is the position of the drawing
         *  @param char is the character that would be drawn
	 */
	public void draw(Point Pc, char display) throws ExceptionInInitializerError
	{
		int x = Pc.getAbsis();
		int y = Pc.getOrdinat();
                
                
                Dunia[x][y] = display;
	}
        /**
	 *  Draw Makhlukhidup at it's current position and remove it's previous drawing
         *  @m1 is MakhlukHidup that would be drawn
	 */
	public void draw(MakhlukHidup m1) throws ExceptionInInitializerError
	{
		Point P  = new Point(); 
                P = m1.getPosisi();
		Point PP = new Point(); 
                PP = m1.getPrecPosisi();
		draw(PP, P, m1.get_DNA());

		m1.setPrecPosisi(P);
	}
        /**
	 *  Draw Makhlukhidup for when it first drawn
         *  @m1 is MakhlukHidup that would be drawn
	 */
	public void initDraw(MakhlukHidup m1) throws ExceptionInInitializerError
	{
		draw(m1.getPosisi(), m1.get_DNA());

		m1.setPrecPosisi(m1.getPosisi());
	}
        /**
	 *  Draw Makhlukhidup for when it's dead status
         *  @m1 is dead MakhlukHidup that would be drawn
	 */
	public void endDraw(MakhlukHidup m1) throws ExceptionInInitializerError
	{
		draw(m1.getPrecPosisi(), '.');
		draw(m1.getPosisi(), '_');
	}
        /**
	 *  Check wether game-over condition is met
         *  @return true when gameover
	 */
	public boolean isGameOver()
	{
		if(get_count() <= 0) return true;
		else				 return false;
	}
        /**
	 *  Save current world in txt format
	 */
	public void tangkapLayar() throws IOException, NullPointerException
	{
		boolean found;
		File outfile = new File("out.txt");
		outfile.createNewFile();
		FileWriter out = new FileWriter(outfile);

		for(int i=0; i<30; ++i)
		{
			for(int j=0; j<30; ++j)
			{
				found = false;
				if (!daftar.isEmpty()) {
                                    for(int k=0; k<get_size(); k++)
                                    {
                                            if((get_daftar(k) != null) && (get_daftar(k).getPosisi().getAbsis()==j) && (get_daftar(k).getPosisi().getOrdinat()==i))
                                            {
                                                    out.write(get_daftar(k).get_DNA()+"");
                                                    found = true;
                                            }
                                    }
                                    if(!found) out.write(".");
                                } else {
                                    out.write(".");
                                }
			}
			out.write("\n");
		}
		out.flush();
		out.close();
	}
        /**
 	*  create a new MakhlukHidup and put it in monitored list
        *  @param P is position where the new creation will be created
        *  @param opsi determine what MakhlukHidup is created
 	*/	
	public void creation(Point P, char opsi)
	{
		if(get_count() < get_size())
		{
			switch (opsi)
			{
				case '1' :
				{
					Polisi m = new Polisi(P);
					fillDaftar(m);
					break;
				}

				case '2' :
				{
					Herbivora m = new Herbivora();
                                        Factory.makeGajah(m);
					fillDaftar(m);
					break;
				}

				case '3' :
				{
					Karnivora m = new Karnivora();
                                        Factory.makeHyena(m);
					fillDaftar(m);
					break;
				}

				case '4' :
				{
					Omnivora m = new Omnivora();
                                        Factory.makeBeruang(m);
					fillDaftar(m);
					break;
				}

				case '5' :
				{
					Pemburu m = new Pemburu(P);
					fillDaftar(m);
					break;
				}

				case '6' :
				{
					Tumbuhan m = new Tumbuhan();
                                        Factory.makeRumput(m);
					fillDaftar(m);
					break;
				}

				case '7' :
				{
					Tumbuhan m = new Tumbuhan();
                                        Factory.makePohon(m);
					fillDaftar(m);
					break;
				}

				case '8' :
				{
					Herbivora m = new Herbivora();
                                        Factory.makeUnta(m);
					fillDaftar(m);
					break;
				}

				case '9' :
				{
					Karnivora m = new Karnivora();
                                        Factory.makeHarimau(m);
					fillDaftar(m);
					break;
				}

				case '0' :
				{
					Omnivora m = new Omnivora();
                                        Factory.makeMandril(m);
					fillDaftar(m);
					break;
				}
			}
		}
	}
        /**
 	*  make Mati attributes of all MakhlukHidup in daftar = true
 	*/	
	public void killAll()
	{
		for(int i=0; i<get_count(); i++)
		{
			if(get_daftar(i) != null)
			{
				get_daftar(i).setMati(true);
			}
		}
	}

///Konduktor///=======================================================================
    /**
     * Setter lifestate method
     * @param ls integer
     */
    public void setLifeState(int ls) {
        lifeState = ls;
    }
    /**
     * Getter lifeState method
     * @return integer
     */
    public int getLifeState() {
        return lifeState;
    }
    /**
     * Aging of MakhlukHidup 
     * @param m1 MakhlukHidup
     */
    public void aging(MakhlukHidup m1) {
        if((lifeState == 1) && (Count%10 == 0)) {
            m1.menua();
        }
    }
    /**
     * Setting the lifestate with 0
     */
    public void pause() {
    	lifeState = 0;
    }
    /**
     * Setting the lifestate with 1
     */
    public void resume() {
    	lifeState = 1;
    }
    /**
     * Setting the count member with c
     * @param c integer
     */
    public void setCount(int c) {
    	Count = c;
    }
    /**
     * Getter count member
     * @return integer
     */
    public int getCount() {
    	return Count;
    }
    /**
     * Making the reactions and the age of the MakhlukHidup
     * @param m1 MakhlukHidup
     */
    public void hidup(MakhlukHidup m1) {
        if (!(m1 instanceof Tumbuhan)) {
            if(lifeState == 1) //cek pause atau tidak
            {
                if(((Hewan)m1).get_Kecepatan() != 0)
                {
                    if (Count%(10-((Hewan)m1).get_Kecepatan()) == 0){
                        if((((Hewan)m1).getPosisi().getAbsis() >= 29) && (((Hewan)m1).getPosisi().getOrdinat() >= 29))//ujung kanan-bawah
                        {
                            Point posisi = new Point(28,28);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if((((Hewan)m1).getPosisi().getAbsis() == 0) && (((Hewan)m1).getPosisi().getOrdinat() >= 29))//kiri-bawah
                        {
                            Point posisi = new Point(1,28);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if((((Hewan)m1).getPosisi().getAbsis() >= 29) && (((Hewan)m1).getPosisi().getOrdinat() == 0))//kanan-atas
                        {
                            Point posisi = new Point(28,1);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if((((Hewan)m1).getPosisi().getAbsis() >= 0) && (((Hewan)m1).getPosisi().getOrdinat() == 0))//kiri-atas
                        {
                            Point posisi = new Point(1,1);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if(((Hewan)m1).getPosisi().getAbsis() >= 29)//kanan
                        {
                            Point posisi = new Point(28,m1.getPosisi().getOrdinat());
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if(((Hewan)m1).getPosisi().getAbsis() == 0)//kiri
                        {
                            Point posisi = new Point(1,m1.getPosisi().getOrdinat());
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if(((Hewan)m1).getPosisi().getOrdinat() >= 29)
                        {
                            Point posisi = new Point(m1.getPosisi().getAbsis(),28);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else if(((Hewan)m1).getPosisi().getOrdinat() == 0)
                        {
                            Point posisi = new Point(m1.getPosisi().getAbsis(),1);
                            ((Hewan)m1).setPosisi(posisi);

                            ((Hewan)m1).gerak_berarah();
                        }
                        else
                        {
                            ((Hewan)m1).gerak_berarah();
                        }

                        ((Hewan)m1).setSedangMemburu(false);
                    }
                }
            }
            else if(lifeState == 0)
            {

            }
        }
    }
    ///Administrator///======================================================================================
    /**
    *  put in a MakhlukHidup in the monitored list
    */
    public void fillDaftar(MakhlukHidup n)
    {
            daftar.add(count,n);
            count++;
    }
    /**
    *  put out a MakhlukHidup in the monitored list with certain pointer
    */	
    public void pluck(MakhlukHidup n)
    {
            for(int i=0; i<get_count(); i++)
            {
                    if(get_daftar(i) == n)
                    {
                            daftar.remove(i);
                            break;
                    }
            }
    }
    /**
    *  put out a MakhlukHidup in the monitored list with certain index
    */	
    public void pluck(int i)
    {
            daftar.remove(i);
            count--;
    }
    /**
    *  create a thread to monitor each pair of MakhlukHidup
    */	
    public void sinyal()
    {
        for(int i1=0; i1 < get_count(); i1++){
            for(int i2=0; i2 < get_count(); i2++)
            {
                if(i1 != i2)
                {
                        get_daftar(i1).Reaction(get_daftar(i2));
                }
            }
        }
    }
    /**
     * Getter size attribute
     * @return this.size integer
     */
    public int get_size()
    {
            return size;
    }
    /**
     * Getter count attribute
     * @return this.count integer
     */
    public int get_count()
    {
            return daftar.size();
    }
    /**
     * Getter of daftar attribute
     * @return 
     */
    public Vector<MakhlukHidup> get_daftar()
    {
            return daftar;
    }
    /**
     * Getter of the contains of daftar attribute
     * @param i
     * @return 
     */
    public MakhlukHidup get_daftar(int i)
    {
            return daftar.get(i);
    }
    /**
     * Setter
     * @param s size
     */
    public void set_size(int s)
    {
            size = s;
    }
    /**
     * Setter
     * @param c count
     */
    public void set_count(int c)
    {
            count = c;
    }
}