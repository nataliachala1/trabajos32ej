import java.util.Scanner;;

public class Cds {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);

        double GB,MG,CD,result;
        System.out.println("Ingrese el numero de GB del disco duro");
        GB =ingresar.nextInt();

        MG = GB * 1.024;
        CD = Math.floor((MG / 700) + 1);
        result = CD;

        System.out.println(result);

        ingresar.close();

    }

}