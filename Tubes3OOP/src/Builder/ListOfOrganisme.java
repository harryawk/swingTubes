/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Organism.Organisme;
import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class ListOfOrganisme {
    private List<Organisme> organisms;
    
    /**
     *
     * @param O
     */
    public void addOrganisme(Organisme O){
        organisms.add(O);
    }
    
    /**
     *
     * @param i
     */
    public void deleteOrganisme(int i){
        organisms.remove(i);
    }
    
    /**
     *
     * @return
     */
    public List<Organisme> getList(){
        return organisms;
    }
}
