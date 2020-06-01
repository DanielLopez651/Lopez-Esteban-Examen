/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.List;
import java.util.Scanner;
import ups.edu.ec.modelo.Electrodomestico;
import ups.edu.ec.modelo.Lavadora;
import ups.edu.ec.modelo.Television;

/**
 *
 * @author user
 */
public class VistaElectrodomestico {

    private Scanner entrada;

    public VistaElectrodomestico() {
        entrada = new Scanner(System.in);
    }

    public Television ingresarTele() {
        entrada = new Scanner(System.in);
        System.out.println("ingrese el codigo");
        int codigo = entrada.nextInt();
        System.out.println("ingrese descripcion");
        String descripcion = entrada.next();
        System.out.println("ingrese precio base");
        double precioBase = entrada.nextInt();
        System.out.println("ingrese color");
        String color = entrada.next();
        System.out.println("ingrese consumo energentico");
        char consumoEnergetico = entrada.next().charAt(0);
        System.out.println("ingrese el peso");
        int peso = entrada.nextInt();
        System.out.println("ingrese resolucion");
        int resolucion = entrada.nextInt();
        System.out.println("ingrese si tiene puerto HDMI");
        boolean puertoHDMI = entrada.hasNextBoolean();
        return new Television(resolucion, puertoHDMI, codigo, descripcion, precioBase, color, consumoEnergetico, peso);

    }
    public Lavadora ingresarLava() {
                        System.out.println("ingrese el codigo");
                int codigol=entrada.nextInt();
                System.out.println("ingrese descripcion");
                String descripcionl=entrada.next();
                System.out.println("ingrese precio base");
                double precioBasel= entrada.nextInt();
                System.out.println("ingrese color");
                String colorl=entrada.next();
                System.out.println("ingrese el peso");
                System.out.println("ingrese consumo energentico");
        char consumoEnergetico = entrada.next().charAt(0);
                int pesol=entrada.nextInt();
                System.out.println("ingrese carga");
                int carga=entrada.nextInt();
               return new Lavadora(carga, codigol, descripcionl, precioBasel, colorl, consumoEnergetico, pesol);
        
    }
     public void verE(Electrodomestico e) {
        System.out.println("Datos del Electrodomestico: " + e);
    }

    public void verEl(List<Electrodomestico> ele) {
        for (Electrodomestico e : ele) {
            System.out.println("Datos del Cliente: " + e);
        }
    }
    

}
//        int op = 0;
//        System.out.println("1---ingreso television");
//        System.out.println("2---ingreso lavadora");
//        System.out.println("3----mostrar lavadoras");
//        System.out.println("4----mostrar Televisiones");
//        op = entrada.nextInt();
//        switch (op) {
//            case 1:
//              
//                
//                System.out.println("ingrese el codigo");
//                int codigo=entrada.nextInt();
//                System.out.println("ingrese descripcion");
//                String descripcion=entrada.next();
//                System.out.println("ingrese precio base");
//                double precioBase= entrada.nextInt();
//                System.out.println("ingrese color");
//                String color=entrada.next();
//                System.out.println("ingrese consumo energentico");
//                char consumoEnergetico = entrada.next().charAt(0);
//                 System.out.println("ingrese el peso");
//                int peso=entrada.nextInt();
//                System.out.println("ingrese resolucion");
//                  int resolucion=entrada.nextInt();
//                  System.out.println("ingrese si tiene puerto HDMI");
//                  boolean puertoHDMI=entrada.hasNextBoolean();
//                 return new Television(resolucion, puertoHDMI, codigo, descripcion, precioBase, color, consumoEnergetico, peso)
//        
//                break;
//            case 2:
//                System.out.println("ingrese el codigo");
//                int codigol=entrada.nextInt();
//                System.out.println("ingrese descripcion");
//                String descripcionl=entrada.next();
//                System.out.println("ingrese precio base");
//                double precioBasel= entrada.nextInt();
//                System.out.println("ingrese color");
//                String colorl=entrada.next();
//                System.out.println("ingrese el peso");
//                int pesol=entrada.nextInt();
//                System.out.println("ingrese carga");
//                int carga=entrada.nextInt();
//               return new Lavadora(carga, codigol, descripcionl, precioBasel, colorl, pesol);
//                
//               
//                break;
//            case 3:
//                
//                break;
//            case 4:
//                break;
//
//        }
//        
//    }


