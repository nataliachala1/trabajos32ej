package proceso1;

import java.util.Scanner;;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el numero del caso seleccionado, los cuales van del 1 al 32");
        int caso = input.nextInt();

        switch (caso) {
            case 1:
            System.out.println("Ingrese la velocidad");
            int velocidad = input.nextInt();
            System.out.println("Ingrese el tiempo");
            int tiempo = input.nextInt();
            int distance = velocidad * tiempo;
            System.out.println("La distancia recorrida es" + distance);
                break;

            case 2:
            System.out.println("Ingrese la primera nota");
            int num1 = input.nextInt();
            System.out.println("Ingrese la segunda nota");
            int num2 = input.nextInt();
            System.out.println("Ingrese la tercera nota");
            int num3 = input.nextInt();
            int average = (num1+num2+num3)/3;
            System.out.println("El promedio es:" + average);
                break;
            
            case 3:
            System.out.println("Ingrese las respuestas correctas");
            int rC =input.nextInt();
            System.out.println("Ingrese las respuestas Incorrectas");
            int rI =input.nextInt();
            System.out.println("Ingrese las respuestas en blanco");
            int rB =input.nextInt();
            int prC = rC * 4;
            int prI = rI * -1;
            int pF = prC + prI;
            int result = pF;
            System.out.println("Las respuestas en blanco son:" + rB);
            System.out.println("El puntaje final es:" + result);
                break;
            
            case 4:
            System.out.println("Ingrese los partidos ganados");
            int pG =input.nextInt();
            System.out.println("Ingrese los partidos empatados");
            int pE =input.nextInt();
            System.out.println("Ingrese los partidos perdidos");
            int pP =input.nextInt();
            int ppG = pG * 3;
            int ppE = pE * 1;
            int pT = ppG + ppE;
            result = pT;
            System.out.println("El total de partidos son:" + result);
            System.out.println("El total de partidos perdidos son:" + pP);
            break;

            case 5:
            System.out.println("Ingrese las horas laboradas");
            int horasL =input.nextInt();
            System.out.println("Ingrese la tarifa por hora");
            int tarifasH =input.nextInt();
            int planilla = horasL * tarifasH;
            int resultado = planilla;
            System.out.println("Planilla: " + resultado);
            break;

            case 6:
            System.out.println("Ingrese el lado A del traingulo");
            double ladoA =input.nextInt();
            System.out.println("Ingrese el lado B del traingulo");
            double ladoB =input.nextInt();
            System.out.println("Ingrese el lado C del traingulo");
            double ladoC =input.nextInt();
            double sP = (ladoA + ladoB + ladoC) / 2;
            double area = Math.sqrt( sP * (sP - ladoA) * (sP - ladoB) * (sP - ladoC));
            System.out.println("El area del triangulo es: " + area);
            break;

            case 7:
            System.out.println("Ingrese el numero de GB del disco duro");
            double GB =input.nextInt();
            double MG = GB * 1.024;
            double CD = Math.floor((MG / 700) + 1);
            double R = CD;
            System.out.println(R);
            break;

            case 8:
            System.out.println("Ingrese el punto A");
            double abcisaA =input.nextDouble();
            System.out.println("Ingrese abcisa B");
            double abcisaB =input.nextDouble();
            System.out.println("Ingrese ordenada A");
            double ordenadaA =input.nextDouble();
            System.out.println("Ingrese ordenada B");
            double ordenadaB =input.nextDouble();
            double distancia = Math.sqrt((abcisaB - abcisaA) *2 + (ordenadaB - ordenadaA) *2);
            double respuestas = distancia;
            System.out.println("La distancia es:" + respuestas);
            break;

            case 9:
            System.out.println("Ingrese su año de nacimiento");
            int añoN =input.nextInt();
            System.out.println("Ingrese el año actual");
            int añoA =input.nextInt();
            int age = añoA - añoN;
            if ( age > 17){
               System.out.println("Debe solicitar su CUIL");
            }
            else {
                System.out.println( "No debe solicitar su CUIL aun");
            }
            break;
    

            case 10:
            System.out.println("Ingrese la edad del primer hermano");
            int age1 =input.nextInt();
            System.out.println("Ingrese la edad del segundo hermano");
            int age2 =input.nextInt();
            int diferenciaE;
            if (age1 > age2){
               System.out.println("El primer hermano es el mayor, por");
                diferenciaE = age1 - age2;
            }
            else {
                System.out.println("El segundo hermano es el mayor por");
                diferenciaE = age2 - age1;
            }
            System.out.println("La diferencia de edades es:" + diferenciaE);
            break;

            case 11:
            System.out.println("Ingrese la producción del dia lunes");
            int pLunes =input.nextInt();
            System.out.println("Ingrese la producción del dia Martes");
            int pMartes =input.nextInt();
            System.out.println("Ingrese la producción del dia Miercoles");
            int pMiercoles =input.nextInt();
            System.out.println("Ingrese la producción del dia Jueves");
            int pJueves =input.nextInt();
            System.out.println("Ingrese la producción del dia Viernes");
            int pViernes =input.nextInt();
            System.out.println("Ingrese la producción del dia Sabado");
            int pSabado =input.nextInt();
            int pTotal = (pLunes + pMartes + pMiercoles + pJueves + pViernes + pSabado);
            int pPromedia = pTotal / 6;
            if (pPromedia >= 100){
                System.out.println("Recibira Incentivos");
            }
            else {
                System.out.println("No recibira Incentivos");
            }
            break;

            case 12:
            System.out.println("Ingresa el primer numero");
            num1 =input.nextInt();
            System.out.println("Ingresa el segundo numero");
            num2 =input.nextInt();
            System.out.println("Ingresa el tercer numero:");
            num3 =input.nextInt();
            int numM;
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
            break;

            case 13:
            System.out.println("Ingrese el primer lado");
            int lado1 =input.nextInt();
            System.out.println("Ingrese el segundo lado");
            int lado2 =input.nextInt();
            System.out.println("Ingrese el tercer lado");
            int lado3 =input.nextInt();
            String TT;
            if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)){
                TT = "Escaleno";
            }
            else if ((lado1 == lado2) && (lado2 == lado3)){
                TT = "Equilatero";
            }
            else{
                TT = "Isósceles";
            }
            System.out.println("El tipo de triangulo es:" + TT);
            break;

            case 14:
            System.out.println("Ingrese un numero entero entre 1 y 10:");
            int num =input.nextInt();
            String ER = "0";
            switch (num) {
                case 1: ER = "I";
                break;
                case 3: ER = "II";
                break;
                case 4: ER = "IIi";
                break;
                case 5: ER = "IV";
                break;
                case 6: ER = "VI";
                break;
                case 7: ER = "VII";
                break;
                case 8: ER = "VIII";
                break;
                case 9: ER = "IX";
                break;
                case 10: ER = "X";
                break;
            }
            System.out.println("El numero en romano es:" + ER);

            case 15:
            System.out.println("Ingrese el monto de venta alcanzado:");
            int mVenta =input.nextInt();
            int totalB;
    
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
            break;

            case 16:
            System.out.println("Ingrese un numero entero del 1 al 5:");
            num =input.nextInt();
            String vocal = "";
            switch (num) {
                case 1: vocal = "A";
                break;
                case 2: vocal = "E";
                break;
                case 3: vocal = "I";
                break;
                case 4: vocal = "O";
                break;
                case 5: vocal = "U";
                break;
                default:vocal = "Valor incorrecto";
                break;
            }
            System.out.println("El resultado es:" + vocal);
            break;

            case 17:
            System.out.println("Ingresa un numero entero de dos digitos");
            int numero =input.nextInt();
            double cocienteEn = Math.sqrt(numero / 10);
            double residuo = numero - (cocienteEn * 10);
            double decenas = cocienteEn;
            double unidades = residuo;
            System.out.println("Decenas:" + decenas);
            System.out.println("Unidades:" + unidades);
            break;

            case 18:
            System.out.println("Ingresa un numero entero diferente a cero");
            num =input.nextInt();
            int Q = num / 2;
            int r = num - (Q * 2);
    
            if (r == 0){
                System.out.println("Is pair");
            }else{
                System.out.println("Is odd");
            }
            break;
            
            case 19:
            int number = 2;
            System.out.println(number);
            for (int counter = 1; counter <= 4; counter++){
                number = number + 2;
                System.out.println(number);
            }
            break;

            case 20:
            System.out.println("Ingresa el numero de empleados");
            int numE =input.nextInt();
            double SS= 0;
            double SE = 0;
            double SP = 0;
            int counter;
            for (counter = 1; counter <= numE; counter++){
                System.out.println("Ingrese sueldo");
                SE =input.nextDouble();
                SS = SS + SE;
            }
            SP = SS / numE;
            System.out.println("El sueldo promedio es:" + SP);
            break;

            case 21:
            int menores = 0;
            int mayores = 0;
            for (counter = 1; counter <= 200; counter++){
                System.out.println("Ingresa la edad");
                int EP =input.nextInt();
                if (EP < 18 ){
                    menores = menores + 1;
                }else{
                    mayores = mayores + 1;
                }
            }
            System.out.println("La cantidad de mayores es:" + mayores);
            System.out.println("La cantidad de menores es:" + menores);
            break;

            case 22:
            System.out.println("Ingresa el primer numero entero");
            num1 =input.nextInt();
            System.out.println("Ingresa el segundo numero entero");
            num2 =input.nextInt();
            int producto = 0;
            for (counter = 1; counter <= num2; counter++){
                producto = producto + num1;
            }
            System.out.println("El producto es:" + producto);
            break;

            case 23:
            counter = 0;
            for (num = 1; counter < 10; num++){
                if(num % 2 != 0){
                    System.out.println(num);
                    counter++;
                 } }
            break;

            case 24:
            System.out.println("Ingresa la serie");
            int serie =input.nextInt();
            while (serie < 1000)
            System.out.println(serie);
            serie = (serie * 2 ) + 1;
            break;

            case 25:
            System.out.println("Ingresa letras");
            char letras =input.next().charAt(0);
            String SEMAF = "V";
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
            break;

            case 26:
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
            break;

            case 27:
            System.out.println("Ingresa el primer numero");
            num1 =input.nextInt();
            System.out.println("Ingresa el primer numero");
            num2 =input.nextInt();
            System.out.println("Ingresa un operador aritmetico");
            String op =input.nextLine();
            switch (op) {
                case "+" :
                result = num1 + num2;
                System.out.println(result);
                    break;
                
                case "-" :
                result = num1 - num2;
                System.out.println(result);
                    break;
    
                case "*" :
                result = num1 * num2;
                System.out.println(result);
                    break;
    
                case "" :
                result = num1 * num2;
                System.out.println(result);
                    break;
            
                default:
                result = 0;
                    break;
            }
            break;

            case 28:
            System.out.println("Ingrese 10 letras");
            char letra =input.next().charAt(0);
            int NV,NC;
            NV = 0;
            NC = 0;
            for (counter = 1; counter <= 10; counter++){
                System.out.println(letra);
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    NV = NV + 1;    
                    break;
                    default:
                    NC = NC + 1;
                        break;
                }
            }System.out.println("Numero de vocales" +NV);
             System.out.println("Numero de consonates" +NC);
             break;

             case 29:
             System.out.println("Ingrese el voto");
             int VE =input.nextInt();
             int G;
             int C1 = 0;
             int C2 = 0;
             int C3 = 0;
             int C0 = 0;
             for (counter = 1; counter <= 160; counter++){
                 System.out.println(VE);
                 switch (VE) {
                     case 1:
                     case 2:
                     case 3:
                     C1 = C1 + 1;     
                         break;
                 
                     default:
                     C0 = C0 + 1;
                         break;
                 }
             }
             if ((C1 > C2) && (C2 > C3) && (C1 > C0)){
                 G = C1;
             }else if((C2 > C3) && (C2 > C0)){
                 G = C2;
             }else if(C3 > C0){
                 G = C3;
             }else{
                 G = C0;
             }
             System.out.println("El ganador es:" +G);
             break;

             case 30:
             System.out.println("Ingrese el primer numero");
             num1 =input.nextInt();
             System.out.println("Ingrese el segundo numero");
             num2 =input.nextInt();
             result = (num1 + num2) / 2;
             System.out.println("El promedio de los numeros es:" + result);
             break;

             case 31:
             System.out.println("Ingrese un numero");
             num =input.nextInt();
             switch (num) {
                 case 1:
                 System.out.println("enero");
                     break;
                 case 2: 
                 System.out.println("febrero");
                 case 3:
                 System.out.println("Marzo");
                     break;
                 case 4:
                 System.out.println("Abril");
                     break;
                 case 5:
                 System.out.println("Mayo");
                     break;
                 case 6:
                 System.out.println("Junio");
                     break;
                 case 7:
                 System.out.println("Julio");
                     break;
                 case 8:
                 System.out.println("Agosto");
                     break;
                 case 9:
                 System.out.println("septiembre");
                     break;
                 case 10:
                 System.out.println("Octubre");
                     break;
                 case 11:
                 System.out.println("Noviembre");
                     break;
                 case 12:
                 System.out.println("Diciembre");
                     break;
                 default:
                     break;
             }break;

             case 32:
             System.out.println("ingrese un numero");
             num = input.nextInt();
             if(num == 0){
                 System.out.println("El numero ingresado no puede ser cero");
             }
             for (counter = 1; counter <= num; counter++){
                 if (num %  counter == 0){
                     System.out.println(counter);
                 }
             }break;
            default:
                break;
        }
    }  
}