package exercise28;

import java.util.Scanner;;
public class Letras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter;
        char letra;
        System.out.println("Ingrese 10 letras");
        letra =input.next().charAt(0);
        int NV,NC;

        NV = 0;
        NC = 0;

        for (counter = 1; counter <= 10; counter++){
            System.out.println(letra);

            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                NV = NV + 1;    
                break;
            
                default:
                NC = NC + 1;
                    break;
            }
         }System.out.println("Numero de vocales" +NV);
         System.out.println("Numero de consonates" +NC);

         input.close();
    }
    
}
