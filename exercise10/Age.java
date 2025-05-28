package exercise10;

import java.util.Scanner;;
public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1,age2,diferenciaE;

        System.out.println("Ingrese la edad del primer hermano");
        age1 =input.nextInt();

        System.out.println("Ingrese la edad del segundo hermano");
        age2 =input.nextInt();

        if (age1 > age2){
            System.out.println("El primer hermano es el mayor, por");
            diferenciaE = age1 - age2;
        }
        else {
            System.out.println("El segundo hermano es el mayor por");
            diferenciaE = age2 - age1;
        }
        System.out.println("La diferencia de edades es:" + diferenciaE);
         input.close();

    } 
}
