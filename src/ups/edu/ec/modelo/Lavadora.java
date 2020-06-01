/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author user
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergentico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergentico, peso);
        this.carga = carga;
    }



    

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
 @Override
    public double obtenerSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

   
    
    
}
