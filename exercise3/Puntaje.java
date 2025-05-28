import java.util.Scanner;

public class Puntaje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rC,rI,rB,prC,prI,pF,result;

        System.out.println("Ingrese las respuestas correctas");
        rC =input.nextInt();

        System.out.println("Ingrese las respuestas Incorrectas");
        rI =input.nextInt();

        System.out.println("Ingrese las respuestas en blanco");
        rB =input.nextInt();

        prC = rC * 4;
        prI = rI * -1;
        pF = prC + prI;

        result = pF;


        System.out.println("Las respuestas en blanco son:" + rB);
        System.out.println("El puntaje final es:" + result);

        input.close();



    }
}