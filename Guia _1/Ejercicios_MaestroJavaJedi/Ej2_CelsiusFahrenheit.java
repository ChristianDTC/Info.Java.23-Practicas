//2. Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar la fórmula con la que se resuelve.

package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej2_CelsiusFahrenheit {
    
    public static void main(String[] args) {
        
        double celsius, fahrenheit;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8 ) + 32;
        
        System.out.println( celsius + "° Celsius = " + fahrenheit + "° Fahrenheit");
        scanner.close();
    }

}
