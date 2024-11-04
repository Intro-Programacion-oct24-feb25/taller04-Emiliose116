/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

public class Problema05 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor a pagar por Netflix:");
        double netflix = entrada.nextDouble();
        
        System.out.println("Ingrese el valor a pagar por YouTube Premium:");
        double youtube = entrada.nextDouble();
        
        System.out.println("Ingrese el valor a pagar por Dropbox:");
        double dropbox = entrada.nextDouble();
        
        System.out.println("Ingrese el valor a pagar por Spotify:");
        double spotify = entrada.nextDouble();
        //proceso
        
        double totalAPagar = (netflix * 0.77) + (youtube * 0.77) + (dropbox * 0.55) + spotify ;
    
        System.out.println("El total a pagar de los servicios es: "+totalAPagar);
    } 
}

