import java.util.Scanner;

public class PuestoTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();
        
        if (puesto == 1) {
            System.out.println("El primero obtiene la medalla de oro.");
        }
        if (puesto == 2) {
            System.out.println("El segundo obtiene la medalla de plata.");
        }
        if (puesto == 3) {
            System.out.println("El tercero obtiene la medalla de bronce.");
        }
        if (puesto > 3) {
            System.out.println("Siga participando.");
        }
    }
}
