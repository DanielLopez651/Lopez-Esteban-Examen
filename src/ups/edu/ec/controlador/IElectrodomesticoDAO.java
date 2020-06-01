/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.Collection;
import java.util.List;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author user
 */
public interface IElectrodomesticoDAO {

    public void create(Television television);

    public void create1(Lavadora lavadora);

    public Collection<Lavadora> FindAll();
    public Collection<Television> televisiones ();

    

}
