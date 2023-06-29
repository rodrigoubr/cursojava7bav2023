import java.util.Scanner;

public class TablaMultiplicarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar de los valores pares hasta " + numero + ":");
        
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) { 
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
