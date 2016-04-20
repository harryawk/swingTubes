package makhluk2;

/**
 * a class that represents plants as an organism within the ecosystem 
 * @author Hendricus
 */
class Tumbuhan extends MakhlukHidup
{
    /**
     * A constructor
     * Making a plant with a default value in every parameter
     */
    public Tumbuhan()
    {
        super();
    }

    /**
    * A constructor
    * Making a plant in a certain position
    * @param P Point which represent where this will be created
    */
    public Tumbuhan(Point P){
        super();
        setPosisi(P);
    }

    /**
    * define this MakhlukHidup behavior based on other MakhlukHidup
    * @param M is MakhlukHidup that cause this to react
    */
    public void Reaction(MakhlukHidup m)
    {
            if (isPredator(m.get_DNA()) && (getPosisi().getAbsis()==m.getPosisi().getAbsis()) 
                    && (getPosisi().getOrdinat()==m.getPosisi().getOrdinat())){
            setMati(true);
            }
    }
}