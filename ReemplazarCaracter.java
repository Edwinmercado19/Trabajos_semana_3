import java.util.Scanner;

public class ReemplazarCaracter {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String texto = a.nextLine();
        
        System.out.print("Ingrese el carácter que desea reemplazar: ");
        char caracterAReemplazar = a.nextLine().charAt(0);
        
        System.out.print("Ingrese el nuevo carácter: ");
        char nuevoCaracter = a.nextLine().charAt(0);
        
        String modificado = texto.replace(caracterAReemplazar, nuevoCaracter);
        
        System.out.println("Texto modificado: " + modificado);
        
        a.close();
    }
}