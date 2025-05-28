package exercise30;

import java.util.Scanner;;
public class Promedioo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,result;
        System.out.println("Ingrese el primer numero");
        num1 =input.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 =input.nextInt();

        result = (num1 + num2) / 2;

        System.out.println("El promedio de los numeros es:" + result);

        input.close();

    }
    
}
