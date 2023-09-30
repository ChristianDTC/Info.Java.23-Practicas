//3. Conversión de euros a dólares: Escribir un programa en Java que solicite al usuario una cantidad en euros y muestre el equivalente en dólares, tilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.

package Ejercicios_CaballeroJavaJedi;

import java.util.Scanner;

public class Ej3_ConversionEurosDolares {
    public static void main(String[] args) {

        final double TASACAMBIO = 1.06;
        double cantidadEuros, dolares;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a cambiar:");
        cantidadEuros = scanner.nextDouble();

        dolares = cantidadEuros * TASACAMBIO;
        System.out.println("Euro$" + cantidadEuros + " = U$S" + dolares);

    }
}
