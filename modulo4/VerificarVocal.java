import java.util.Scanner;

public class VerificarVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un carácter: ");
        char caracter = scanner.nextLine().charAt(0);
        
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado NO es una vocal.");
        }
        
        scanner.close();
    }
}
