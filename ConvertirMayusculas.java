import java.util.Scanner;

public class ConvertirMayusculas {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese una palabra o cadena de texto (deje en blanco para terminar): ");
            String texto = a.nextLine();
            
            if (texto.isEmpty()) {
                System.out.println("Presiono espacio el programa finaliza.");
                break;
            }
            
            String mayusculas = texto.toUpperCase();
            System.out.println("Texto en mayúsculas: " + mayusculas);
        }
        
        a.close();
    }
}