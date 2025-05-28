package exercise14;

import java.util.Scanner;;
public class Number {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int num;
        String ER = "";
        System.out.println("Ingrese un numero entero entre 1 y 10:");
        num =input.nextInt();

        switch (num) {
            case 1:
                  ER = "I";
            break;

            case 3:
                  ER = "II";
            break;

            case 4:
                  ER = "IIi";
            break;

            case 5:
                  ER = "IV";
            break;

            case 6:
                  ER = "VI";
            break;

            case 7:
                  ER = "VII";
            break;

            case 8:
                  ER = "VIII";
            break;

            case 9:
                  ER = "IX";
            break;

            case 10:
                  ER = "X";
            break;
        }
        System.out.println("El numero en romano es:" + ER);
        input.close();
    
    }
    
}
