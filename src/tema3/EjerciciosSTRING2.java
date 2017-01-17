/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class EjerciciosSTRING2 {
    public static void main (String[] argm){
        Scanner tec = new Scanner(System.in);
        
        String cadena;
        char palabra, espacio=' ';
        int num, largo;
        
            System.out.println("introduce una frase");
            cadena=tec.nextLine();
        
            System.out.println("introduce un numero entero");
            num=tec.nextInt();
            
                       largo = cadena.length();
            
            if (num>largo){
                System.out.println("el numero es demasiado alto");
            }else{
   
            palabra = cadena.charAt(num);
            
            
            
            if (palabra==espacio){
            System.out.println("espacio vacio");
            }else{
            System.out.println(palabra);
            
                }
            }
    }
}
