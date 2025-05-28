package exercise23;

public class NumerosEnteros {
    public static void main(String[] args) {
    
        int num,counter;
        counter = 0;

        for (num = 1; counter < 10; num++){

            if(num % 2 != 0){
                System.out.println(num);
                counter++;
            }

        }
    }
}
