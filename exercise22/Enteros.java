package exercise22;

import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,producto,counter;

        System.out.println("Ingresa el primer numero entero");
        num1 =input.nextInt();

        System.out.println("Ingresa el segundo numero entero");
        num2 =input.nextInt();

        producto = 0;

        for (counter = 1; counter <= num2; counter++){
            producto = producto + num1;
        }
        System.out.println("El producto es:" + producto);

        input.close();
    }
    
}
