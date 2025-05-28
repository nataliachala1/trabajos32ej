package exercise29;

import java.util.Scanner;;
public class Ganador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int C1,C2,C3,C0,counter,VE,G;
        System.out.println("Ingrese el voto");
        VE =input.nextInt();

        C1 = 0;
        C2 = 0;
        C3 = 0;
        C0 = 0;

        for (counter = 1; counter <= 160; counter++){
            System.out.println(VE);

            switch (VE) {
                case 1:
                case 2:
                case 3:
                C1 = C1 + 1;     
                    break;
            
                default:
                C0 = C0 + 1;
                    break;
            }
        }
        if ((C1 > C2) && (C2 > C3) && (C1 > C0)){
            G = C1;

        }else if((C2 > C3) && (C2 > C0)){
            G = C2;

        }else if(C3 > C0){
            G = C3;
        }else{
            G = C0;
        }
        System.out.println("El ganador es:" +G);
        input.close();
    }
    
}
