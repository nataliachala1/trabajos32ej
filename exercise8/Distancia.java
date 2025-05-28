package exercise8;

import java.util.Scanner;;

public class Distancia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double abcisaA,abcisaB,ordenadaA,ordenadaB,distancia,result;

        System.out.println("Ingrese el punto A");
        abcisaA =input.nextDouble();

        System.out.println("Ingrese abcisa B");
        abcisaB =input.nextDouble();

        System.out.println("Ingrese ordenada A");
        ordenadaA =input.nextDouble();

        System.out.println("Ingrese ordenada B");
        ordenadaB =input.nextDouble();

        distancia = Math.sqrt((abcisaB - abcisaA) *2 + (ordenadaB - ordenadaA) *2);

        result = distancia;

        System.out.println("La distancia es:" + result);

        input.close();
    }
}