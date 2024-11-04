/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos del usuario
        System.out.println("Ingrese el nombre completo del dueño de la línea telefónica: ");
        String nombreCompleto = entrada.nextLine();

        System.out.println("Ingrese la dirección del domicilio: ");
        String direccion = entrada.nextLine();

        System.out.println("Ingrese el costo por minuto: ");
        double costoPorMinuto = entrada.nextDouble();

        System.out.println("Ingrese el número de minutos consumidos en el mes: ");
        int minutosConsumidos = entrada.nextInt();

        // Calcular el valor a cancelar
        double valorACancelar = costoPorMinuto * minutosConsumidos;

        // Presentar
        System.out.println("\nReporte:");
        System.out.printf("Nombres completos: %s\n", nombreCompleto);
        System.out.printf("  Dirección: %s\n", direccion);
        System.out.printf("Costo por minuto: $%.2f\n", costoPorMinuto);
        System.out.printf("  Número de minutos consumidos: %d\n", minutosConsumidos);
        System.out.printf("    Valor a cancelar: $%.2f\n", valorACancelar);
    }
}

