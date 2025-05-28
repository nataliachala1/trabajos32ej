
import java.util.Scanner;;

public class Area {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        double ladoA,ladoB,ladoC,sP,area;

    System.out.println("Ingrese el lado A del traingulo");
    ladoA =ingresar.nextInt();

    System.out.println("Ingrese el lado B del traingulo");
    ladoB =ingresar.nextInt();

    System.out.println("Ingrese el lado C del traingulo");
    ladoC =ingresar.nextInt();

    sP = (ladoA + ladoB + ladoC) / 2;
    area = Math.sqrt( sP * (sP - ladoA) * (sP - ladoB) * (sP - ladoC));

    System.out.println("El area del triangulo es: " + area);
    
    ingresar.close();
    }
}