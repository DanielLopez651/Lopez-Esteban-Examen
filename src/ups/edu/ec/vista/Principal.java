/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.Scanner;
import ups.edu.ec.controlador.ControladorElectrodomestico;
import ups.edu.ec.controlador.ElectrodomesticoDAO;

/**
 *
 * @author user
 */
public class Principal {
    public static void main(String[] args) {
    //DAO
   
    private static final ElectrodomesticoDAO electrodomesticoDAO = new ElectrodomesticoDAO();
    //Vista
    private static final VistaElectrodomestico vistaE = new VistaElectrodomestico();
  
    //Controlador
   
    private static final ControladorElectrodomestico controladorE = new ControladorElectrodomestico(VistaElectrodomestico, electrodomesticoDAO, electrodomesticoDAO);
    }
}
