void main() {

    Scanner sc = new Scanner(System.in);

/*EJERCICIO 1: Crea un programa que pida diez números reales por teclado, los almacene en un array,
y luego muestre todos sus valores. */

    //Declaro un array para guardar los 10 numeros reales
    double [] numerosReales = new double [10];

    //Ahora hago un bubcle for para que pida los 10 numeros
    for(int i= 0; i < numerosReales.length; i++) {
        System.out.println("Introduce el número real " + (i+1) + ":" );
        //Lo guardo en el array
        numerosReales[i] = sc.nextDouble();
    }
    //Para que muestre por pantalla todo el array
    System.out.println(Arrays.toString(numerosReales));


    /*EJERCICIO 2: Crea un programa que pida diez números reales por teclado, los almacene en un array,
    y luego muestre la suma de todos los valores. */

    //Declaro un array para guardar los 10 numeros reales
    double [] numerosReales2 = new double [10];

    //Ahora hago un bucle for para que pida los 10 numeros
    for(int i= 0; i < numerosReales2.length; i++) {
        System.out.println("Introduce el número real " + (i+1) + ":" );
        //Lo guardo en el array
        numerosReales2[i] = sc.nextDouble();
    }
    //Llamo al metodo que he creado externo
    double resultadoSuma = sumaArray(numerosReales2);
    //Muestro el resultado por pantalla
    System.out.println("La suma de todo el array es: " + resultadoSuma);


    /*EJERCICIO 3: Crea un programa que pida diez números reales por teclado, los almacene en un array,
y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.  */

    //Declaro un array para guardar los 10 numeros reales
    double [] numerosReales3 = new double [10];
    //Declaro las variables para el máximo y el mínimo
    double max = - Double.MAX_VALUE, //Empezamos desde lo más bajo
            min = Double.MAX_VALUE; //Empezamos desde lo más alto

    //Ahora hago un bucle for para que pida los 10 numeros
    for(int i= 0; i < numerosReales2.length; i++) {
        System.out.println("Introduce el número real " + (i+1) + ":" );
        //Lo guardo en el array
        numerosReales3[i] = sc.nextDouble();
    }
    for (int i = 0; i < numerosReales3.length; i++){
        max = Math.max(numerosReales3[i], max);
        min = Math.min(numerosReales3[i], min);
    }
    System.out.println("El número más grande del array es: " + max);
    System.out.println("El número más pequeño del array es: " + min);


    /*EJERCICIO 4: Crea un programa que pida veinte números enteros por teclado, los almacene en un
    array y luego muestre por separado la suma de todos los valores positivos y negativos. */

    //Declaro un array para guardar los 20 numeros enteros
    int [] numerosEnteros1 = new int [20];
    //Declaro las variables para la suma de los positivos y negativos
    int sumaP = 0, sumaN = 0;

    for (int i = 0; i < numerosEnteros1.length; i++) {
        System.out.println("Introduce el numero real " + (i+1) + ": ");
        numerosEnteros1[i] = sc.nextInt();
        if(numerosEnteros1[i] >= 0) {
            sumaP += numerosEnteros1[i];
        }
        else{
            sumaN += numerosEnteros1[i];
        }

    }
    System.out.println("La suma es: " + sumaP);
    System.out.println("La suma es: " + sumaN);


    /*EJERCICIO 5: Crea un programa que pida veinte números reales por teclado, los almacene en un array
    y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.  */

    //Declaro un array para guardar los 20 numeros enteros
    double [] numerosReales5 = new double[20];

    //Declaro las variables para calcular la media
    double suma = 0.0;

    for(int i= 0; i < numerosReales5.length; i++) {
        System.out.println("Introduce el número real " + (i+1) + ":" );
        //Lo guardo en el array
        numerosReales5[i] = sc.nextDouble();
        suma += numerosReales5[i];
    }
    System.out.println("La suma de los valores es: " + suma);
    System.out.println("La media de los valores es: " + (suma / numerosReales5.length));


    /*EJERCICIO 6: Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
    N, escriba M en todas sus posiciones y lo muestre por pantalla. */

    sc = new Scanner(System.in);
    System.out.println("Introduce el valor de N para la dimension del array");
    int n = sc.nextInt();
    System.out.println("Introduce el valor de M");
    double m = sc.nextDouble();

    if(n > 0){
        double arrayN [] = new double[n];
        Arrays.fill(arrayN, m);
        System.out.println(Arrays.toString(arrayN));

        for(int i = 0; i < arrayN.length; i++){
            arrayN[i] =  m;
            System.out.println(arrayN[i]);
        }

    }
    else{
        System.out.println("No se pueden crear arrays con tamaño negativo");
    }

    /*EJERCICIO 7: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
    todos los valores desde P hasta Q, y lo muestre por pantalla.*/
    sc = new Scanner(System.in);
    System.out.println("Introduce el valor de P");
    int p = sc.nextInt();
    System.out.println("Introduce el valor de Q");
    int q = sc.nextInt();

    int dimension = Math.abs(q-p) -1;
    int [] numeros7 = new int [dimension];
    for(int i = 0; i < numeros7.length; i++){
        if(q > p){
            numeros7 [i] = p + (i+1);
            System.out.println(numeros7[i]);
        }
        else{
            numeros7 [i] = q + (i+1);
            System.out.println(numeros7[i]);
        }

    }

    /*EJERCICIO 8: Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
    utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
    cuántos valores del array son igual o superiores a R.*/

    sc = new Scanner(System.in);
    double [] numeros8 = new double [100];

    for(int i = 0; i < numeros8.length; i++){
        numeros8 [i] = Math.random();
    }

    System.out.println("Introduce el valor de R (entre 0 y 1)");
    double r = sc.nextDouble();
    int contadorMayores = 0, contadorMenores = 0;

    for(int i = 0; i < numeros8.length; i++){
        if(numeros8 [i] >= r){
            contadorMayores++;
        }
        else{
            contadorMenores++;
        }
    }
    System.out.println("Los numeros mayores que R son: " + contadorMayores);
    System.out.println("Los numeros menores que R son: " + contadorMenores);

    /*
        Ej 9: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros
        aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué
        posiciones del array aparece N.
        */
    sc = new Scanner(System.in);
    int [] numeros9 = new int [100];

    for(int i = 0; i < numeros9.length; i++){
        numeros9 [i] = (int) (Math.random() * 10 + 1); //cast --> conversion de tipo 10,7 --> 10
    }
    System.out.println("Introduce el valor de N");
    int nBuscar = sc.nextInt();

    for(int i = 0; i < numeros9.length; i++){
        if(numeros9[i] == nBuscar){
            System.out.println("Aparece en la posicion: " +i);
        }
    }

        /*
        Ej 10: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
        Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
        Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y
        por debajo de la media.
        */
    sc = new Scanner(System.in);
    System.out.println("Introduce el valor de N");
    int nAlturas = sc.nextInt();
    double [] alturas = new double [nAlturas];
    double sumaAlturas = 0.0, mediaAlturas = 0.0, maximaAlturas = -Double.MAX_VALUE, minimaAlturas = Double.MAX_VALUE;

    for(int i = 0; i < alturas.length ; i++){
        System.out.println("Introduce el valor de la altura " + (i+1) + ": ");
        alturas[i] = sc.nextDouble();
        sumaAlturas += alturas[i];
    }

    mediaAlturas = sumaAlturas / alturas.length;

    int contadorAlturas = 0;
    for(int i = 0; i < alturas.length; i++){

        maximaAlturas = Math.max(alturas[i], maximaAlturas);
        minimaAlturas = Math.min(alturas[i], minimaAlturas);

        if(alturas[i] >= mediaAlturas){
            contadorAlturas++;
        }
    }

    System.out.println("La media es: " + mediaAlturas);
    System.out.println("La altura maxima es: " + maximaAlturas);
    System.out.println("La altura minima es: " + minimaAlturas);
    System.out.println("Personas por encima de la media: " + contadorAlturas);
    System.out.println("Persona por debajo de la media: " + (Math.abs(alturas.length - contadorAlturas)));

        /*
        Ej 11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
        primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
        primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
        */
    sc = new Scanner(System.in);
    int [] array1 =   new int [100];
    int [] array2 =   new int [100];

    for(int i = 0; i < array1.length; i++){
        array1[i] = i + 1;
    }

    for(int i = 0; i < array2.length; i++){
        array2[i] = array1[(array1.length - 1) - i ];
    }

    //Opcion 1: menos codigo
    System.out.println(Arrays.toString(array2));

    //Opcion 2: Si no recordamos la clase Arrays
    for(int num : array2){
        System.out.println(num);
    }

        /*
        Ej 12: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
        distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P,
        luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta que el usuario
        elija la opción ‘c’ que terminará el programa.
        */
    sc = new Scanner(System.in);
    int [] array3 =   new int [10];

    String opcion = "c";

    int contadorPosicion = 0;
    do{
        System.out.println("Escoja la opcion deseada: ");
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valor: ");
        System.out.println("c. Salir");
        opcion = sc.nextLine();


        switch (opcion) {
            case "a":
                System.out.println(Arrays.toString(array3));
                break;

            case "b":
                sc = new Scanner(System.in);
                System.out.println("Introduce la posicion donde quieras insertar el valor: ");
                contadorPosicion = sc.nextInt();
                if(contadorPosicion < array3.length && contadorPosicion >= 0){
                    array3[contadorPosicion] = sc.nextInt();
                }
                else{
                    System.out.println("No se pueden insertar porque la posicion no coincide");
                }
                break;

            case "c":
                System.out.println("El menu se cerrara");
                break;

            default:
                System.out.println("Por favor escoja una opcion correcta");

        }

    }while(!opcion.equals("c")); //opcion.equals("c") == false

        /*
        Ej 13: Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
        luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un valor inicial V,
        y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
        Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de
        N (nº de valores a crear).
        */
    sc = new Scanner(System.in);
    System.out.println("Introduce el valor inicial V: ");
    int vInicial = sc.nextInt();
    System.out.println("Introduce el incremento I: ");
    int iInicial = sc.nextInt();
    System.out.println("Introduce la cantidad de valores que se desean obtener: ");
    int cantidadN = sc.nextInt();

    int[] valores = new int[cantidadN];
    valores[0] = vInicial;

    for(int i = 1; i < valores.length; i++){
        valores[i] = valores[i-1] + iInicial;
    }

    System.out.println(Arrays.toString(valores));

        /*
        Ej 14: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de valores:
        1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces,
        y luego la muestre por pantalla.
        */
    sc = new Scanner(System.in);
    // --- 1. Calcular el tamaño del array ---
    // Necesitamos sumar 1 + 2 + 3 + ... + 10.
    // Usamos la fórmula de la suma de Gauss: n * (n + 1) / 2
    int n14 = 10;
    int tamanoArray = n14 * (n14 + 1) / 2; // Esto da 10 * 11 / 2 = 55

    int[] secuencia = new int[tamanoArray];

    // Usamos 'indiceActual' para saber en qué posición del array estamos escribiendo.
    int indiceActual = 0;

    // El bucle exterior itera sobre el NÚMERO que queremos insertar (del 1 al 10)
    for (int numero = 1; numero <= n14; numero++) {

        // El bucle interior repite la inserción 'numero' veces
        // (Ej: si numero=3, repite 3 veces)
        for (int i = 0; i < numero; i++) {

            // Asignamos el número a la posición actual
            secuencia[indiceActual] = numero;

            // Avanzamos a la siguiente posición del array
            indiceActual++;
        }
    }

    System.out.println("Array con la secuencia generada:");
    System.out.println(Arrays.toString(secuencia));


    //Ejemplo String split y forEach

    String frase = "En un lugar de la Mancha de cuyo nombre no quiero acordarme";
    String [] palabras = frase.split(" ");

//        for(int i = 0; i < palabras.length; i++){
//            System.out.println(palabras[i]);
//        }

    for(String palabra : palabras){
        System.out.println(palabra);
    }

}







//METODO PARA SUMAR EL ARRAY (EJERCICIO 2)
public static double sumaArray(double numerosReales2[]){
    double suma = 0;
    for (int i=0; i<numerosReales2.length; i++)
        suma+= numerosReales2[i];
    return suma;
}
