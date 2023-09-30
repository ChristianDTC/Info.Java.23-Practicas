//7. Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o real? ¿Por qué? 
//RESPUESTA: Real, porque los números enteros no pueden contener números reales pero si al reves.

public class Ej7_Multiplicación {
    public static void main(String[] args) {
        
        double numeroReal1 = 3.5, numeroReal2 = 8.9, multiplicacionReal, suma;
        int numero1 = 10, numero2 = 2, multiplicacion;

        multiplicacionReal = numeroReal1 * numeroReal2;
        multiplicacion = numero1 * numero2;
        suma = multiplicacion + multiplicacionReal;

        System.out.println(multiplicacionReal + " + " + multiplicacion + " = " + suma);
    }
}
