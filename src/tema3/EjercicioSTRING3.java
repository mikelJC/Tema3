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
public class EjercicioSTRING3 {
    
    public static void main(String[] argm){
    Scanner tec= new Scanner (System.in);
    
    String frase;
    int posicion=0, cont=0;
    
        System.out.println("introduce una frase");
        frase=tec.nextLine();
    
    while(frase.isEmpty()){
        System.out.println("no dejar vacio, introduce una frase");
        frase=tec.nextLine();    
    }    
        
        
    if (frase.length()>0){
        cont++;
    }
    
    posicion = frase.indexOf(" ");
    while (posicion!=-1){
    cont++;
    posicion = frase.indexOf(" ", posicion+1);
    }
    
    System.out.println(cont);
        
    }
    
}
