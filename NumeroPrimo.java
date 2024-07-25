import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Dame un numero entero ");
    int numero = scanner.nextInt();
        scanner.close();

    boolean resultado =Primo(numero);
    if (resultado) {
    System.out.println(" numero primo.");
     } 
     else {
    System.out.println(" numero no es primo.");
        }
    }

    public static boolean Primo(int n) {
   if (n <= 1) {
   return false;
        }
    if (n == 2) {
    return true;
        }
    if (n % 2 == 0) {
    return false;
        }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
    if (n % i == 0) {
    return false;
            }
        }
    return true;
    }
}