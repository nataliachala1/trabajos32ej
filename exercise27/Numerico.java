package exercise27;

import java.util.Scanner;;
public class Numerico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,result;
        String op;

        System.out.println("Ingresa el primer numero");
        num1 =input.nextInt();

        System.out.println("Ingresa el primer numero");
        num2 =input.nextInt();

        System.out.println("Ingresa un operador aritmetico");
        op =input.nextLine();

        switch (op) {
            case "+" :
            result = num1 + num2;
            System.out.println(result);
                break;
            
            case "-" :
            result = num1 - num2;
            System.out.println(result);
                break;

            case "*" :
            result = num1 * num2;
            System.out.println(result);
                break;

            case "" :
            result = num1 * num2;
            System.out.println(result);
                break;
        
            default:
            result = 0;
                break;
        }
        input.close();
    }
}
