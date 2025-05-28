package exercise26;

public class Fibonacci {
    public static void main(String[] args) {
        
        int num1,num2,num3;

        num1 = 0;
        num2 = 1;
        num3 = num1 + num2;

        System.out.println(num1);
        System.out.println(num2);

        while (num3 < 100000){
            System.out.println(num3);

            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }
}
