//4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los sumen, determine si el primer número es divisible por el segundo número y muestre el resultado. 


public class Ej4_CalculoDeDivisivilidad {
    public static void main(String[] args) {
        
        int numero1 = 20, numero2 = 100;
        
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        
        if (numero2 == 0) {
            System.out.println("El divisor no puede ser 0 (Cero)");
        } else if (numero1 % numero2 == 0) {
            System.out.println("División: " + numero1 + " / " + numero2 + " = " + (numero1/numero2));
        } else {
            System.out.println("El número " + numero1 + " NO es divisible por " + numero2);
        }
        
    }
}
