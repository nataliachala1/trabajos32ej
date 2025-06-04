package exercise20;

import java.util.Scanner;;
public class Sueldo {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        int numE,counter;
        double SE,SS,SP;
        System.out.println("Ingresa el numero de empleados");
        numE =input.nextInt();

        SS = 0;

        for (counter = 1; counter <= numE; counter++){
            System.out.println("Ingrese sueldo");
            SE =input.nextDouble();

            SS = SS + SE;
        }
        SP = SS / numE;
        System.out.println("El sueldo promedio es:" + SP);
        
    }
    
    
}
