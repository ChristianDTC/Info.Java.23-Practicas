//4. Conversión de libras esterlinas a dólares: Escribir un programa en Java que solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa deberá mostrar 70 dólares.


package Ejercicios_CaballeroJavaJedi;

import java.util.Scanner;

public class Ej4_ConversionLibrasEsterlinasDolares {
    public static void main(String[] args) {
        
        final double TASACAMBIO = 1.22;
        double cantidadLibrasEsterlinas, dolares;
        char libra = '\u00A3';
   
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Libras Esterlinas a cambiar:");
        cantidadLibrasEsterlinas = scanner.nextDouble();

        dolares = cantidadLibrasEsterlinas * TASACAMBIO;
        System.out.println(libra + "$" + cantidadLibrasEsterlinas + " = U$S" + dolares);
        scanner.close();
    }
}
