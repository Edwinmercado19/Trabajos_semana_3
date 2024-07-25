import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int[] arreglo = new int[8];
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("Ingresa un número entero " + (i+1));
            int numero=a.nextInt();
            arreglo[i] = numero;
        }

        a.close();
        
        int mayor = arreglo[0];
        int menor = arreglo[0];

        for(int i=0; i<arreglo.length; i++)
        {
            if (arreglo[i] > mayor)
            {
                mayor = arreglo[i];
            }

            if (arreglo[i] < menor)
            {
                menor = arreglo[i];
            }
        }

        System.out.println("El número mayor fue:" + mayor);
        System.out.println("El número menor fue:" + menor);
    }
}
