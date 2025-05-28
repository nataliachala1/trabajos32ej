package exercise15;

import java.util.Scanner;
public class Venta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalB;
        int mVenta;

        System.out.println("Ingrese el monto de venta alcanzado:");
        mVenta =input.nextInt();

        if (mVenta >= 0 && mVenta <= 1000) {
            totalB = (0 * mVenta) / 100;
        }else if (mVenta >= 1000 && mVenta < 5000){
            totalB = (3 * mVenta) / 100;
        }else if (mVenta >= 5000 && mVenta < 20000){
            totalB = (5 * mVenta) / 100;
        }else if (mVenta >= 20000){
            totalB = (8 * mVenta) / 100;
        }else {
            totalB = 0;     }
        System.out.println("El total de bonificación es:" + totalB);
        input.close();

        

    }
    
}
