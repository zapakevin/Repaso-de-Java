/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejoconsola;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class recetaDecocina {
    public static void main(String[] args) {
        System.out.println("***Receta de Cocina***");
         var consola = new Scanner(System.in);
         
         // Nombre de la receta
         System.out.print("Ingresa el nombre: ");
         var nombreReceta = consola.nextLine();
         
         // Ingredientes de la receta 
         System.out.print("Ingresa los ingredientes: ");
         var ingredientes = consola.nextLine();
         
         // Tiempo de preparacion
         System.out.print("Ingresa el tiempo de preparacion (min): ");
         var tiempoPreparacion = Integer.parseInt(consola.nextLine());
         // Dificultad: facil, media, dificil.
         System.out.print("Ingresa la dificultad (Facil/Medio/Dificil): ");
         var dificultad = consola.nextLine();
         
         // Imprimir valores
         System.out.println("\n--- Receta De Cocina ---");
         System.out.println("\tIngresa el nombre: "+ nombreReceta);
         System.out.println("\tIngresa los ingredientes: "+ ingredientes);
         System.out.println("\tIngresa el tiempo de preparacion: " + tiempoPreparacion +" "+ "minutos");
         System.out.println("\tIngresa la dificultad: " + dificultad);
         
         
         
         
         
 
         
         
         
         
    }
    
}
