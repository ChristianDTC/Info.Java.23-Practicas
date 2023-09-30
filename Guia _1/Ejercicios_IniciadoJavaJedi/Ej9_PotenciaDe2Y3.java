// 9. Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y luego haga la potencia de ese número al cuadrado y al cubo.

public class Ej9_PotenciaDe2Y3 {
    public static void main(String[] args) {
        
        int numero = 100, cuadrado, cubo;

        cuadrado = numero * numero;
        cubo = numero * numero * numero;

        System.out.println("Número " + numero);
        System.out.println("Al cuadrado = " + cuadrado);
        System.out.println("Al cubo = " + cubo);

    }
}
