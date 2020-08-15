/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

public class CirculoInscrito {

    public static void main(String[] args) {
        boolean rep = false;
        boolean error = false;
        int opc;
        double radio;
        double area;

        do {
            System.out.println("Ingrese el radio del circulo");
            Scanner reader = new Scanner(System.in);
            radio = reader.nextDouble();
            area = (Math.PI * Math.pow(radio, 2)) - Math.pow(radio, 2);
            System.out.println("El area de la region es: " + area);
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
