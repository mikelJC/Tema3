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
public class EjercicioSTRING5 {
    public static void main (String[] argm){
    Scanner tec = new Scanner(System.in);
    
    String frase;
    String palabra;
    int posicion=0, espacio, empi=0;
    
    System.out.println("introduce una frase");
    frase = tec.nextLine();
    frase = frase + ' ';
            
    espacio = frase.indexOf(' ');
    posicion = frase.length();
    
    while (espacio!=-1){
      
       palabra = frase.substring(empi, espacio);
       System.out.println(palabra + " " +  palabra.length());
       empi = espacio +1;
       espacio = frase.indexOf(' ', empi);
    }

        }

    
    }

