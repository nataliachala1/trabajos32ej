import java.util.Scanner;;

public class Planilla {
    public static void main(String[] args) {
    Scanner ingresar = new Scanner (System.in);

    int horasL,tarifasH,planilla,result;

    System.out.println("Ingrese las horas laboradas");
    horasL =ingresar.nextInt();

    System.out.println("Ingrese la tarifa por hora");
    tarifasH =ingresar.nextInt();

    planilla = horasL * tarifasH;
    result = planilla;

    System.out.println("Planilla: " + result);

    ingresar.close();

}
}