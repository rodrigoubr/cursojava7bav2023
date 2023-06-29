import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1, elige: ");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int competidor1 = scanner.nextInt();

        System.out.println("Jugador 2, elige: ");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int competidor2 = scanner.nextInt();

        if (competidor1 == competidor2) {
            System.out.println("Es un empate");
        } else if ((competidor1 == 0 && competidor2 == 2) ||
                   (competidor1 == 1 && competidor2 == 0) ||
                   (competidor1 == 2 && competidor2 == 1)) {
            System.out.println("¡Jugador 1 gana!");
        } else {
            System.out.println("¡Jugador 2 gana!");
        }
    }
}
