import java.util.Scanner;

public class Main {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        /*Ejercicio 1: Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos. */
        System.out.println("EJERCICIO  1");

        System.out.println("Introduzca su edad");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }


    /*Ejercicio 2:Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
    mayor de edad” o el mensaje de “eres menor de edad”. */
        System.out.println("EJERCICIO  2");

        System.out.println("Introduzca su edad");
        int edad2 = scanner.nextInt();

        if (edad2 >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    /*Ejercicio 3: Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
    3... 20).  */
        System.out.println("EJERCICIO  3");
        scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Número: " + i);
        }

        /*Ejercicio 4:  Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
Para ello utiliza un contador y suma de 2 en 2. */
        System.out.println("EJERCICIO  4");
        scanner = new Scanner(System.in);

        for (int i = 0; i <= 200; i = i + 2) {
            System.out.println("Número: " + i);
        }

        /*Ejercicio 5:  Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
Esta vez utiliza un contador sumando de 1 en 1. */

        System.out.println("EJERCICIO  5");
        scanner = new Scanner(System.in);

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                IO.println("El numero par es: " + i);
            }

        }

/* Ejercicio 6: Realiza un programa que muestre los
        números desde el 1 hasta un número N que se introducirá por teclado.
    */
        IO.println("EJERCICIO 6");
        scanner = new Scanner(System.in);
        IO.println("Introduzca el valor del numero final: ");
        int valor = scanner.nextInt();

        for(int i = 1; i <= valor; i++) {
            IO.println("El valor es: "+i);
        }

    /* Ejercicio 7: Escribe un programa que lea una calificación numérica entre 0 y 10
    y la transforma en calificación alfabética, escribiendo el resultado.
    • de 0 a < 3 Muy Deficiente.
    • de 3 a < 5 Insuficiente.
    • de 5 a < 6 Suficiente.
    • de 6 a < 7 Bien.
    • de 7 a < 9 Notable
    • de 9 a 10 Sobresaliente
    */
        IO.println("EJERCICIO 7");
        scanner = new Scanner(System.in);
        IO.println("Por favor, introduzca el valor de su nota");
        double nota = scanner.nextDouble();

        if(nota >= 0 && nota < 3) {
            IO.println("MUY DEFICIENTE");
        }else if(nota >= 3 && nota < 5) {
            IO.println("INSUFICIENTE");
        }else if(nota >= 5 && nota < 6) {
            IO.println("SUFICIENTE");
        }else if(nota >= 6 && nota < 7) {
            IO.println("BIEN");
        }else if(nota >= 7 && nota < 9) {
            IO.println("NOTABLE");
        }else if(nota >= 9 && nota <= 10) {
            IO.println("SOBRESALIENTE");
        }else{
            IO.println("El valor de la nota tiene que estar entre 0 y 10");
        }

    /* Ejercicio 8: Realiza un programa que lea un número positivo N
    y calcule y visualice su factorial N!
     */
        IO.println("EJERCICIO 8");
        scanner = new Scanner(System.in);
        IO.println("Introduzca el valor del numero para calcular el factorial: ");
        int num = scanner.nextInt();

        double factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        IO.println("El factorial de " + num + "es :" + Math.abs(factorial));

    /*EJERCICIO 9: Escribe un programa que recibe como datos de entrada
    una hora expresada en horas, minutos y segundos que nos calcula y
    escribe la hora, minutos y segundos que serán, transcurrido un segundo.
    */
        IO.println("EJERCICIO 9");
        scanner = new Scanner(System.in);
        IO.println("Introduzca el valor de la hora: ");
        int hora = scanner.nextInt();
        IO.println("Introduzca el valor de los minutos: ");
        int minutos = scanner.nextInt();
        IO.println("Introduzca el valor de los segundos: ");
        int segundos = scanner.nextInt();

        //Pasa un segundo
        segundos ++;

        if(segundos >= 60) {
            segundos = 0;
            minutos ++;
            if(minutos >= 60) {
                minutos = 0;
                hora++;
                if(hora >= 24){
                    hora = 0;
                }
            }
        }
        IO.println(hora + ":" + minutos + ":" + segundos);

    /*EJERCICIO 10: Realiza un programa que lea 10 números no nulos
    y luego muestre un mensaje de si ha leído algún número negativo o no.
    */
        IO.println("EJERCICIO 10");
        scanner = new Scanner(System.in);

        int contador  = 0;
        boolean hayNegativos = false;
        while(contador <= 10){
            IO.println("Introduce un numero no nulo: ");
            int numero = scanner.nextInt();
            if(numero !=0){
                contador++;
                if(numero < 0) {
                    hayNegativos = true;
                }
            }
        }

        IO.println("Se han introducido numeros negativos: "+hayNegativos);

    /*EJERCICIO 11: Realiza un programa que lea 10 números no nulos y
    luego muestre un mensaje indicando cuántos son positivos y cuantos negativos. .
    */
        IO.println("EJERCICIO 11");
        scanner = new Scanner(System.in);

        int contador2  = 0;
        int negativos = 0, positivos = 0;
        while(contador <= 10){
            IO.println("Introduce un numero no nulo: ");
            int numero = scanner.nextInt();
            if(numero !=0){
                contador++;
                if(numero < 0) {
                    negativos++;
                }
                else{
                    positivos++;
                }
            }
        }

        IO.println("Se han introducido "+ negativos + " numeros negativos y " + positivos);

    /*EJERCICIO 12: Realiza un programa que lea una secuencia de números no nulos
    hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo,
    cuantos positivos y cuantos negativos.
    */
        IO.println("EJERCICIO 12");
        scanner = new Scanner(System.in);

        int numero = 0;
        int negativos2 = 0, positivos2 = 0;
        boolean hayNegativos2 = false;

        do{
            IO.println("Introduce un numero");
            numero = scanner.nextInt();
            if(numero < 0) {
                negativos2++;
                hayNegativos2 = true;
            }
            else if(numero > 0){
                positivos2++;
            }

        } while(numero != 0);


        if(hayNegativos2){
            IO.println("Se han introducido algun numero negativo");
        }
        IO.println("Se han introducido "+ negativos + " numeros negativos y " + positivos);

