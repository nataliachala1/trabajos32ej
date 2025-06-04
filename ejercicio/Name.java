import java.util.*;


public class Name {
    public static String nombre;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] usuario = new String [10][6];
        int i = 0;
        int bandera = 1 ;

        while(bandera == 1 && i < 10){
            System.out.println("Usuario numero" + (i + 1));
        System.out.println("Ingrese nombre");
        usuario[i][0] = sc.nextLine();
        System.out.println("Ingrese su apellido");
        usuario[i][1] = sc.nextLine();
        System.out.println("Ingrese su dirección");
        usuario[i][2] = sc.nextLine();
        System.out.println("Ingrese su ocupación");
        usuario[i][3] = sc.nextLine();
        System.out.println("Ingrese su correo");
        usuario[i][4] = sc.nextLine();
        System.out.println("Ingrese su rh");
        usuario[i][5] = sc.nextLine();
        i++;
        }
        for(int x = 0; x < i; x++){
            System.out.println(x+1);
            System.out.println(usuario[i][0]);
            System.out.println(usuario[i][1]);
            System.out.println(usuario[i][2]);
            System.out.println(usuario[i][3]);
            System.out.println(usuario[i][4]);
            System.out.println(usuario[i][5]);
        }
    }
}