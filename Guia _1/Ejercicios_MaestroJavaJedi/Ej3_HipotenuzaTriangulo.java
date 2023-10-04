package Ejercicios_MaestroJavaJedi;

import java.util.Scanner;

public class Ej3_HipotenuzaTriangulo {
    public static void main(String[] args) {
        
        double cateto1, cateto2, hipotenuza;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el 1° cateto");
        cateto1 = scanner.nextDouble();
        System.out.println("Ingrese el 2° cateto");
        cateto2 = scanner.nextDouble();

        hipotenuza = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) ;
        
        System.out.println("La hipotenuza del triángulo es de " + hipotenuza);
        scanner.close();

    }
}
