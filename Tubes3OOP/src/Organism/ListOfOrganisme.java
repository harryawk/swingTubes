/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class ListOfOrganisme {
    private List<Organisme> organisms;
    
    public void addOrganisme(Organisme O){
        organisms.add(O);
    }
    
    public void deleteOrganisme(int i){
        organisms.remove(i);
    }
    
    public List<Organisme> getList(){
        return organisms;
    }
}
