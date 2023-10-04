//1. Cálculo del área de un círculo: Escribir un programa en Java que calcule el área de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se resuelve.

package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej1_AreaCirculo {

    public static void main(String[] args) {
        
        final double PI = 3.14;
        double diametro, radio;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el diámetro del circulo");
        diametro = scanner.nextDouble();

        radio = diametro / 2;
        System.out.println("El área del circulo es de: " + (PI * Math.pow(radio,2)));
        scanner.close();
    }
    
}
