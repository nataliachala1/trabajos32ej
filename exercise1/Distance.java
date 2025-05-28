
import java.util.Scanner;;

public class Distance {
public  static void main (String [] args){
    Scanner ingresar = new Scanner(System.in);

    int velocidad,tiempo,distance;

    System.out.println("Ingrese la velocidad");
     velocidad = ingresar.nextInt();

    System.out.println("Ingrese el tiempo");
     tiempo = ingresar.nextInt();

     distance = velocidad * tiempo;
 
    System.out.println("Result is:" + distance);

    ingresar.close();
        

}
}