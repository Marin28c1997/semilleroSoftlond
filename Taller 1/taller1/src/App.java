
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.xml.stream.events.Characters;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Realiza un programa que solicite al usuario dos números enteros
         * y muestre su suma, resta, multiplicación y división.
         */
        // String numero1 = JOptionPane.showInputDialog("Por favor ingrese un número:
        // ");
        // String numero2 = JOptionPane.showInputDialog("Por favor ingrese otro número:
        // ");

        // int suma = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        // int resta = Integer.parseInt(numero1) - Integer.parseInt(numero2);
        // int multiplicacion = Integer.parseInt(numero1) * Integer.parseInt(numero2);
        // double division = 0;

        // if (Integer.parseInt(numero2) != 0) {
        // division = Integer.parseInt(numero1) / Integer.parseInt(numero2);
        // } else {
        // JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
        // }

        // JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        // JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        // JOptionPane.showMessageDialog(null, "La multiplicación es: " +
        // multiplicacion);
        // JOptionPane.showMessageDialog(null, "La división es: " + division);

        // _________________________________________________________________________________________________________
        /*
         * 2. Escribe un programa que pida al usuario un número entero y determine si es
         * par o impar.
         */
        // String parNoPar = JOptionPane.showInputDialog("Por favor ingrese un número
        // entero: ");
        // int par = Integer.parseInt(parNoPar);
        // if(par % 2 == 0){
        // JOptionPane.showMessageDialog(null, "El número " + par + " es par");
        // }else{
        // JOptionPane.showMessageDialog(null, "El número " + par + " no es par");
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 3. Crea un programa que calcule y muestre el área y el perímetro de un
         * círculo.
         * El usuario debe proporcionar el radio del círculo.
         */

        // String radio = JOptionPane.showInputDialog("Por favor ingrese el radio del
        // círculo: ");
        // double perimetro = Integer.parseInt(radio) * 2 * Math.PI;
        // double area = Math.pow(Integer.parseInt(radio), 2) * Math.PI;

        // DecimalFormat decimales = new DecimalFormat("#.####");
        // String perimetroConDecimales = decimales.format(perimetro);
        // String areaConDecimales = decimales.format(area);

        // JOptionPane.showMessageDialog(null, "El perímetro del círculo es: " +
        // perimetroConDecimales + " y su área es de: " + areaConDecimales);

        // _________________________________________________________________________________________________________________
        /*
         * 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
         * o menor de edad.
         */

        // String edad = JOptionPane.showInputDialog("Por favor ingrese su edad: ");
        // int mayorEdad = Integer.parseInt(edad);

        // if (mayorEdad < 0) {
        // JOptionPane.showMessageDialog(null, "Error al ingresar la edad");
        // } else if (mayorEdad >= 18) {
        // JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        // } else {
        // JOptionPane.showMessageDialog(null, "Eres menor de edad");
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 5. Realiza un programa que solicite al usuario
         * dos números enteros y determine cuál es el mayor de ellos.
         */

        // String num1 = JOptionPane.showInputDialog("Por favor ingrese el primer
        // número: ");
        // String num2 = JOptionPane.showInputDialog("Por favor ingrese el segundo
        // número: ");
        // int mayor1 = Integer.parseInt(num1);
        // int mayor2 = Integer.parseInt(num2);
        // if (mayor1 > mayor2 ) {
        // JOptionPane.showMessageDialog(null, "El número " + mayor1 + " es mayor que "
        // + mayor2);
        // } else if(mayor1 < mayor2 ) {
        // JOptionPane.showMessageDialog(null, "El número " + mayor2 + " es mayor que "
        // + mayor1);
        // }
        // else{
        // JOptionPane.showMessageDialog(null, "El número " + mayor1 + " es igual que "
        // + mayor2);
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 6. Escribe un programa que pida al usuario un número y
         * verifique si es positivo, negativo o cero.
         */

        // String number = JOptionPane.showInputDialog("Por favor ingrese un número: ");
        // int positivoNegativo = Integer.parseInt(number);
        // if (positivoNegativo > 0 ) {
        // JOptionPane.showMessageDialog(null, "El número " + positivoNegativo + " es
        // positivo");
        // } else if(positivoNegativo < 0 ) {
        // JOptionPane.showMessageDialog(null, "El número " + positivoNegativo + " es
        // negativo");
        // }
        // else{
        // JOptionPane.showMessageDialog(null, "El número es 0");
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 7. Crea un programa que pida al usuario
         * un número entero positivo y muestre su tabla de multiplicar hasta el 10.
         */

    //     String tabla = JOptionPane.showInputDialog("Por favor ingrese un número entero positivo: ");
    //     int tablaMulti = Integer.parseInt(tabla);
    //     if (tablaMulti <= 0) {
    //     JOptionPane.showMessageDialog(null, "Error el número debe ser positivo o entero");
    //     } else {
    //     JOptionPane.showMessageDialog(null, "Tabla de multiplicar del número " +
    //     tablaMulti + ":");
    //     for (int i = 1; i <= 10; i++) {
    //     int resultado = tablaMulti * i;
    //     JOptionPane.showMessageDialog(null, tablaMulti + " x " + i + " = " +
    //     resultado);
    // System.out.println(tablaMulti + " x " + i + " = " +
    //     resultado);
    //     }
    // }
        
        // _________________________________________________________________________________________________________________
        /*
         * 8. Realiza un programa que simule un juego de adivinar un número.
         * El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
         * adivinarlo.
         * El programa debe indicar si el número ingresado es mayor o menor que el
         * número a adivinar.
         */

        // Random random = new Random();
        // int numeroAdivinar = random.nextInt(100) + 1;

        // int intentos = 0;
        // int numeroIngresado;

        // JOptionPane.showMessageDialog(null, "Ingrese un número entre 1 y 100 para
        // adivinar el número.");

        // do {
        // String numIngresado = JOptionPane.showInputDialog("Ingrese un número para
        // adivinar:");
        // numeroIngresado = Integer.parseInt(numIngresado);
        // intentos++;

        // if (numeroIngresado < numeroAdivinar) {
        // JOptionPane.showMessageDialog(null, "El número " + numIngresado+ " es menor
        // que el número a adivinar. Intente nuevamente.");
        // } else if (numeroIngresado > numeroAdivinar) {
        // JOptionPane.showMessageDialog(null, "El número " + numIngresado+ " es mayor
        // que el número a adivinar. Intente nuevamente.");
        // }
        // } while (numeroIngresado != numeroAdivinar);

        // JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número "
        // + numeroAdivinar + " en " + intentos + " intentos.");

        // _________________________________________________________________________________________________________________
        /*
         * 9. Escribe un programa que solicite al usuario un
         * número entero positivo y calcule su factorial.
         */

        // String numFact = JOptionPane.showInputDialog("Por favor ingrese un número entero positivo para darle el factorial: ");

        // if (Integer.parseInt(numFact) < 0) {
        // JOptionPane.showMessageDialog(null,"Error: Debe ingresar un número entero positivo.");
        // } else {
        // long factorial = calcularFactorial(Integer.parseInt(numFact));
        // JOptionPane.showMessageDialog(null,"El factorial de " +
        // Integer.parseInt(numFact) + " es: " + factorial );
        //  System.out.println("El factorial de " +Integer.parseInt(numFact) + " es: "+ factorial);
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 10. Crea un programa que muestre los primeros 20 números de la serie
         * Fibonacci.
         * La serie Fibonacci se forma sumando los dos números anteriores
         * para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
         */

        // int fiboCantidad = 22;
        // StringBuilder resultado = new StringBuilder("Serie Fibonacci:\n");
        // JOptionPane.showMessageDialog(null,"Se mostrará los 20 primeros números de la serie Fibonacci");
        // for (int i = 0; i < fiboCantidad; i++) {
        // int numeroFibonacci = fibonacciFuntion(i);
        // resultado.append(numeroFibonacci).append(", ");
        // System.out.println(fibonacciFuntion(i));
        // }
        //     JOptionPane.showMessageDialog(null, resultado.toString());  




        // _________________________________________________________________________________________________________________
        /*
         * 11. Escribe un programa que calcule el área de un triángulo utilizando
         * la fórmula de Herón. El usuario debe ingresar las longitudes de los tres
         * lados.
         * 
         */

        // String ladoA = JOptionPane.showInputDialog(null,"Ingrese por favor la
        // longitud del lado 1 del triángulo: ");
        // float a = Float.parseFloat(ladoA);

        // String ladoB = JOptionPane.showInputDialog(null,"Ingrese por favor la
        // longitud del lado 2 del triángulo: ");
        // float b = Float.parseFloat(ladoB);

        // String ladoC = JOptionPane.showInputDialog(null,"Ingrese por favor la
        // longitud del lado 3 del triángulo: ");
        // float c = Float.parseFloat(ladoC);

        // JOptionPane.showMessageDialog(null,"El área del triángulo mediante la fórmula
        // de Herón es: " + (((a+b+c))/2));

        // _________________________________________________________________________________________________________________
        /*
         * 12. Realiza un programa que pida al usuario un número entero y
         * determine si es un número primo o no
         */

        // String numPrimo = JOptionPane.showInputDialog(null,"Ingrese por favor un
        // número entero positivo: ");
        // int primoNum = Integer.parseInt(numPrimo);

        // boolean esPrimo = esNumeroPrimo(primoNum);

        // if(esPrimo){
        // JOptionPane.showMessageDialog(null, "El número " + primoNum + " es primo");
        // }else{
        // JOptionPane.showMessageDialog(null, "El número " + primoNum + " no es
        // primo");
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 13. Pide al usuario un número decimal y muestra su valor redondeado a un
         * número específico de decimales
         */

        // String numDecimal = JOptionPane.showInputDialog(null,"Ingrese por favor un
        // número decimal: ");
        // double numRedondeado = Double.parseDouble(numDecimal);

        // String cantDecimal = JOptionPane.showInputDialog(null,"Ingrese la cantidad de
        // decimales que desea ver: ");
        // int cantidadDeci = Integer.parseInt(cantDecimal);

        // StringBuilder concatenear = new StringBuilder("#.");
        // for (int i = 0; i < cantidadDeci; i++) {
        // concatenear.append("#");
        // }

        // DecimalFormat redondeo = new DecimalFormat(concatenear.toString());
        // String numeroRedondeado = redondeo.format(numRedondeado);

        // JOptionPane.showMessageDialog(null, "El número " +numRedondeado + "
        // redondeado a " + cantDecimal + " decimales es: " + numeroRedondeado);

        // _________________________________________________________________________________________________________________
        /*
         * 14. Escribe un programa que solicite al usuario un número entero positivo
         * y verifique si es un número perfecto. Un número perfecto es aquel cuya suma
         * de sus divisores propios (excluyendo al propio número) es igual al número.
         */

        // String numPerfecto = JOptionPane.showInputDialog(null, "Ingrese por favor un
        // número entero positivo: ");
        // int numPerf = Integer.parseInt(numPerfecto);

        // boolean esPerfecto = esNumeroPerfecto(numPerf);

        // if (esPerfecto) {
        // JOptionPane.showMessageDialog(null, "El número " +numPerf + " es un número
        // perfecto.");
        // } else {
        // JOptionPane.showMessageDialog(null, "El número " +numPerf + " no es un número
        // perfecto.");
        // }

        // _________________________________________________________________________________________________________________
        /*
         * 15. Crea un programa que pida al usuario un número entero y determine si es
         * un número capicúa.
         * Un número capicúa es aquel que se lee igual de izquierda a derecha que de
         * derecha a izquierda.
         */
    //     String numeroCapicua;
    //   do {
    //       numeroCapicua = JOptionPane.showInputDialog(null, "Por favor ingrese un número:");
    //   } while (numeroCapicua.isEmpty());
        
    //   boolean capicua = esPalindromo(numeroCapicua);

    //   if (capicua) {
    //       JOptionPane.showMessageDialog(null, "El número '"+numeroCapicua+"' es capicúa.");
    //   } else {
    //       JOptionPane.showMessageDialog(null, "El número '"+numeroCapicua+"' no capicúa.");
    //   }


     // _________________________________________________________________________________________________________________
        /*
         * 16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un 
         * número dado ingresado por el usuario. 
         */

        // String fibo = JOptionPane.showInputDialog(null,"Ingrese la cantidad de números de la serie Fibonacci que desea ver: ");
        // int fibonacci = Integer.parseInt(fibo);
        
        // StringBuilder resultado = new StringBuilder("Serie Fibonacci:\n");

        // for (int i = 0; i < fibonacci; i++) {
        //     int numeroFibonacci = fibonacciFuntion(i);
        //     resultado.append(numeroFibonacci).append(", ");
        // System.out.println(fibonacciFuntion(i));
        // }
        // JOptionPane.showMessageDialog(null, resultado.toString());

