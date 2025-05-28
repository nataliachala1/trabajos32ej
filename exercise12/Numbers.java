package exercise12;

import java.util.Scanner;;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,numM;
         System.out.println("Ingresa el primer numero");
         num1 =input.nextInt();

         System.out.println("Ingresa el segundo numero");
         num2 =input.nextInt();

         System.out.println("Ingresa el tercer numero:");
         num3 =input.nextInt();

         if ((num1 > num2) && (num1 > num3)){
            numM = num1;
         }
         else if (num1 > num3){
            numM = num2;
         }
         else{
            numM = num3;
         }
         System.out.println("El numero mayor es:" + numM);

         input.close();
    }
    
}
