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
public abstract class Electrodomestico {
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergentico;
    private int peso;

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergentico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergentico = consumoEnergentico;
        this.peso = peso;
    }

 

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergentico() {
        return consumoEnergentico;
    }

    public void setConsumoEnergentico(char consumoEnergentico) {
        this.consumoEnergentico = consumoEnergentico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    public abstract double obtenerSalario();

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergentico=" + consumoEnergentico + ", peso=" + peso + '}';
    }
    
    
}
