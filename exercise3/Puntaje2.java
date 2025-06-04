import java.util.Scanner;

public class Puntaje2 {
    public static int rC,rI,rB,prC,prI,result;
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 0;
        int bandera = 1;

        while (bandera == 1) {
        
        System.out.println("Ingrese el numero de respuestas correctas");
        rC =input.nextInt();
        System.out.println("Ingrese el numero de respuestas Incorrectas");
        rI =input.nextInt();
        System.out.println("Ingrese el numero de respuestas en blanco");
        rB =input.nextInt();
        System.out.println("Seleccione una opción");
        System.out.println("1.Total de respuestas correctas");
        System.out.println("2.Total de respuestas incorrectas");
        System.out.println("3.Puntaje final");
        System.out.println("4.Respuestas en blanco");
        System.out.println("5.Salir");
        op = input.nextInt();
        switch (op) {
            case 1: {
                pRC(rC, rI, prC, prI);
                break;
            }
            case 2: {
                pRI(rC, rI, prC, prI);
                System.out.println(+ rB);
                break;
            }
            case 3: {
                pF(rC, rI, prC, prI);
            }
            case 4: {
                rB(rB);
                break;
            }
            case 5: {
                bandera = 0;
                System.out.println("Saliendo...");
                break;
            }
            default: {
                System.out.println("Opción no valida");
                break;
            }
        }
    }
}
        public static void pRC(int rC, int rI, int prC, int prI) {
            result = rC * 4;
            System.out.println("El puntaje de respuestas correctas es:" + result);
        }
        public static void pRI(int rC, int rI, int prC, int prI) {
            result = rC * -1;
            System.out.println("El puntaje de respuestas incorrectas :" + result);
        }
        public static void pF(int rC, int rI, int prC, int prI) {
            result =  (rC * 4) * (rC * -1);
            System.out.println("El puntaje final es:" + result);
        }
        public static void rB(int rB) {
            result =  rB;
            System.out.println("Las respuestas en blanco son:" + result);
        }
    }