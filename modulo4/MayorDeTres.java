import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de la primera variable: ");
        int var1 = scanner.nextInt();
        
        System.out.print("Ingresa el valor de la segunda variable: ");
        int var2 = scanner.nextInt();
        
        System.out.print("Ingresa el valor de la tercera variable: ");
        int var3 = scanner.nextInt();
        
        if (var1 > var2 && var1 > var3) {
            System.out.println("El mayor valor es: " + var1);
        } else if (var2 > var1 && var2 > var3) {
            System.out.println("El mayor valor es: " + var2);
        } else if (var3 > var1 && var3 > var2) {
            System.out.println("El mayor valor es: " + var3);
        } else {
            System.out.println("Hay múltiples variables con el mismo valor máximo.");
        }
        
        scanner.close();
    }
}