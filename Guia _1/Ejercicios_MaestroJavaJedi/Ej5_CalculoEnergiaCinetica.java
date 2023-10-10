//5. Cálculo de la energía cinética: Escribir un programa en Java que calcule la energía cinética de un objeto en movimiento, dados su masa y su velocidad. Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa del objeto y v es la velocidad. Muestre el resultado por pantalla.

package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej5_CalculoEnergiaCinetica {
    public static void main(String[] args) {
        double masa, velocidad, energiaCinetica;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la masa");
        masa = scanner.nextDouble();
        System.out.println("Ingrese la velocidad");
        velocidad = scanner.nextDouble();
        
        energiaCinetica = 0.5 * masa * Math.pow(velocidad,2);
        System.out.println("E = (1/2) * m * v^2");
        System.out.printf("E = (1/2) * %s * %s^2" , masa, velocidad);
        System.out.println("");
        System.out.println("E = " + energiaCinetica);
        scanner.close();
    }
}
