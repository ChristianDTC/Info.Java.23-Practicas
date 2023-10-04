//5. Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario ingresa 5000 pesos, el programa deberá mostrar 250 euros.

package Ejercicios_CaballeroJavaJedi;

import java.util.Scanner;

public class Ej5_ConversionPesosEuros {
    public static void main(String[] args) {
        
        final double TASACAMBIO = 0.0027;
        double cantidadPesos, euros;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Pesos a cambiar:");
        cantidadPesos = scanner.nextDouble();

        euros = cantidadPesos * TASACAMBIO;
        System.out.println("$" + cantidadPesos + " = Euros$" + euros);
        scanner.close();
    }
}
