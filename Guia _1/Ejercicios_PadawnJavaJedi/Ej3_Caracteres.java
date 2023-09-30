//3. Caracteres : Guarde en distintos espacios de memoria los caracteres de  su nombre en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char? ¿Qué es unicode?
//RESPUESTA: no se puede usar "" porque identifican a los String.
// Unicode es una codificación de caracteres de 16 bits que soporta la mayoría de los idiomas del mundo.

package Ejercicios_PadawnJavaJedi;

public class Ej3_Caracteres {
    public static void main(String[] args) {
        
        char c = '\u0043', h = '\u0068',r = '\u0072',i = '\u0069',s = '\u0073',t = '\u0074',a = '\u0061',n = '\u006E';
        System.out.println("Mi nombre es " +c+h+r+i+s+t+i+a+n);
    }
}
