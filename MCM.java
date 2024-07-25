import java.util.Scanner;

public class MCM {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Ingrese un numero ");
        int numerouno = a.nextInt();
        
        System.out.print("Ingrese un numero ");
        int numerodos = a.nextInt();
        a.close();
        
        int Maximo = Maximo(numerouno, numerodos);
        System.out.println("El MCD es: " + Maximo);
    }

    public static int Maximo(int uno, int dos) {
        while (dos!= 0) {
            int Hola = dos;
            dos = uno % dos;
            uno = Hola;
        }
        return uno;
    }
}
