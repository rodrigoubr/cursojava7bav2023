import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Competidor 1:");
        System.out.print("Ingresa tu elección (0 para piedra, 1 para papel, 2 para tijera): ");
        int eleccionCompetidor1 = scanner.nextInt();
        
        System.out.println("Competidor 2:");
        System.out.print("Ingresa tu elección (0 para piedra, 1 para papel, 2 para tijera): ");
        int eleccionCompetidor2 = scanner.nextInt();
        
        if ((eleccionCompetidor1 == 0 && eleccionCompetidor2 == 2) &&
            (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 1 es el ganador!");
        } else if ((eleccionCompetidor2 == 0 && eleccionCompetidor1 == 2) &&
                   (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 2 es el ganador!");
        } else if ((eleccionCompetidor1 == 1 && eleccionCompetidor2 == 0) &&
                   (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 1 es el ganador!");
        } else if ((eleccionCompetidor2 == 1 && eleccionCompetidor1 == 0) &&
                   (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 2 es el ganador!");
        } else if ((eleccionCompetidor1 == 2 && eleccionCompetidor2 == 1) &&
                   (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 1 es el ganador!");
        } else if ((eleccionCompetidor2 == 2 && eleccionCompetidor1 == 1) &&
                   (eleccionCompetidor1 != eleccionCompetidor2)) {
            System.out.println("¡Competidor 2 es el ganador!");
        } else {
            System.out.println("¡Es un empate!");
        }
        
        scanner.close();
    }
}
