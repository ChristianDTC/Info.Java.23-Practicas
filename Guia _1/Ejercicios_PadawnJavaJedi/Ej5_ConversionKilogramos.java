//5. Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice una constante de los valores que no van a cambiar en esta conversión. Muestre el resultado por pantalla

package Ejercicios_PadawnJavaJedi;

public class Ej5_ConversionKilogramos {
    public static void main(String[] args) {
        
        double libras = 5, kilogramos;
        final double KILOS = 0.453592;
        kilogramos = KILOS * libras;
        System.out.println("Libras: " + libras + " = " + kilogramos + " Kilogramos");
    }
}
