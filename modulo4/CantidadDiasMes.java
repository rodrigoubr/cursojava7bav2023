import java.util.Scanner;

public class CantidadDiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del mes: ");
        String mes = scanner.nextLine().toLowerCase();
        
        int cantidadDias = 0;
        
        if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || mes.equals("julio") ||
            mes.equals("agosto") || mes.equals("octubre") || mes.equals("diciembre")) {
            cantidadDias = 31;
        } else if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            cantidadDias = 30;
        } else if (mes.equals("febrero")) {
            cantidadDias = 28;
        } else {
            System.out.println("Mes no válido");
            System.exit(0);
        }
        
        System.out.println("El mes de " + mes + " tiene " + cantidadDias + " días.");
    }
}
