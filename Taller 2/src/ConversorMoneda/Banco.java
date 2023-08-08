package ConversorMoneda;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Banco extends Conversor {

    public static void Opcion() {
        int opt;
        double cantidadD;
        DecimalFormat decimalMoneda = new DecimalFormat("0.00000");
        DecimalFormat decimalTotal = new DecimalFormat("0.00000");
        String resultado;
        Double conver;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Por favor ingrese la opción que más desee:\n1. COP → USD \n2. USD → COP \n3. COP → EURO \n4. EURO → COP \n 5 EURO → USD \n 6. USD → EURO\n 7. SALIR",
                    "Bienvenido al conversor de divisas", 1));
        } while (opt < 1 || opt > 7);

        switch (opt) {
            case 1:

                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de pesos combianos a convertir en dólares:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = copAUsd(cantidadD);
                resultado = decimalTotal.format(conver);

                JOptionPane.showMessageDialog(null,
                        "Cantidad de COP: " + cantidadD + "\nValor del USD: " + decimalMoneda.format(pesoADolar)
                                + "\nTotal de COP → USD:\n" +
                                resultado + " USD",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                }while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }

                break;
            case 2:
                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de dólares a convertir en pesos colombianos:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = usdACop(cantidadD);
                resultado = decimalTotal.format(conver);

                JOptionPane.showMessageDialog(null,
                        "Cantidad de USD: " + cantidadD + "\nValor del COP: " + decimalMoneda.format(dolarAPeso)
                                + "\nTotal de USD → COP:\n" +
                                resultado + " COP",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }

                break;

            case 3:
                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de pesos colombianos a convertir en euros:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = copAEuro(cantidadD);
                resultado = decimalTotal.format(conver);
                JOptionPane.showMessageDialog(null,
                        "Cantidad de COP: " + cantidadD + "\nValor del EURO: " + decimalMoneda.format(pesoAEuro)
                                + "\nTotal de COP → EURO:\n" +
                                resultado + " EURO",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                }while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }
                break;

            case 4:
                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de euros a convertir en pesos colombianos:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = euroACop(cantidadD);
                resultado = decimalTotal.format(conver);
                JOptionPane.showMessageDialog(null,
                        "Cantidad de EURO: " + cantidadD + "\nValor del COP: " + decimalMoneda.format(pesoAEuro)
                                + "\nTotal de EURO → COP:\n" +
                                resultado + " COP",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }
                break;

            case 5:
                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de euros a convertir en dólares:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = euroAUsd(cantidadD);
                resultado = decimalTotal.format(conver);
                JOptionPane.showMessageDialog(null,
                        "Cantidad de EURO: " + cantidadD + "\nValor del USD: " + decimalMoneda.format(euroADolar)
                                + "\nTotal de EURO → USD:\n" +
                                resultado + " USD",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }
                break;

            case 6:
                do {
                    cantidadD = Double.parseDouble(JOptionPane.showInputDialog(null,
                            "Por favor ingrese la cantidad de dólares a convertir en euros:",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD < 0);

                conver = usdAEuro(cantidadD);
                resultado = decimalTotal.format(conver);
                JOptionPane.showMessageDialog(null,
                        "Cantidad de USD: " + cantidadD + "\nValor del EURO: " + decimalMoneda.format(dolarAEuro)
                                + "\nTotal de USD → EURO:\n" +
                                resultado + " EURO",
                        "Bienvenido al conversor de divisas", 1);

                do {
                    cantidadD = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Desea convertir otras divisas:\n 1. Sí\n 2. No, salir del programa",
                            "Bienvenido al conversor de divisas", 1));
                } while (cantidadD != 1 && cantidadD != 2);

                if (cantidadD == 1) {
                    Opcion();
                }

                break;

            case 7:

                break;

            default:
                break;
        }

    }

}
