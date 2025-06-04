import java.util.Scanner;

public class Distance2 {
    public static int v,t,distance,result;
    public static Scanner teclado = new Scanner(System.in);
    public  static void main (String [] args){
        int bandera = 1;
        int op = 0;

    while(bandera == 1){
    System.out.println("Ingrese la velocidad");
    v = teclado.nextInt();
    System.out.println("Ingrese el tiempo");
    t = teclado.nextInt();

    System.out.println("Seleccione una opción");
    System.out.println("1. Calcular la distancia");
    System.out.println("2. Salir");
    op =teclado.nextInt();

    switch (op) {
        case 1:
            distance(v, t);
            break;
        case 2:
            bandera = 0;
            System.out.println("Saliendo...");
            break;
        default:
            System.out.println("Opcion no valida");
            break;
    }
  }
}
   public static void distance(int a,int b){
    result = a * b;
    System.out.println("La distancia es: " + result);
   }
}
