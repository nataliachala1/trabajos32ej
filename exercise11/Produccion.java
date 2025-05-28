package exercise11;

import java.util.Scanner;;
public class Produccion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pLunes,pMartes,pMiercoles,pJueves,pViernes,pSabado,pTotal,pPromedia;

        System.out.println("Ingrese la producción del dia lunes");
        pLunes =input.nextInt();

        System.out.println("Ingrese la producción del dia Martes");
        pMartes =input.nextInt();

        System.out.println("Ingrese la producción del dia Miercoles");
        pMiercoles =input.nextInt();

        System.out.println("Ingrese la producción del dia Jueves");
        pJueves =input.nextInt();

        System.out.println("Ingrese la producción del dia Viernes");
        pViernes =input.nextInt();

        System.out.println("Ingrese la producción del dia Sabado");
        pSabado =input.nextInt();

        pTotal = (pLunes + pMartes + pMiercoles + pJueves + pViernes + pSabado);
        pPromedia = pTotal / 6;

        if (pPromedia >= 100){
            System.out.println("Recibira Incentivos");
        }
        else {
            System.out.println("No recibira Incentivos");
        }

        input.close();
    }
    
}
