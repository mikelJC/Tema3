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
public class EjercicioSTRING {
    
    public static void main(String[] argm){
    Scanner tec=new Scanner(System.in);
    
    String frase, palabra;
    int posicion, contador=0;
    
    System.out.println("introduce una frase");
    frase=tec.nextLine();
    validadorF(frase);

    System.out.println("elige una palabra de la frase");
    palabra=tec.nextLine();
    validadorP(palabra);
  
    frase = frase.toLowerCase();
    palabra = palabra.toLowerCase();

    
    posicion = frase.indexOf(palabra);
    
      if (frase.startsWith(palabra)){
    contador++;
    }
    if (frase.endsWith(palabra)){
    contador++;
    }

    
palabra = " "+palabra+" ";

    posicion = frase.indexOf(palabra, posicion+1);
    
    while(posicion!=-1){
        contador++;
        posicion = frase.indexOf(palabra, posicion+1);
    }
    
    System.out.println(contador);
    }
    
    
    
    
    
    
    
    
    
    
    static void validadorF(String frase){
        Scanner tec=new Scanner(System.in);
        while (frase.isEmpty()){
            System.out.println("introduce una frase, no lo dejes vacio");
            frase=tec.nextLine();
        }  
    } 
    static void validadorP(String palabra){
        Scanner tec=new Scanner(System.in);
        while (palabra.isEmpty()){
            System.out.println("introduce una palabra, no lo dejes vacio");
            palabra=tec.nextLine();
        }
    } 
    
}
