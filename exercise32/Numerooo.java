package exercise32;

import java.util.Scanner;;
public class Numerooo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,counter;
        System.out.println("ingrese un numero");
        num = input.nextInt();

        if(num == 0){
            System.out.println("El numero ingresado no puede ser cero");
        }

        for (counter = 1; counter <= num; counter++){
            if (num %  counter == 0){
                System.out.println(counter);
            }
        }input.close();
    }
}
