//6. Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000 dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.

package Ejercicios_CaballeroJavaJedi;

import java.util.Scanner;

public class Ej6_ConversionBitconiDolar {
    public static void main(String[] args) {
     
        final double TASACAMBIO = 26970.6;
        double cantidadBitcoin, dolares;
           
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Bitcoin a cambiar:");
        cantidadBitcoin = scanner.nextDouble();

        dolares = cantidadBitcoin * TASACAMBIO;
        System.out.println( "$" + cantidadBitcoin + " = U$S" + dolares);
        scanner.close();
    }
}
