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
public class EjercicioSTRING4 {
    
    public static void main (String[] argm){
    Scanner tec = new Scanner(System.in);    
    
    String frase;
    int contador=0;
    
        System.out.println("introduce una frase");
        frase=tec.nextLine();
        frase = frase.toLowerCase();
        
        for(int x=0;x<frase.length();x++) {
                if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){
                contador++;
                }
        }
        
        System.out.println(contador);
    
    }
    
    
    
}
