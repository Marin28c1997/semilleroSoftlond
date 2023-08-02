import java.util.Arrays;

import javax.swing.JOptionPane;

public class sumaArray {
        public static void sumarArray(){

            int nDatos;
            String input;
                do {
                input = JOptionPane.showInputDialog(null, "Pr favor ingrese la cantidad de datos que desea que tenga el arreglo:");
                nDatos = input.isEmpty() ? 0 : Integer.parseInt(input);    
            }while(nDatos <=0);
            
            int[] arreglo = new int[nDatos];
    
            for (int i = 0; i < nDatos; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el dato " + (i + 1) + ":"));
            }
    
            int suma = 0;
            for (int i = 0; i < nDatos; i++) {
                suma += arreglo[i];
            }
    
            JOptionPane.showMessageDialog(null, "La suma de los datos en el arreglo es: " + suma);
    }
}
