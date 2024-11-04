/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedir datos (*IMPORTANTE*: poner los valor decimales con coma no con punto)
        System.out.println("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // proceso
        double area = (base * altura) / 2;

        // salida
        System.out.println("El área del triángulo es: " + area);
    }
}
