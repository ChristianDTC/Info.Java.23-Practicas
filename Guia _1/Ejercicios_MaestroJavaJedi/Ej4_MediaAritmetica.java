//4. Cálculo de la media aritmética: Escribir un programa en Java que calcule la media aritmética de un conjunto de números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) /k, donde n1, n2, ..., nk son los números y k es el número total de elementos. Utilicen variables y constantes según corresponda.

package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej4_MediaAritmetica {
    public static void main(String[] args) {

        double numero1, numero2, numero3, promedio;
        final double CANTIDADNUMERO = 3;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el 1° número");
        numero1 = scanner.nextDouble();
        System.out.println("Ingrese el 2° número");
        numero2 = scanner.nextDouble();
        System.out.println("Ingrese el 3° número");
        numero3 = scanner.nextDouble();

        promedio = (numero1 + numero2 + numero3) / CANTIDADNUMERO;

        System.out.println("La media aritmética es de " + promedio);
        scanner.close();

    }
}
