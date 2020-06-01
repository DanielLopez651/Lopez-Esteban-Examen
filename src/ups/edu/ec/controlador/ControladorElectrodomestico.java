/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.util.List;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;
import ups.edu.ec.vista.VistaElectrodomestico;

/**
 *
 * @author user
 */
public class ControladorElectrodomestico {
    private VistaElectrodomestico vistaElectrodomestico;
    private IElectrodomesticoDAO IelectrodomesticoDAO;
    private ElectrodomesticoDAO electrodomesticoDAO;
    private Lavadora lavadora;
    private Television television;

    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, IElectrodomesticoDAO IelectrodomesticoDAO, ElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }

   public void registrar(){
       television=vistaElectrodomestico.ingresarTele();
       electrodomesticoDAO.create(television);
   }
    public void registrarL(){
       lavadora=vistaElectrodomestico.ingresarLava();
       electrodomesticoDAO.create(television);
   }
        public void verElectro() {
        List<Electrodomestico> e;
        e = electrodomesticoDAO.findAll();
        vistaElectrodomestico.verEl(e);
    }
   
    

    
    
}
