package exercise17;

import java.util.Scanner;;
public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cocienteEn,residuo,decenas,unidades;
        int num;
        System.out.println("Ingresa un numero entero de dos digitos");
        num =input.nextInt();

        cocienteEn = Math.sqrt(num / 10);
        residuo = num - (cocienteEn * 10);
        decenas = cocienteEn;
        unidades = residuo;

        System.out.println("Decenas:" + decenas);
        System.out.println("Unidades:" + unidades);

        input.close();        
    }
}
