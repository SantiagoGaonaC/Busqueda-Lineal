/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.lineal;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class BusquedaLineal {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String x = "";
        String a = "";
        do {            
            a = teclado.nextLine();
            x += a+",";
        } while (!"".equals(a));
        x = x.substring(0, x.length()-2);        
        String arregloString[] = x.split(",");
        int arreglo[] = new int[arregloString.length];
        for (int i = 0; i < arregloString.length; i++) {
            arreglo[i] = Integer.parseInt(arregloString[i]);
        } 
        
        int numeroABuscar = 4;

        
        int posicion = busquedaLineal(arreglo, numeroABuscar);
        if (posicion == -1) {
            System.out.print(
                    "El elemento no se encuentra");
        } else {
            System.out.println("El elemento está en la posición "
                    + posicion);
        }
    }
    public static int busquedaLineal(int arreglo[], int a) {        
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == a) {
                return i;
            }
        }
        return -1;
    }
}
