/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Ingrese el nombre del cliente: ");
        String nombreCliente = entrada.nextLine();

     
        System.out.println("Ingrese el costo del CPU: ");
        double costoCPU = entrada.nextDouble();

        System.out.println("Ingrese el costo del teclado: ");
        double costoTeclado = entrada.nextDouble();

        System.out.println("Ingrese el costo del ratón: ");
        double costoRaton = entrada.nextDouble();

        System.out.println("Ingrese el costo de la pantalla: ");
        double costoPantalla = entrada.nextDouble();

        // Calcular el valor total a cancelar
        double valorTotal = costoCPU + costoTeclado + costoRaton + costoPantalla;

        // salida
        System.out.println("\nReporte:");
        System.out.printf("Nombres de cliente: %s\n", nombreCliente);
        System.out.println("Valores iniciales:");
        System.out.printf("CPU:      $ %.2f\n", costoCPU);
        System.out.printf("Teclado:  $ %.2f\n", costoTeclado);
        System.out.printf("Ratón:    $ %.2f\n", costoRaton);
        System.out.printf("Pantalla: $ %.2f\n", costoPantalla);
        System.out.printf("\nValor a cancelar: $%.2f\n", valorTotal);
    }
}
