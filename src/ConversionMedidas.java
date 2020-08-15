/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;


public class ConversionMedidas {

    public static void main(String[] args) {
        String unidad;
        double convertido = 0;
        double aconvertir;
        boolean rep = false;
        boolean error = false;
        int opc;
        do {
            Scanner reader = new Scanner(System.in);
            /*Lee el char y para evitar errores se usa .toUpperCase()*/
 /*para convertir la letra a mayuscula*/
            System.out.println("Elija una unidad:\n"
                    + "(P)ie\n"
                    + "(Y)arda\n"
                    + "(C)entimettro\n"
                    + "(L)egua");
            unidad = reader.next().toUpperCase();
            aconvertir = reader.nextDouble();
            switch (unidad) {
                case "C":

                    convertido = aconvertir / 2.54;
                    break;
                case "P":

                    convertido = aconvertir * 12;
                    break;
                case "Y":

                    convertido = aconvertir * 36;
                    break;
                case "L":

                    convertido = aconvertir * 190080;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Su medida convertida a pulgadas es: " + String.valueOf(convertido));
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
