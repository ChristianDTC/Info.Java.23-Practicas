//2. Suma de dos números bis: Se les solicita que guarden dos números enteros y los sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número par o impar. El mensaje debe tener el siguiente formato: “El resultado es “ {Resultado} “y es” {paridad} 

public class Ej2_SumaDosNumerosBis {
    public static void main(String[] args) {
        
        int numero1 = 10, numero2 = 20, suma;
        String resultado;

        suma = numero1 + numero2;
        resultado = (suma % 2 == 0? " y es PAR" : " y es IMPAR");
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println("El resultado es " + suma + resultado);
    }
}
