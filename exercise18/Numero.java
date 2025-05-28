package exercise18;

import java.util.Scanner;;
public class Numero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,Q,R;

        System.out.println("Ingresa un numero entero diferente a cero");
        num =input.nextInt();
        Q = num / 2;
        R = num - (Q * 2);

        if (R == 0){
            System.out.println("Is pair");
        }else{
            System.out.println("Is odd");
        }
        input.close();
    }
}
