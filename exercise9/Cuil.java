package exercise9;
import java.util.Scanner;;

public class Cuil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int añoN,añoA,age;

        System.out.println("Ingrese su año de nacimiento");
        añoN =input.nextInt();

        System.out.println("Ingrese el año actual");
        añoA =input.nextInt();

        age = añoA - añoN;

        if ( age > 17){
           System.out.println("Debe solicitar su CUIL");
        }
        else {
            System.out.println( "No debe solicitar su CUIL aun");

        }
        input.close();
        
    }
}