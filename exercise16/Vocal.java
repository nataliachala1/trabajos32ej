package exercise16;

import java.util.Scanner;;
public class Vocal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int num;
        String vocal = "";
        System.out.println("Ingrese un numero entero del 1 al 5:");
        num =input.nextInt();

        switch (num) {
            case 1:
                  vocal = "A";
            break;

            case 2:
                  vocal = "E";
            break;

            case 3:
                  vocal = "I";
            break;

            case 4:
                  vocal = "O";
            break;

            case 5:
                  vocal = "U";
            break;

            default:
                  vocal = "Valor incorrecto";
            break;
        }
        System.out.println("El resultado es:" + vocal);
        input.close();
    
    }
    
}
