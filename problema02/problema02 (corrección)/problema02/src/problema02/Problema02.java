/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaro 
        String nombre1;
        String nombre2;
        String nombre3;
        //pedir datos
        System.out.println("Ingrese el nombre del primer hijo: ");
        nombre1 = entrada.nextLine();
        
        System.out.println("Ingesar los gastos de "+nombre1);
        double gastosHijo1 = entrada.nextDouble();
        
        System.out.println("Ingrese el nombre del segndo hijo: ");
        entrada.nextLine(); //limpieza de buffer
        nombre2 = entrada.nextLine();
        
        System.out.println("Ingresar los gastos de "+nombre2);
        double gastosHijo2 = entrada.nextDouble();
        
        System.out.println("Ingrese el nombre del tercer hijo: ");
        entrada.nextLine(); //limpieza de buffer
        nombre3 = entrada.nextLine();
        
        System.out.println("Ingresar los gastos de "+nombre3);
        double gastosHijo3 = entrada.nextDouble();
        
        double gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        
       
        System.out.println("Los gastos de "+nombre1+" "+gastosHijo1);
        System.out.println("Los gastos de "+nombre2+" "+gastosHijo2);
        System.out.println("Los gastos de "+nombre3+" "+gastosHijo3);
        System.out.println("Los gastos totales de los 3 hijos son: "
                +gastosTotales);
    
    
    
    }
    
        
        
       
                      
             
        
        
    }
    
}
