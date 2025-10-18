/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejoconsola;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("***Generador ID Unico***");
         var consola = new Scanner(System.in);
         var aleatorio = new Random();
         
         // Se pregunte por el nombre 
          System.out.print("Cual es tu  nombre?: ");
          var nombre = consola.nextLine();
          
          // Se pregunta el apellido
          System.out.print("Cual es tu  apellido?: ");
          var apellido = consola.nextLine();
          
          // se pregunta año de nacimiento
          System.out.print("Cual es tu año de nacimiento?: ");
          var anioNacimiento = consola.nextLine();
          
          // normalizamos los valores
          var nombre2 = nombre.trim().toUpperCase().substring(0,2);
          var apellido2 = apellido.trim().toUpperCase().substring(0,2);
          var  anioNacimiento2 = anioNacimiento.trim().substring(2);
          
          // Generamos el valor aleatorio (1,9999)
          var numeroAleatorio = aleatorio.nextInt(9999) + 1 ;
          
          // Formato de cuatro digitos
          var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);
          
          //Generar ID unico
          var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;
          
          // se imprimen los valores
        
          
    }
    
}
