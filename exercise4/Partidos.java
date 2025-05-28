import java.util.Scanner;

public class Partidos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pG,pE,pP,ppG,ppE,pT,result;

        System.out.println("Ingrese los partidos ganados");
        pG =input.nextInt();

        System.out.println("Ingrese los partidos empatados");
        pE =input.nextInt();

        System.out.println("Ingrese los partidos perdidos");
        pP =input.nextInt();

        ppG = pG * 3;
        ppE = pE * 1;
        pT = ppG + ppE;

        result = pT;

        System.out.println("El total de partidos son:" + result);
        System.out.println("El total de partidos perdidos son:" + pP);

        input.close();



    }
}