// _________________________________________________________________________________________________________________
        /*
       17. Pide al usuario dos números enteros y 
       muestra todos los números primos que se encuentran en ese rango.
         */
        // String numero1 = JOptionPane.showInputDialog(null,"Ingrese el primer número entero: ");
        // int num1 = Integer.parseInt(numero1);

        // String numero2 = JOptionPane.showInputDialog(null,"Ingrese el segundo número entero: ");
        // int num2 = Integer.parseInt(numero2);

        // JOptionPane.showMessageDialog(null,"Números primos en el rango [" + num1 + ", " + num2 + "]:");
        // for (int i = num1; i <= num2; i++) {
        //     if (esNumeroPrimo(i)) {
        //         JOptionPane.showMessageDialog(null,i + " ");
        //         System.out.print(i + " ");
        //     }
        // }

// _________________________________________________________________________________________________________________
        /*
         Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras 
         mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números
          aleatorios y la clase String para manipular la contraseña.
         */
        // String contrasena = generarContrasena(8);
        // JOptionPane.showMessageDialog(null,"Contraseña generada: " + contrasena);


// _________________________________________________________________________________________________________________
        /*
         19. Escribe un programa que solicite al usuario su nombre y 
         luego lo imprima en mayúsculas y minúsculas 
         */

        // String userName = JOptionPane.showInputDialog(null,"Por favor ingrese su nombre: ");
        // JOptionPane.showMessageDialog(null,"Nombre en mayúscula: \n" + userName.toUpperCase() + "\nNombre en minúscula: \n"+ userName.toLowerCase() );

        // _________________________________________________________________________________________________________________
        /*
         20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden 
         */
    // String cadena = JOptionPane.showInputDialog(null,"Por favor ingrese una frase: ");
    // String cadenaInv = invertirCadena(cadena);
    // JOptionPane.showMessageDialog(null,"Frase: \n '" + cadena +"'"+ "\nFrase invertida: \n'" + cadenaInv+"'");
     // _________________________________________________________________________________________________________________
    /*
     21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella 
    */

    // String fraseIngresada = JOptionPane.showInputDialog(null,"Por favor ingrese una frase: ");
    // char letra = JOptionPane.showInputDialog(null,"Por favor ingrese la letra que desea contar: ").charAt(0);
    
    // int cantLetra = contarLetra(fraseIngresada, letra);
    // JOptionPane.showMessageDialog(null, "La letra '" + letra + "' aparece " + cantLetra + " veces en la frase:\n'"+ fraseIngresada+"'");


    // _________________________________________________________________________________________________________________
    /*
     22. Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo 
     (se lee igual de izquierda a derecha que de derecha a izquierda) 
      */    
   
    //    String frasePalin;
    //   do {
    //     frasePalin = JOptionPane.showInputDialog(null, "Por favor ingrese una frase:");
    //   } while (frasePalin.isEmpty());
    //   boolean palindromo = esPalindromo(frasePalin);

    //   if (palindromo) {
    //       JOptionPane.showMessageDialog(null, "La frase '"+frasePalin+"' es un palíndromo.");
    //   } else {
    //       JOptionPane.showMessageDialog(null, "La frase '"+frasePalin+"' no es un palíndromo.");
    //   }


    // _________________________________________________________________________________________________________________
    /*
     23. Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
      */  

    //   String contarPalabra;
    //   do {
    //     contarPalabra = JOptionPane.showInputDialog(null, "Por favor ingrese una frase:");
    //      JOptionPane.showMessageDialog(null, "La frase '"+contarPalabra+"' tiene como tamaño de:\n" + contarPalabra.length() );
    //   } while (contarPalabra.isEmpty());
   
   
   
     // _________________________________________________________________________________________________________________
    /*
     24. Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones
     de una letra específica por otra
      */  
   
    //  Reemplazar.reemplazo();

 // _________________________________________________________________________________________________________________
    /*
     25. Pide al usuario una frase y muestra cada palabra por separado 
      */  
        // palabraSeparada.separada();


        // _________________________________________________________________________________________________________________
    /*
     26. Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres 
     tiene sin contar los espacios en blanco 
      */ 
        // contaSinEspac.contarSinEspa();

              // _________________________________________________________________________________________________________________
    /*
     27. Crea un programa que solicite al usuario una frase y luego 
     muestre las palabras ordenadas alfabéticamente 
      */ 

    //   ordenAlfabetico.ordenarAlfa();
    
         // _________________________________________________________________________________________________________________
    /*
     28. Suma de elementos: Escribe un programa que calcule la suma de todos los elementos 
     en un arreglo de enteros.
      */ 
        // sumaArray.sumarArray();
         // _________________________________________________________________________________________________________________
    /*
     29. Encontrar el número más grande: Crea un programa que encuentre el número más grande
      en un arreglo de enteros. 
      */ 

    //   numArrayGrande.numMasgrande();


         // _________________________________________________________________________________________________________________
    /*
     30. Eliminar duplicados: Diseña un programa que elimine los elementos duplicados 
     de un arreglo. 
      */ 

