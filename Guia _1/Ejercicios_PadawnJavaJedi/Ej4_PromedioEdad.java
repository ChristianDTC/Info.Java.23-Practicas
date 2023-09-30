//4. Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de edad y los nombres de esas personas, luego saque su promedio e imprima por pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus edades.

package Ejercicios_PadawnJavaJedi;

public class Ej4_PromedioEdad {
    public static void main(String[] args) {

        String nombre1 = "Christian", nombre2 = "Belen", nombre3 = "Candy";
        int edad1 = 37, edad2 = 33, edad3 = 3;
        float edadPromedio;    
        
        edadPromedio = (edad1 + edad2 + edad3) / 3;
        System.out.println("Nombre: " + nombre1 + " - Edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + " - Edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + " - Edad: " + edad3);
        System.out.println("Promedio edades: " + edadPromedio);
    }
}
