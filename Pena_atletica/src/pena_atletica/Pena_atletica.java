/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pena_atletica;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class Pena_atletica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcasospruebas = sc.nextInt();
         int contador;

        for (int i = 0; i < numcasospruebas; i++) {
            int cantidadnumeros = sc.nextInt();
            contador=0;
            for (int b = 0; b < cantidadnumeros; b++) {
               int numero=sc.nextInt();
                if ( numero % 2 == 0) {
                    contador++;
                }
                 
            }
             
System.out.println(contador);
        }
       
    }
}
