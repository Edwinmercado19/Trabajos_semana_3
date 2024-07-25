import java.util.Scanner;

public class CalcularRaizCuadrada {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = a.nextDouble();
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        
        a.close();
    }
}