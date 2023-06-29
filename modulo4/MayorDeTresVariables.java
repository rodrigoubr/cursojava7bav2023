7_
public class MayorDeTresVariables {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 25;
        int variable3 = 15;

        if (variable1 > variable2 && variable1 > variable3) {
            System.out.println("La variable1 es la mayor: " + variable1);
        } else if (variable2 > variable1 && variable2 > variable3) {
            System.out.println("La variable2 es la mayor: " + variable2);
        } else if (variable3 > variable1 && variable3 > variable2) {
            System.out.println("La variable3 es la mayor: " + variable3);
        } else {
            System.out.println("Las variables son iguales");
        }
    }
}
