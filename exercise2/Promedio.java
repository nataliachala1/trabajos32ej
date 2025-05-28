import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner(System.in);

    int num1,num2,num3,result;

    System.out.println("Ingrese la primera nota");
    num1 = ingresar.nextInt();

    System.out.println("Ingrese la segunda nota");
    num2 = ingresar.nextInt();

    System.out.println("Ingrese la tercera nota");
    num3 = ingresar.nextInt();

    result = (num1 + num2 + num3) / 3;

    System.out.println("El promedio es:" + result);
        
     ingresar.close();
    }
    
}
