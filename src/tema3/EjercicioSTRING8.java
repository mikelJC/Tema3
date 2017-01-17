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
public class EjercicioSTRING8 {
    public static void main (String[] argm){
    Scanner tec = new Scanner(System.in);
    
    String frase, fraseinvertida="";
    
    System.out.println("introduce una frase");
    frase = tec.nextLine();
    
    
    for(int x = frase.length()-1; x>=0; x--){
        fraseinvertida=fraseinvertida+frase.charAt(x);
    }
    System.out.print(fraseinvertida);
    
    
    }
}
