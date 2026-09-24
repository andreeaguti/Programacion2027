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
        System.out.println("EJERCICIO  6");

        System.out.println("Introduzca el precio real del artículo:");
            double precioArticulo = scanner.nextDouble();

        System.out.println("Introduzca el precio de venta final:");
            double precioVenta = scanner.nextDouble();

        double desccuento = (precioArticulo - precioVenta) / precioArticulo;

        double porcentajeDescuento;


    }
}
