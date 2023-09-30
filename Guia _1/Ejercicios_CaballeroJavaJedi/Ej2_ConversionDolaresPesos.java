//2. Conversión de dólares a pesos: Escribir un programa en Java que solicite al usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.


package Ejercicios_CaballeroJavaJedi;

import java.util.Scanner;

public class Ej2_ConversionDolaresPesos {
    public static void main(String[] args) {
        
        final double TASACAMBIO = 800;
        double cantidadDolares, pesos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Dolares a cambiar:");
       cantidadDolares = scanner.nextDouble();

        pesos = cantidadDolares * TASACAMBIO;
        System.out.println("U$S" + cantidadDolares + " = $" + pesos);

    }
}
