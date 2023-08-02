import javax.swing.JOptionPane;

public class numArrayGrande {
    public static void numMasgrande() {
        int nDatos;
        String datos;
            do {
            datos = JOptionPane.showInputDialog(null, "Pr favor ingrese la cantidad de datos que desea que tenga el arreglo:");
            nDatos = datos.isEmpty() ? 0 : Integer.parseInt(datos);    
        }while(nDatos <=0);

        int[] arreglo = new int[nDatos];

        for (int i = 0; i < nDatos; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el dato " + (i + 1) + ":"));
        }

        int maximo = arreglo[0]; 

        for (int i = 1; i < nDatos; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i]; 
            }
        }

        JOptionPane.showMessageDialog(null, "El número más grande en el arreglo es: " + maximo);
    }

}
