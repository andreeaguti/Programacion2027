import java.util.Scanner;

public class Main {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

    //Ejercicio 1: Escribe un programa que dé los “buenos días”.
        System.out.println("EJERCICIO  1");
        System.out.println("BUENOS DIAS");

    //Ejercicio 2: Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
        System.out.println("EJERCICIO  2");
        int ladoCuadrado = 5;
        int areaCuadrado = ladoCuadrado * 2;
        System.out.println("El área del cuadrado es " + areaCuadrado);

    //Ejercicio 3: Escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
        System.out.println("EJERCICIO  3");

        System.out.println("Introduzca el área de un cuadrado");
        int ladoIntroducido = scanner.nextInt();

        int areaLadoIntroducido = ladoIntroducido * 2;

        System.out.println("El área del cuadrado es " + areaLadoIntroducido);

    //Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,  producto y división.

        System.out.println("EJERCICIO  4");

        System.out.println("Introduzca un numero");
        int numero1 = scanner.nextInt();

        System.out.println("Introduzca un numero");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        int division = numero1 / numero2;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + producto);
        System.out.println("La división de los números es: " + division);


    /*Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
    volumen de la esfera que corresponden con dicho radio. */
        System.out.println("EJERCICIO  5");

        System.out.println("Introduzca la longitud del radio");
        int longitudRadio = scanner.nextInt();


        double longitudCircunferencia = 2 * longitudRadio * Math.PI;
        double areaCirculo = Math.PI * (longitudRadio * longitudRadio);
        double volumenEsfera = (longitudRadio/3) * Math.PI * Math.pow(longitudRadio , 3);

        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println("El área del circulo es: " + areaCirculo);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);


    /*Ejercicio 6: Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado. */
        System.out.println("EJERCICIO 6");
        scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de venta real");
        double precioReal = scanner.nextDouble();
        System.out.println("Ingrese el precio de venta del articulo");
        double precioVenta = scanner.nextDouble();

        double descuento = ((precioReal - precioVenta) / precioReal) * 100.0;
        System.out.println("El descuento aplicado es: " + descuento + "%.");


/*
        Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
        */
        System.out.println("EJERCICIO 7");
        scanner = new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas marinas");
        double distanciaMillas = scanner.nextDouble();
        double distanciaMetros = distanciaMillas * 1.852;
        System.out.println("La distancia en metros es: " + distanciaMetros + "m.");

        /*
        Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.
        */
        System.out.println("EJERCICIO 8");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num3 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num4 = scanner.nextDouble();

        System.out.println("Los numeros en orden ascendente son: " + Math.min(num3, num4) + ", "
                + Math.max(num3, num4));

        /*
        Ejercicio 9: Escribe un programa que lee dos números
        y nos dice cuál es el mayor o si son iguales.
        */
        System.out.println("EJERCICIO 9");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num5 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num6 = scanner.nextDouble();

        System.out.println("Los numeros son iguales: " + (num5 == num6));
        System.out.println("El primer numero es mayor que el segundo: " + (num5 > num6));

        /*
        Ejercicio 10: Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
        */
        System.out.println("EJERCICIO 10");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num7 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num8 = scanner.nextDouble();
        System.out.println("Introduce el tercer numero");
        double num9 = scanner.nextDouble();

        System.out.println("El numero mayor es: " + Math.max(num9, Math.max(num7, num8)));

        /*
        Ejercicio 13: Escribe un programa que lee un número y me dice si es positivo
         o negativo consideraremos el cero como positivo.
        */
        System.out.println("EJERCICIO 10");
        scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double numero = scanner.nextDouble();
        System.out.println("El numero es positivo :" +(numero >= 0));
        System.out.println("El numero es negativo :" +(numero < 0));






    }
}
