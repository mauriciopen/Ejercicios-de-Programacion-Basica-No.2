/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;


public class Restaurante {

    public static void main(String[] args) {
        boolean rep = false;
        boolean error = false;
        int opc;
        int platos = 0;
        double preciounidad = 0;
        double precioplatos = 0;
        double precioiva = 0;
        double preciodescuento = 0;
        do {
            System.out.println("¿A que categoria pertenece su plato?:\n"
                    + "(1)Vegetariana\n"
                    + "(2)No vegetariana\n"
                    + "(3)Comida rapida ");
            Scanner reader = new Scanner(System.in);
            opc = reader.nextInt();
            System.out.println("Estos son los platos disponibles:");
            switch (opc) {
                case 1:
                    System.out.println("(1)Sopa de vegetales\n"
                            + "(2)Ensaladas\n"
                            + "(3)Jugos");
                    opc = reader.nextInt();
                    System.out.println("¿Cuantos platos desea pedir?");
                    platos = reader.nextInt();
                    switch (opc) {
                        case 1:
                            preciounidad = 10000;
                            break;
                        case 2:
                            preciounidad = 25000;
                            break;
                        case 3:
                            preciounidad = 5000;
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    precioplatos = preciounidad * platos;
                    precioiva = precioplatos + ((precioplatos * 19) / 100);
                    preciodescuento = precioiva - ((precioiva * 20) / 100);
                    break;
                case 2:
                    System.out.println("(1)Bandeja de carne\n"
                            + "(2)Bandeja de pollo");
                    opc = reader.nextInt();
                    System.out.println("¿Cuantos platos desea pedir?");
                    platos = reader.nextInt();
                    switch (opc) {
                        case 1:
                            preciounidad = 30000;
                            break;
                        case 2:
                            preciounidad = 28000;
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
                    precioplatos = preciounidad * platos;
                    precioiva = precioplatos + ((precioplatos * 19) / 100);
                    preciodescuento = precioiva - ((precioiva * 10) / 100);
                    break;
                case 3:
                    System.out.println("(1)Perro caliente\n"
                            + "(2)Hamburguesa");
                    opc = reader.nextInt();
                    System.out.println("¿Cuantos platos desea pedir?");
                    platos = reader.nextInt();
                    switch (opc) {
                        case 1:
                            preciounidad = 5000;
                            break;
                        case 2:
                            preciounidad = 7000;
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                    precioplatos = preciounidad * platos;
                    precioiva = precioplatos + ((precioplatos * 19) / 100);
                    preciodescuento = 0;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Factura:\n"
                    + "-------------------------------------------------------------\n"
                    + "Precio por todos los platos: " + String.valueOf(precioplatos) + "\n"
                    + "Precio + IVA: " + String.valueOf(precioiva));
            if (preciodescuento == 0) {
                System.out.println("No tiene descuento\n"
                        + "-------------------------------------------------------------");
            } else {
                System.out.println("Precio con descuento: " + String.valueOf(preciodescuento) + "\n"
                        + "-------------------------------------------------------------");
            }
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