// eliminarArrayDupl.eliminarDuplicados();

     // _________________________________________________________________________________________________________________
    /*
     31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de 
     burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente. 
      */ 
// ordenarElements.elementosOrdenados();

// _________________________________________________________________________________________________________________
    /*
     32. Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y 
     muestre su índice (o un mensaje si no se encuentra). 
      */ 

// buscarElement.buscarDato();


// _________________________________________________________________________________________________________________
    /*
     33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en 
     un arreglo. 
      */ 

    //   frecuenciaElement.contarFrecuencia();


    // _________________________________________________________________________________________________________________
    /*
     34. Rotación de elementos: Implementa un programa que rote los elementos de un arreglo
     hacia la izquierda o la derecha una cierta cantidad de posiciones. 
      */ 

      
      // _________________________________________________________________________________________________________________
    /*
     35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
      del 1 al  10. Usa para esto una matriz 
      */ 

// tablaMultiplicar.tablaMulti();

}

    // ____________________________________________________________________________________
    // ________________________________FUNCIONES_____________________________________________
    // FUNCIÓN PARA CALCULAR EL FACTORIAL
    // public static long calcularFactorial(int n) {
    // if (n == 0 || n == 1) {
    // return 1;
    // } else {
    // return n * calcularFactorial(n - 1);
    // }
    // }

    // // FUNCIÓN FIBONACCI
    // public static int fibonacciFuntion(int n) {
    // if (n == 0) {
    // return 0;
    // } else if (n == 1) {
    // return 1;
    // } else {
    // return fibonacciFuntion(n - 1) + fibonacciFuntion(n - 2);
    // }
    // }

    // -------------------------------------------------------------------------------------------
    // FUNCIÓN PARA DETERMINAR SI ES PRIMO O NO UN NÚMERO
    // public static boolean esNumeroPrimo(int numero) {
    // if (numero <= 1) {
    // return false;
    // }

    // for (int i = 2; i <= Math.sqrt(numero); i++) {
    // if (numero % i == 0) {
    // return false;
    // }
    // }

    // return true;

    // }

    // -------------------------------------------------------------------------------------------
    // FUNCIÓN PARA DETERMINAR SI ES UN NÚMERO PERFECTO O NO
    // public static boolean esNumeroPerfecto(int numero) {
    // if (numero <= 0) {
    // return false;
    // }

    // int sumaDivisores = 0;
    // for (int i = 1; i <= numero / 2; i++) {
    // if (numero % i == 0) {
    // sumaDivisores += i;
    // }
    // }

    // return sumaDivisores == numero;
    // }

      // -------------------------------------------------------------------------------------------
    // FUNCIÓN PARA CREAR CONTRASEÑA CON CARÁCTERES DE 8, LETRAS MAYÚSCULAS Y MINÚSCULAS Y NÚMEROS
    
    // public static String generarContrasena(int tamano) {
    //     String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    //     StringBuilder contrasena = new StringBuilder();
    // Random random = new Random();
    //     for (int i = 0; i < tamano; i++) {
    //         int index = random.nextInt(caracteres.length());
    //         char caracterAleatorio = caracteres.charAt(index);
    //         contrasena.append(caracterAleatorio);
    //     }
    //     return contrasena.toString();
    // }

   // -------------------------------------------------------------------------------------------
    // FUNCIÓN PARA CREAR INVERTIR LA CADENA O FRASE INGRESADA
    
    // public static String invertirCadena(String cadena) {
    //     StringBuilder stringBuilder = new StringBuilder(cadena);
    //     stringBuilder.reverse();
    //     return stringBuilder.toString();
    // }

// -------------------------------------------------------------------------------------------
    // FUNCIÓN PARA CONTAR CUANTAS VECES APARECE UNA LETRA EN LA FRASE INGRESADA POR EL USUARIO
    // public static int contarLetra(String fraseIngresada, char letra) {
    //     int contador = 0;
    //     for (int i = 0; i < fraseIngresada.length(); i++) {
    //         if (fraseIngresada.charAt(i) == letra) {
    //             contador++;
    //         }
    //     }
    //     return contador;
    // }


    // public static boolean esPalindromo(String frase) {
    //     // Eliminamos espacios y signos de puntuación para facilitar la verificación
    //     frase = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();

    //     int letraInicio = 0;
    //     int letraFin = frase.length() - 1;

    //     while (letraInicio < letraFin) {
    //         if (frase.charAt(letraInicio) != frase.charAt(letraFin)) {
    //             return false;
    //         }
    //         letraInicio++;
    //         letraFin--;
    //     }

    //     return true;
    // }
}