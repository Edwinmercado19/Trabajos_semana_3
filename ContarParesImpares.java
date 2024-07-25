import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) throws Exception {
        Scanner a=new Scanner(System.in);
        int[] arreglo = new int[10];
        for(int i=0; i<arreglo.length; i++)
        {
            System.out.println("Ingresa un número entero.");
            int numero=a.nextInt();
            arreglo[i] = numero;
        }

        a.close();

        int par = 0;
        int impar = 0;

        for(int i=0; i<arreglo.length; i++)
        {
          
            if (arreglo[i]%2 == 0)
            {
                par = par + 1;
            }
            else
            {
                impar = impar +1;
            }
        }

        System.out.println("Números pares encontrados:" + par);
        System.out.println("Números impares encontrados:" + impar);

    }
}
