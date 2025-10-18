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
public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados");
        var consola = new Scanner(System.in);
        
        
        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();
        
        // Edad del Empleado
        System.out.print("Edad del empleao: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());
        
        // Salario del empleado
        System.out.print("Salario del Empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());
        
        // Es jefe de departamento 
        System.out.print("Es jefe de departamento (true / false)?:");
        var esJefeDdepatamento = Boolean.parseBoolean(consola.nextLine());
        
        // Imprimir los valores del empleado
        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: "+ nombreEmpleado);
        System.out.println("\tEdad: "+ edadEmpleado + " " + "años");
        //System.out.println("\tSalario: "+ salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n",(salarioEmpleado));
        System.out.println("\tEs jefe de departamento?: "+ esJefeDdepatamento);
        
        
        
        
        
        
        
    }
}
