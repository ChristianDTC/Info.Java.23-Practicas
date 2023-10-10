//7. Cálculo de la fuerza centrípeta: Escribir un programa en Java que calcule la fuerza centrípeta necesaria para mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria. Muestre el resultado por pantalla.

package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej7_CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        

        double radioTrayectoria, furezaCentripeta, masa, velocidadAngular;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la masa del objeto");
        masa = scanner.nextDouble();
        System.out.println("Ingrese la velocidad angular");
        velocidadAngular = scanner.nextDouble();
        System.out.println("Ingrese el radio de la trayectoria");
        radioTrayectoria = scanner.nextDouble();
        
        furezaCentripeta = masa * Math.pow(velocidadAngular,2 ) /radioTrayectoria;
        System.out.println("F_c = m * v^2 / r");
        System.out.printf("F_c = %s * %s^2 / %s" ,masa,velocidadAngular,radioTrayectoria);
        System.out.println("");
        System.out.println("F_c = " + furezaCentripeta);
        scanner.close();

    }
}
