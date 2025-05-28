package exercise21;

import java.util.Scanner;;
public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menores,mayores,counter,EP;

        menores = 0;
        mayores = 0;

        for (counter = 1; counter <= 200; counter++){
            System.out.println("Ingresa la edad");
            EP =input.nextInt();

            if (EP < 18 ){
                menores = menores + 1;
            }else{
                mayores = mayores + 1;
            }
        }
        System.out.println("La cantidad de mayores es:" + mayores);
        System.out.println("La cantidad de menores es:" + menores);

         input.close();
    }
}
