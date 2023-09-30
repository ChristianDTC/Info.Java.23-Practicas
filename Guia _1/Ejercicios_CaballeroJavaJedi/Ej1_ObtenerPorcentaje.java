//1. Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el porcentaje que indique el segundo número del primer número.


package Ejercicios_CaballeroJavaJedi;

public class Ej1_ObtenerPorcentaje {
    public static void main(String[] args) {
        
        int numero1 = 30;
        double numeroReal = 525.4, porcentaje;

        porcentaje = (numero1 * 100) / numeroReal;
        System.out.println("El número " + numero1 + " representa el " + porcentaje + "% de " + numeroReal); 
    }
}
