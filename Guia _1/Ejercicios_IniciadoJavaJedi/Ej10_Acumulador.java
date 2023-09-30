//10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación de quince multiplicaciones entre dos números enteros divididos por el número de la multiplicación. Por ejemplo: Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15 El resultado mostrarlo por pantalla.


public class Ej10_Acumulador {
    public static void main(String[] args) {
        
    int numero1 = 10, numero2 = 2, acumulacion;
    acumulacion = (numero1*numero2) / 1 +
        (numero1*numero2) / 2 +
        (numero1*numero2) / 3 +
        (numero1*numero2) / 4 +
        (numero1*numero2) / 5 +
        (numero1*numero2) / 6 +
        (numero1*numero2) / 7 +
        (numero1*numero2) / 8 +
        (numero1*numero2) / 9 +
        (numero1*numero2) / 10 +
        (numero1*numero2) / 11 +
        (numero1*numero2) / 12 +
        (numero1*numero2) / 13 +
        (numero1*numero2) / 14 +
        (numero1*numero2) / 15;

    System.out.println(acumulacion); 

    }
}
