package exercise13;

import java.util.Scanner;;
public class Triangulo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int lado1,lado2,lado3;
        String TT;

    System.out.println("Ingrese el primer lado");
    lado1 =input.nextInt();

    System.out.println("Ingrese el segundo lado");
    lado2 =input.nextInt();

    System.out.println("Ingrese el tercer lado");
    lado3 =input.nextInt();

    if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)){
        TT = "Escaleno";
    }
    else if ((lado1 == lado2) && (lado2 == lado3)){
        TT = "Equilatero";
    }
    else{
        TT = "Isósceles";
    }
    System.out.println("El tipo de triangulo es:" + TT);

    input.close();

    }
    
}
