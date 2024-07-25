import java.util.Scanner;

public class SumarNumerosEnteros {
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int[] arreglo = new int[5];
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("Ingresa un número entero " + (i+1));
            int numero=a.nextInt();
            arreglo[i] = numero;
        }

        a.close();
        
        int suma = 0;

        for(int i=0; i<arreglo.length; i++)
        {

            suma = suma + arreglo[i];
        }

        System.out.println("La suma de los números esteros es:" + suma);
    }
}
