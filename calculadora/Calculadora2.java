import java.util.Arrays;
import java.util.Scanner;

public class Calculadora2 {
    public static double a, b, res;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] arg) {
        int op = 0;
        int bandera = 1;

        int[] numero = new int[10];

        for(int x = 0; x <= 10; x++){
            System.out.println("Digite el valor " +(x+1));
            numero[x] = teclado.nextInt();
        }

        Arrays.sort(numero);
        for (int x = 0; x < 10; x++) {
            System.out.println(numero[x] + " ");
        }
        while (bandera == 1) {
            System.out.println("Ingrese el valor de a");
            a = teclado.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = teclado.nextDouble();
            System.out.println("Seleccione una opción:");
            System.out.println("1. Suma");
            System.out.println("2. Multiplicacion");
            System.out.println("3. Division");
            System.out.println("4. Resta");
            System.out.println("5. Salir");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    suma(a, b);
                    break;
                case 2:
                    multiplicacion(a, b);
                    break;
                case 3:
                    division(a, b);
                    break;
                case 4:
                    resta(a, b);
                    break;
                case 5:
                    bandera = 0;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public static void suma(double a, double b) {
        res = a + b;
        System.out.println("Resultado: " + res);
    }

    public static void multiplicacion(double a, double b) {
        res = a * b;
        System.out.println("Resultado: " + res);
    }

    public static void division(double a, double b) {
        if (b != 0) {
            res = a / b;
            System.out.println("Resultado: " + res);
        } else {
            System.out.println("Error: División por cero.");
        }
    }

    public static void resta(double a, double b) {
        res = a - b;
        System.out.println("Resultado: " + res);
    }
}