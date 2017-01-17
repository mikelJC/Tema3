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
public class EjercicioSTRINGconmetodo {
    
     public static void main(String[] argm){
    Scanner tec=new Scanner(System.in);
    
    String frase, palabra;
    int posicion, contador=0;
    
    System.out.println("introduce una frase");
    frase=tec.nextLine();
    validador(frase);

    System.out.println("elige una palabra de la frase");
    palabra=tec.nextLine();
    validador(palabra);
    
    
    cuentapalabras(palabra,frase);  
        
     }
     

     
     
     static public String validador(String a){
     Scanner tec=new Scanner(System.in);
         
        while (a.isEmpty()){
            System.out.println("introduce el dato, no lo dejes vacio");
            a=tec.nextLine();
        }
     
     return a;
     }
     

     
    static public void cuentapalabras(String p, String f){
         
     int posicion, contador=0;
         
    f = f.toLowerCase();
    p =p.toLowerCase();
    
    posicion = f.indexOf(p);
    
      if (f.startsWith(p)){
    contador++;
    }
    if (f.endsWith(p)){
    contador++;
    }

    
p = " "+p+" ";

    posicion = f.indexOf(p);
    
    while(posicion!=-1){
        contador++;
        posicion = f.indexOf(p, posicion+1);
    }
    
    System.out.println(contador);
    }
     
}


