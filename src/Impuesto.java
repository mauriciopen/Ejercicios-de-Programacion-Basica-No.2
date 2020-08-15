/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;


public class Impuesto {

    public static void main(String[] args) {
        boolean rep = false;
        boolean error = false;
        int opc;
        int vehi;
        double bruto;
        double neto = 0;
        double impuesto = 0;
        do {
            System.out.println("Ingrese el tipo de vehiculo:\n"
                    + "(1) Carro\n"
                    + "(2) Camioneta");
            Scanner reader = new Scanner(System.in);
            vehi = reader.nextInt();
            System.out.println("Ingrese el precio del vehiculo");
            bruto = reader.nextDouble();
            switch (vehi) {
                case 1:
                    if (bruto < 20) {
                        impuesto = 5;
                        
                    }
                    if (20 <= bruto && bruto <= 40) {
                        impuesto = bruto / 5;
                        
                    }
                    if (bruto > 40) {
                        impuesto = 9;
                        
                    }
                    break;
                case 2:
                    if (bruto < 80) {
                        impuesto = 0;
                        
                    }
                    if (bruto >= 80) {
                        impuesto = bruto / 2;
                        
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
            neto = bruto + impuesto;
            System.out.println("El impuesto es: " + String.valueOf(impuesto) + "\n"
                    + "El precio neto es: " + String.valueOf(neto));
            do {
                error = false;
                System.out.println("¿Desea volver a intertarlo?\n"
                        + "(1)Si\n"
                        + "(2)No");
                opc = reader.nextInt();
                switch (opc) {
                    case 1:
                        rep = true;
                        break;
                    case 2:
                        rep = false;
                        break;
                    default:
                        error = true;
                        System.out.println("Opcion invalida");
                }
            } while (error);

        } while (rep);
    }

}
