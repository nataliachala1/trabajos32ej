package exercise25;

import java.util.Scanner;;
public class Letras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letras;
        String SEMAF;

        System.out.println("Ingresa letras");
        letras =input.next().charAt(0);

        SEMAF = "V";

        while (SEMAF.equals("V")){
            System.out.println(letras);

            switch (letras) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                SEMAF = "R";
                    break;
                default:
                SEMAF = "V";
                    break;
            }
        }
        System.out.println("Fin del programa ingresaste una vocal");
        input.close();
    }
    
}
