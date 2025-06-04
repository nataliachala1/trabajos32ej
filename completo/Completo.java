package completo;

import java.util.Scanner;

public class Completo {
    public static double a,b,c,d,e,f,g,res;
    public static int num,i,q,r,s,t,VE,G;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 0;
        int bandera = 1;

        while (bandera == 1) { 
        System.out.println("En los siguientes ejercicios podras calcular, elige una opción");
        System.out.println("1. Calcula la distancia");
        System.out.println("2. Calcula el promedio");
        System.out.println("3. Calcula el puntaje final");
        System.out.println("4. Calcula el puntaje total de partidos");
        System.out.println("5. Planilla de un empleado");
        System.out.println("6. Calcular area de un triángulo");
        System.out.println("7. Calcular numero de cds");
        System.out.println("8. Obtener la distancia entre dos puntos");
        System.out.println("9. Calcula si debes sacar tu cuil");
        System.out.println("10.Calcula la diferencia de edad y muestra si es mayor");
        System.out.println("11.Calcula si un empleado recibe incentivos o no");
        System.out.println("12.Calcula el numero mayor");
        System.out.println("13.Identifica el tipo de triángulo");
        System.out.println("14.Pasa a numero romano");
        System.out.println("15.Calcula la bonificación");
        System.out.println("16.Numero a vocal");
        System.out.println("17.Obsera qe unidades componen un numero");
        System.out.println("18.Verifica si el numero es par o impar");
        System.out.println("19.Contiene los numeros pares del 1 al 10");
        System.out.println("20.Sueldo promedio");
        System.out.println("21.Verifica si 200 personas son mayores de edad");
        System.out.println("22.El producto de un número");
        System.out.println("23.Muestra 10 numeros enteros impares");
        System.out.println("24.Terminos de una serie menor a 1000");
        System.out.println("25.Ingresa letras");
        System.out.println("26.Terminos de la serie fibonacci menores a 1000");
        System.out.println("27.Calcula suma,resta,multiplicación y división");
        System.out.println("28.Muestra cuantas vocales ingresaste");
        System.out.println("29.Muestra el ganador mediante votos");
        System.out.println("30.Muestra el promedio de dos números");
        System.out.println("Salir");
        op = teclado.nextInt();

        switch (op) {
            case 1:
                distancia(a,b);  
                break;
            case 2:
                promedio(a,b,c);
                break;
            case 3:
                puntajeF(a,b,c,d,e,f);
                break;
            case 4:
                partidos(a,b,c,d,e,res);
                break;
            case 5:
                planilla(a,b,c,res);
                break;
            case 6:
                area(a,b,c,d,res);
                break;
            case 7:
                cds(a,b,c,d);
                break;
            case 8:
                distanciaP(a,b,c,d,e,res);
                break;
            case 9:
                cuil(a,b,c,res);
                break;
            case 10:
                age(a,b,c);
                break;
            case 11:
                produccion(a,b,c,d,e,f,g,res);
                break;
            case 12:
                numbers(a,b,c,res);
                break;
            case 13:
                triangulo(a,b,c);
                break;
            case 14:
                romano();
                break;
            case 15:
                venta(a,b); 
                break;
            case 16:
                vocal();
                break;
            case 17:
                decenas();
                break;
            case 18:
                parimpar();
                break;
            case 19:
                contador();
                break;
            case 20:
                sueldo();
                break;
            case 21:
                edad();
                break;
            case 22:
                enteros();
                break;
            case 23:
                entero();
                break;
            case 24:
                serie();
                break;
            case 25:
                letra();
                break;
            case 26:
                fibonacci();
                break;
            case 27:
                numerico();
                break;
            case 28:
                let();
                break;
            case 29:
                ganador();
                break;
            case 30:
                promedioo();
                break;
            case 31:
                    bandera = 0;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                break;
        }
    }
  }
    public static void distancia(double a, double b) {
        System.out.println("Ingresa la velocidad");
        a = teclado.nextDouble();
        System.out.println("Ingresa el tiempo");
        b =teclado.nextDouble();
        res = a * b;
        System.out.println("Resultado: " + res);
    }
    public static void promedio(double a, double b, double c) {
        System.out.println("Ingrese la primera nota");
        a = teclado.nextInt();
        System.out.println("Ingrese la segunda nota");
        b = teclado.nextInt();
        System.out.println("Ingrese la tercera nota");
        c = teclado.nextInt();
        res = (a + b + c)/3;
        System.out.println("Resultado: " + res);
    }
    public static void puntajeF(double a, double b, double c, double d, double e, double res) {
        System.out.println("Ingrese las respuestas correctas");
        a =teclado.nextInt();
        System.out.println("Ingrese las respuestas Incorrectas");
        b =teclado.nextInt();
        c = a * 4;
        d = b * -1;
        e = c + d;
        res = e;
        System.out.println("El puntaje final es:" + res);
    }
    public static void partidos(double a, double b,double c, double d, double e, double res) {
        System.out.println("Ingrese los partidos ganados");
        a =teclado.nextInt();
        System.out.println("Ingrese los partidos empatados");
        b =teclado.nextInt();
        c = a * 3;
        d = b * 1;
        e = c + d;
        res = e;
        System.out.println("El total de partidos son:" + res);
    }
    public static void planilla(double a, double b, double c, double res) {
        System.out.println("Ingrese las horas laboradas");
        a =teclado.nextInt();
        System.out.println("Ingrese la tarifa por hora");
        b =teclado.nextInt();
        c = a * b;
        res = c;
        System.out.println("Planilla: " + res);
    }
    public static void area(double a, double b, double c, double d, double res) {
        System.out.println("Ingrese el lado A del triangulo");
        a =teclado.nextInt();
        System.out.println("Ingrese el lado B del triangulo");
        b =teclado.nextInt();
        System.out.println("Ingrese el lado C del triangulo");
        c =teclado.nextInt();
        d = (a + b + c) / 2;
        res = Math.sqrt( d * (d - a) * (d - b) * (d - c));
    System.out.println("El area del triangulo es: " + res);
    }
    public static void cds(double a, double b, double c, double res) {
        System.out.println("Ingrese el numero de GB del disco duro");
        a =teclado.nextInt();
        b = a * 1.024;
        c = Math.floor((b / 700) + 1);
        res = c;
        System.out.println(res);
    }
    public static void distanciaP(double a, double b, double c, double d, double e, double res) {
        System.out.println("Ingrese el punto A");
        a =teclado.nextDouble();
        System.out.println("Ingrese abcisa B");
        b =teclado.nextDouble();
        System.out.println("Ingrese ordenada A");
        c =teclado.nextDouble();
        System.out.println("Ingrese ordenada B");
        d =teclado.nextDouble();
        e = Math.sqrt((b - a) *2 + (c - d) *2);
        res = e;
        System.out.println("La distancia es:" + res);
    }
    public static void cuil(double a, double b, double c, double res) {
       System.out.println("Ingrese su año de nacimiento");
        a =teclado.nextInt();
        System.out.println("Ingrese el año actual");
        b =teclado.nextInt();
        c = b - a;
        if ( c > 17){
           System.out.println("Debe solicitar su CUIL");
        }
        else {
            System.out.println( "No debe solicitar su CUIL aun");
        }
    }
    public static void age(double a, double b, double c) {
    System.out.println("Ingrese la edad del primer hermano");
        a =teclado.nextInt();
        System.out.println("Ingrese la edad del segundo hermano");
        b =teclado.nextInt();
        if (a > b){
            System.out.println("El primer hermano es el mayor, por");
            c = a - b;
        }
        else {
            System.out.println("El segundo hermano es el mayor por");
            c = b - a;
        }
        System.out.println("La diferencia de edades es:" + c);
    }
    public static void produccion(double a, double b, double c, double d, double e, double f, double g, double res) {
        System.out.println("Ingrese la producción del dia lunes");
        a =teclado.nextInt();
        System.out.println("Ingrese la producción del dia Martes");
        b =teclado.nextInt();
        System.out.println("Ingrese la producción del dia Miercoles");
        c =teclado.nextInt();
        System.out.println("Ingrese la producción del dia Jueves");
        d =teclado.nextInt();
        System.out.println("Ingrese la producción del dia Viernes");
        e =teclado.nextInt();
        System.out.println("Ingrese la producción del dia Sabado");
        f =teclado.nextInt();
        res = (a + b + c + d + e + f);
        g = res / 6;
        if (res >= 100){
            System.out.println("Recibira Incentivos");
        }
        else {
            System.out.println("No recibira Incentivos");
        }
        System.out.println(res);
    }
    public static void numbers(double a, double b, double c, double res) {
        System.out.println("Ingresa el primer numero");
         a =teclado.nextInt();
         System.out.println("Ingresa el segundo numero");
         b =teclado.nextInt();
         System.out.println("Ingresa el tercer numero:");
         c =teclado.nextInt();
         if ((a > b) && (a > c)){
            res = a;
         }
         else if (a > c){
            res = b;
         }
         else{
            res = c;
         }
         System.out.println("El numero mayor es:" + res);
    }
    public static void triangulo(double a, double b, double c) {
        System.out.println("Ingrese el primer lado");
        a =teclado.nextInt();
        System.out.println("Ingrese el segundo lado");
        b =teclado.nextInt();
        System.out.println("Ingrese el tercer lado");
        c =teclado.nextInt();
        String TT;
        if ((a != b) && (b != c) && (c != a)){
            TT = "Escaleno";
        }
        else if ((a == b) && (b == c)){
            TT = "Equilatero";
         }
        else{
        TT = "Isósceles";
        }
        System.out.println("El tipo de triangulo es:" + TT);
    }
    public static void romano() {
        System.out.println("Ingrese un numero entero entre 1 y 10:");
        num =teclado.nextInt();
        String ER = null;
        switch (num) {
            case 1:
                  ER = "I";
            break;
            case 3:
                  ER = "II";
            break;
            case 4:
                  ER = "IIi";
            break;

            case 5:
                  ER = "IV";
            break;

            case 6:
                  ER = "VI";
            break;

            case 7:
                  ER = "VII";
            break;

            case 8:
                  ER = "VIII";
            break;

            case 9:
                  ER = "IX";
            break;

            case 10:
                  ER = "X";
            break;
        }
        System.out.println("El numero en romano es:" + ER);
    }
    public static void venta(double a, double b) {
         System.out.println("Ingrese el monto de venta alcanzado:");
         a =teclado.nextInt();
        if (a >= 0 && a <= 1000) {
            b = (0 * a) / 100;
        }else if (a >= 1000 && a < 5000){
            b = (3 * a) / 100;
        }else if (a >= 5000 && a < 20000){
            b = (5 * a) / 100;
        }else if (a >= 20000){
            b = (8 * a) / 100;
        }else {
            b = 0;     }
        System.out.println("El total de bonificación es:" + b);
    }
    public static void vocal() {
    System.out.println("Ingrese un numero entero del 1 al 5:");
        num =teclado.nextInt();
        String vocal = "";
        switch (num) {
            case 1:
                  vocal = "A";
            break;

            case 2:
                  vocal = "E";
            break;

            case 3:
                  vocal = "I";
            break;

            case 4:
                  vocal = "O";
            break;

            case 5:
                  vocal = "U";
            break;

            default:
                  vocal = "Valor incorrecto";
            break;
        }
        System.out.println("El resultado es:" + vocal);
    }
    public static void decenas() {
        System.out.println("Ingresa un numero entero de dos digitos");
        num =teclado.nextInt();
        a = Math.sqrt(num / 10);
        b = num - (a * 10);
        c = a;
        d = b;
        System.out.println("Decenas:" + c);
        System.out.println("Unidades:" + d);
    }
    public static void parimpar() {
        System.out.println("Ingresa un numero entero diferente a cero");
        num =teclado.nextInt();
        q = num / 2;
        r = num - (q * 2);
        if (r == 0){
            System.out.println("Is pair");
        }else{
            System.out.println("Is odd");
        }
    }
    public static void contador() {
        System.out.println(num);
        for (int counter = 1; counter <= 4; counter++){
        num = num + 2;
        System.out.println(num);
        }
    }
    public static void sueldo() {
        System.out.println("Ingresa el numero de empleados");
        num =teclado.nextInt();
        b = 0;
        for (i = 1; i <= num; i++){
            System.out.println("Ingrese sueldo");
            a =teclado.nextDouble();
            b = b + a;
        }
        c = b / num;
        System.out.println("El sueldo promedio es:" + c);
    }
    public static void edad() {
        q = 0;
        r = 0;
        for (i = 1; i <= 200; i++){
            System.out.println("Ingresa la edad");
            num =teclado.nextInt();

            if (num < 18 ){
                r = r + 1;
            }else{
                q = q + 1;
            }
        }
        System.out.println("La cantidad de mayores es:" + q);
        System.out.println("La cantidad de menores es:" + r);
    }
    public static void enteros() {
        System.out.println("Ingresa el primer numero entero");
        q =teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        r =teclado.nextInt();
        s = 0;

        for (i = 1; i <= r; i++){
            s = s + q;
        }
        System.out.println("El producto es:" + s);
    }
    public static void entero() {
         i = 0;
        for (num = 1; i < 10; num++){
            if(num % 2 != 0){
                System.out.println(num);
                i++;
            }
        }
    }
    public static void serie() {
        System.out.println("Ingresa la serie");
        num =teclado.nextInt();
        while (num < 1000)
        System.out.println(num);
        num = (num * 2 ) + 1;
    }
    public static void letra() {
        char letras;
        String SEMAF;
        System.out.println("Ingresa letras");
        letras =teclado.next().charAt(0);
        SEMAF = "V";
        while (SEMAF.equals("V")){
            System.out.println(letras);
            switch (letras) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                SEMAF = "R";
                    break;
                default:
                SEMAF = "V";
                    break;
            }
        }
        System.out.println("Fin del programa ingresaste una vocal");
    }
    public static void fibonacci() {
        q = 0;
        r = 1;
        s = q + r;
        System.out.println(q);
        System.out.println(r);
        while (s < 100000){
            System.out.println(s);
            q = r;
            r = s;
            s = q + r;
        }
    }
    public static void numerico() {
        String op;
        System.out.println("Ingresa el primer numero");
        q =teclado.nextInt();
        System.out.println("Ingresa el primer numero");
        r =teclado.nextInt();
        System.out.println("Ingresa un operador aritmetico");
        op =teclado.nextLine();
        switch (op) {
            case "+" :
            num = q + r;
            System.out.println(num);
                break;
            case "-" :
            num = q - r;
            System.out.println(num);
                break;
            case "*" :
            num = q * r;
            System.out.println(num);
                break;
            case "/" :
            num = q / r;
            System.out.println(num);
                break;
            default:
            num = 0;
                break;
        }
    }
    public static void let() {
        char letra;
        System.out.println("Ingrese 10 letras");
        letra =teclado.next().charAt(0);
        q = 0;
        r = 0;
        for (i = 1; i <= 10; i++){
            System.out.println(letra);
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                q = q + 1;    
                break; 
                default:
                r = r + 1;
                    break;
            }
         }System.out.println("Numero de vocales" +q);
         System.out.println("Numero de consonates" +r);
    }
    public static void ganador() {;
        System.out.println("Ingrese el voto");
        VE =teclado.nextInt();

        q = 0;
        r = 0;
        s = 0;
        t = 0;

        for (i = 1; i <= 160; i++){
            System.out.println(VE);

            switch (VE) {
                case 1:
                case 2:
                case 3:
                q = q + 1;     
                    break;
            
                default:
                t = t + 1;
                    break;
            }
        }
        if ((q > r) && (r > s) && (q > t)){
            G = q;

        }else if((r > s) && (r > t)){
            G = r;

        }else if(s > t){
            G = s;
        }else{
            G = t;
        }
        System.out.println("El ganador es:" +G);
    }
    public static void promedioo() {
        System.out.println("Ingrese el primer numero");
        q =teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        r =teclado.nextInt();
        s = (q + r) / 2;
        System.out.println("El promedio de los numeros es:" + s);
    }
}