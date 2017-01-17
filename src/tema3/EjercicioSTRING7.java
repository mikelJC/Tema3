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
public class EjercicioSTRING7 {
    
    public static void main (String[] argm){
    Scanner tec = new Scanner(System.in);
    
    String frase;
    
    System.out.println("introduce uns frase");
    frase = tec.nextLine();
    
    for (int x=0; x<frase.length(); x++){
    
        if(frase.charAt(x)!= ' '){
        System.out.print(frase.charAt(x));
        }
    }
    }
}
