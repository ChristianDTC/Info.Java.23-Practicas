//3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre y luego imprimirlos por pantalla. 
//¿Por qué no puede usar "" en el char?
//RESPUESTA: Recordar que las comillas dobles (“) encierran un literal String. Un String no puede ser asignado a una variable de tipo char.


public class Ej3_Caracteres {
    public static void main(String[] args) {
        
        char c = 'C',h = 'h',r = 'r',i = 'i',s = 's',t = 't',a = 'a',n = 'n';
        System.out.println("Mi nombre es " +c+h+r+i+s+t+i+a+n);
    }
}
