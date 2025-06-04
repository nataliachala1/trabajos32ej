import java.util.Scanner;

public class Promedio2 {
    public static int a,b,c;
    public static double result;
    public static Scanner ingresar = new Scanner(System.in);
    
    public static void main(String[] args) {
        int bandera = 1;
        int op = 0;

    while (bandera == 1) {
    System.out.println("Ingrese la primera nota");
    a = ingresar.nextInt();
    System.out.println("Ingrese la segunda nota");
    b = ingresar.nextInt();
    System.out.println("Ingrese la tercera nota");
    c = ingresar.nextInt();
    System.out.println("Seleccione una opción");
    System.out.println("1. Calcular el promedio");
    System.out.println("2.Salir");
    op =ingresar.nextInt();

    switch (op) {
        case 1:{
            promedio(a,b,c);
            break;
        }
        case 2:{
            bandera = 0;
            System.out.println("Saliendo...");
            break;
        }
        default:{
        System.out.println("Opción no valida");
            break;
        }
    }
  }
}
    public static void promedio ( int a, int b, int c){
        result = (a + b + c) / 3;
        System.out.println("El promedio es " + result);
}

    }