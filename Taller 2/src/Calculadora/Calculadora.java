package Calculadora;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void calculadoraBasica() {
        int opt;
        double numero1;
        double numero2;
        int nfactorial;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Por favor ingrese la opción que más desee:\n1. SUMA \n2. RESTA \n3. MULTIPLICACIÓN \n4. DIVISIÓN \n5. N FACTORIAL\n6.SALIR",
                    "Bienvenido a la calculadora básica", 1));
        } while (opt < 1 || opt > 6);

        switch (opt) {
            case 1:
                do {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el primer número:",
                            "Bienvenido a la calculadora básica", 1));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el segundo número:",
                            "Bienvenido a la calculadora básica", 1));
                } while (numero1 < 0);

                JOptionPane.showMessageDialog(null,
                        "La SUMA entre " + numero1 + " & " + numero2
                                + " es igual a:\n" +
                                Suma(numero1, numero2),
                        "Bienvenido a la calculadora básica", 1);

                do {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Desea hacer otras operaciones?:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido a la calculadora básica", 1));
                } while(opt != 1 && opt != 2);

                if (opt == 1) {
                    calculadoraBasica();
                }

                break;

            case 2:
                do {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el primer número:",
                            "Bienvenido a la calculadora básica", 1));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el segundo número:",
                            "Bienvenido a la calculadora básica", 1));
                } while (numero1 < 0);

                JOptionPane.showMessageDialog(null,
                        "La RESTA entre " + numero1 + " & " + numero2
                                + " es igual a:\n" +
                                Resta(numero1, numero2),
                        "Bienvenido a la calculadora básica", 1);

                do {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Desea hacer otras operaciones?:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido a la calculadora básica", 1));
                } while (opt != 1 && opt != 2);

                if (opt == 1) {
                    calculadoraBasica();
                }

                break;

            case 3:
                do {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el primer número:",
                            "Bienvenido a la calculadora básica", 1));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el segundo número:",
                            "Bienvenido a la calculadora básica", 1));
                } while (numero1 < 0);

                JOptionPane.showMessageDialog(null,
                        "La MULTIPLICACIÓN entre " + numero1 + " & " + numero2
                                + " es igual a:\n" +
                                Multiplicacion(numero1, numero2),
                        "Bienvenido a la calculadora básica", 1);

                do {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Desea hacer otras operaciones?:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido a la calculadora básica", 1));
                } while (opt != 1 && opt != 2);

                if (opt == 1) {
                    calculadoraBasica();
                }

                break;

            case 4:
                do {
                    numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el primer número:",
                            "Bienvenido a la calculadora básica", 1));
                    numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el segundo número:",
                            "Bienvenido a la calculadora básica", 1));
                } while (numero1 < 0);

                JOptionPane.showMessageDialog(null,
                        "La DIVISIÓN entre " + numero1 + " & " + numero2
                                + " es igual a:\n" +
                                Division(numero1, numero2),
                        "Bienvenido a la calculadora básica", 1);

                do {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Desea hacer otras operaciones?:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido a la calculadora básica", 1));
                } while (opt != 1 && opt != 2);

                if (opt == 1) {
                    calculadoraBasica();
                }

                break;

            case 5:
                do {
                    nfactorial = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Por favor ingrese el número entero positivo al que le desea saber su factorial:",
                            "Bienvenido a la calculadora básica", 1));
                } while (nfactorial < 0);

                JOptionPane.showMessageDialog(null,
                        "El factorial de " + nfactorial + " es igual a:\n" +
                                Factorial(nfactorial),
                        "Bienvenido a la calculadora básica", 1);

                do {
                    opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "¿Desea hacer otras operaciones?:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido a la calculadora básica", 1));
                } while (opt != 1 && opt != 2);

                if (opt == 1) {
                    calculadoraBasica();
                }

                break;

            case 6:

                break;

            default:
                break;
        }

    }

    public static double Suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double Resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double Multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double Division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static long Factorial(int numero1) {
        if (numero1 == 0 || numero1 == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= numero1; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

}
