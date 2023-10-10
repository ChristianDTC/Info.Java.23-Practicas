////6. Cálculo de la velocidad final: Escribir un programa en Java que calcule la velocidad final de un objeto en caída libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido. Muestre el resultado por pantalla.


package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej6_VelocidadFinal {
    public static void main(String[] args) {
        
        double tiempo, velocidadFinal, velocidadInicial, aceleracion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad inicial");
        velocidadInicial = scanner.nextDouble();
        System.out.println("Ingrese la aceleracion");
        aceleracion = scanner.nextDouble();
        System.out.println("Ingrese el tiempo");
        tiempo = scanner.nextDouble();
        
        velocidadFinal = velocidadInicial + aceleracion * tiempo;
        System.out.println("v_f = v_i + g * t");
        System.out.printf("v_f = %s + %s * %s" , velocidadInicial, aceleracion, tiempo);
        System.out.println("");
        System.out.println("v_f = " + velocidadFinal);
    }
}
