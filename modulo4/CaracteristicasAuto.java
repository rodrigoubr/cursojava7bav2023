public class CaracteristicasAuto {
    public static void main(String[] args) {
        char tipoAuto = 'b';
        
        switch (tipoAuto) {
            case 'a':
                System.out.println("Clase A: 4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado y aire acondicionado");
                break;
            case 'c':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag");
                break;
            default:
                System.out.println("Tipo de auto inválido");
                break;
        }
    }
}