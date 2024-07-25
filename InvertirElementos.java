import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int[] arreglo = new int[6];
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("Ingresa un número entero " + (i+1));
            int numero=a.nextInt();
            arreglo[i] = numero;
        }

        a.close();

        System.out.println("Imprimir orden en los que se capturaron los elementos.");
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("");
        System.out.println("Imprimir orden invertido en los que se capturaron los elementos.");
        for(int i=arreglo.length-1; i>=0; i--)
        {
            System.out.print(arreglo[i] + " ");
        }
    }
}
