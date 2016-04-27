/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import organism.Organisme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class ListOfOrganisme {

    /**
     * A private list of organism.
     */
    private ArrayList<Organisme> organisms;

    /**
     * A constructor.
     */
    public ListOfOrganisme() {
      organisms = new ArrayList<>();
    }

    /**
     * a procedure to add organism to the list.
     * @param organs
     */
    public final void addOrganisme(final Organisme organs) {
      organisms.add(organs);
    }

    /**
     * @param i an integer.
     * @throws OutOfMemoryError
     */
    public final void deleteOrganismeAt(final int i) throws OutOfMemoryError {
      organisms.remove(i);
    }

    /**
     * a function that return the list of organism.
     * @return a List.
     */
    public List<Organisme> getList() {
      return organisms;
    }
}
