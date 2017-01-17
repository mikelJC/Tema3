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
public class EjercicioSTRING6 {
    
    public static void main (String[] argm){
    Scanner tec = new Scanner(System.in);
    
    

    String frase;
    int posicion=0, espacio, empi=0, inicial;
    
    System.out.println("introduce un nombre");
    frase = tec.nextLine();
    frase = " " +frase;
            
    espacio = frase.indexOf(' ');
    
    
    while(espacio != -1){
        
        inicial = espacio+1;
        System.out.print(frase.charAt(inicial));
        espacio = frase.indexOf(' ',inicial);
    }
    
 }
}
