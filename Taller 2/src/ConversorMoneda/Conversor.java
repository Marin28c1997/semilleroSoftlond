package ConversorMoneda;

import javax.swing.JOptionPane;

public class Conversor {
    
    public static double pesoADolar = 0.00024;
    public static double pesoAEuro = 0.00022;
    public static double dolarAPeso = 4144.53;
    public static double euroApeso = 4560.14;
    public static double dolarAEuro = 0.91;
    public static double euroADolar = 1.10;
    

    public static double copAUsd(double cop) {
        return cop * pesoADolar; // Suponiendo que 1 peso es igual a 0.00024 usd
    }

    public static double copAEuro(double cop){ // Suponiendo que 1 peso es igual a 0.00022 euro
        return cop * pesoAEuro;
    }

    public static double euroACop(double euro){ // Suponiendo que 1 euro es igual a 4560.14 usd
        return euro * euroApeso;
    }


    public static double usdACop(double dolares) {
        return dolares * dolarAPeso; // Suponiendo que 1 dólar es igual a 4144.53 pesos
    }


    public static double usdAEuro(double dolares){
        return dolares * dolarAEuro;
    }

     public static double euroAUsd(double euro){
        return euro * euroADolar;
    }
    
}
