import java.util.Scanner;

public class Calculadora{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int seleccion;
    double a,b,result;

    System.out.println("Ingresa un numero para el caso (caso 1 = suma, caso 2 = multiplicación, case 3 = division, case 4 = resta)");
    seleccion =input.nextInt();

    switch (seleccion) {
        case 1:
        System.out.println("Ingresa el primer numero");
        a = input.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = input.nextInt();
        result = a + b;
        System.out.println( + a + " + " + b + " = " + result ); 
            break;
        case 2:
        System.out.println("Ingresa el primer numero");
        a = input.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = input.nextInt();
        result = a * b;
        System.out.println( + a + " * " + b + " = " + result ); 
            break;
        case 3:
        System.out.println("Ingresa el primer numero");
        a = input.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = input.nextInt();
        result = a / b;
        System.out.println( + a + " / " + b + " = " + result ); 
            break;
        case 4:
        System.out.println("Ingresa el primer numero");
        a = input.nextInt();
        System.out.println("Ingresa el segundo numero");
        b = input.nextInt();
        result = a - b;
        System.out.println( + a + " - " + b + " = 1" + result ); 
            break;
        default:
            break;
    }
    input.close();
}
}