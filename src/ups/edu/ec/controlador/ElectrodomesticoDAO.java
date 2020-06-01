/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author user
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    private Map<String,Electrodomestico>ele;
    public ElectrodomesticoDAO() {
        ele=new HashMap<String,Electrodomestico>();
    }

    @Override
    public void create(Television television) {
      // ele.put(television.getCodigo(), television);
    }

    @Override
    public void create1(Lavadora lavadora) {
      // ele.put(lavadora.getCodigo(), lavadora);
    }

    

    @Override
    public List<Television> televisiones() {
    Collection<Electrodomestico>televisiones=this.ele.values();
        return ele;
    }

    @Override
    public Collection<Lavadora> FindAll() {
     Collection<Electrodomestico>ele=this.ele.values();
        return ele;
    }

}
