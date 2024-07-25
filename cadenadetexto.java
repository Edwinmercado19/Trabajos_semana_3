import java.util.Scanner;

public class cadenadetexto {
    public static void main(String[] args) {
     Scanner a = new Scanner(System.in); 
     System.out.print("Ingrese una cadena de texto: ");
     String cadena = a.nextLine();
     a.close();
         
     boolean Hola = palindroma(cadena);
     if (Hola) {
     System.out.println("si es un palindromo");
        } 
     else {
     System.out.println("No lo es");
        }
    }

    public static boolean palindroma(String texto) {

    String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
    int tex = textoLimpio.length();
    for (int i = 0; i < tex / 2; i++) {
    if (textoLimpio.charAt(i) != textoLimpio.charAt(tex - 1 - i)) {
    return false;
            }
        }
    return true;
    }
}
