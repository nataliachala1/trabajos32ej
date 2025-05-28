package exercise24;

import java.util.Scanner;;
public class Serie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int serie;
        System.out.println("Ingresa la serie");
        serie =input.nextInt();

        while (serie < 1000)

        System.out.println(serie);

        serie = (serie * 2 ) + 1;
        input.close();
    }
}