/*
    EJERCICIO 13: Realiza un programa que calcule y escriba la suma y
    el producto de los 10 primeros números naturales.
 */
        IO.println("EJERCICIO 13");
        scanner = new Scanner(System.in);

        IO.println("Introduce hasta que numero quieres calcular la suma y el producto");
        int numF = scanner.nextInt();

        double suma = 0;
        double producto = 1;
        for(int i = 1; i <= numF; i++) {
            suma = suma + i ;
            producto = producto * i;
        }
        IO.println("La suma es : " + suma);
        IO.println("El producto es : " + producto);

/*
    EJERCICIO 14: Escribe un programa que calcula el salario neto semanal de un trabajador
    en función del número de horas trabajadas y la tasa de impuestos de acuerdo
    a las siguientes hipótesis:
    • Las primeras 35 horas se pagan a tarifa normal.
    • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
    • Las tasas de impuestos son:
    • Los primeros 500 euros son libres de impuestos.
    • Los siguientes 400 tienen un 25% de impuestos.
    • Los restantes un 45% de impuestos.
    Escribir nombre, salario bruto, tasas y salario neto.
 */
        IO.println("EJERCICIO 14");
        scanner = new Scanner(System.in);
        IO.println("Introduzca las horas semanales trabajadas: ");
        double horasTrabajadas = Math.abs(scanner.nextDouble());
        double tarifa = 10.0;
        double salarioNeto = 0, salabrioBruto = 0;


        if(horasTrabajadas <= 35){
            salabrioBruto = tarifa * horasTrabajadas;
        }else{
            salabrioBruto = tarifa * 35 + (horasTrabajadas - 35) * tarifa * 1.5;
        }
        IO.println("El salario bruto es : " + salabrioBruto);
        double impuestos = 0;
        if(salabrioBruto <= 500){
            salarioNeto = salabrioBruto;
        }else if(salabrioBruto <= 900){
            impuestos = (salabrioBruto - 500) * 0.25;
            salarioNeto = salabrioBruto - impuestos;
        }
        else{
            impuestos = 400 * 0.25 + (salabrioBruto - 900) * 0.45;
            salarioNeto = salabrioBruto - impuestos;
        }

        IO.println("La salario neto es : " + salarioNeto);
        IO.println("Las tasas son : " + impuestos);

    }
}
