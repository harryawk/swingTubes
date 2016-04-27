/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Organism.Organisme;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali-pc
 */
public class ListOfOrganisme {

  private ArrayList<Organisme> organisms;

  public ListOfOrganisme() {
    organisms = new ArrayList<Organisme>();
  }

  /**
   *
   * @param O
   */
  public void addOrganisme(Organisme O) {
    organisms.add(O);
  }

  /**
   *
   * @param i
   */
  public void deleteOrganismeAt(int i) throws OutOfMemoryError {
    organisms.remove(i);
  }

  /**
   *
   * @return
   */
  public List<Organisme> getList() {
    return organisms;
  }
}
