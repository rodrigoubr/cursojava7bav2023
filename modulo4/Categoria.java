import java.util.Scanner;

public class Categoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = scanner.nextLine();
        
        if (categoria.equals("a")) {
            System.out.println("La categoría ingresada corresponde a: hijo");
        } else if (categoria.equals("b")) {
            System.out.println("La categoría ingresada corresponde a: padres");
        } else if (categoria.equals("c")) {
            System.out.println("La categoría ingresada corresponde a: abuelos");
        } else {
            System.out.println("Categoría no válida");
        }
    }
}
