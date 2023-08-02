import javax.swing.JOptionPane;

public class buscarElement {
 public static void buscarDato() {
        int nDatos;
        String datos;
        do {
            datos = JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad de datos que desea que tenga el arreglo:");
            nDatos = datos.isEmpty() ? 0 : Integer.parseInt(datos);
        } while (nDatos <= 0);
    
        int[] arreglo = new int[nDatos];

        for (int i = 0; i < nDatos; i++) {
            String dato = JOptionPane.showInputDialog(null, "Por favor ingrese el dato " + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(dato);
        }

        String datoABuscar = JOptionPane.showInputDialog(null, "Por favor ingrese el número que desea buscar:");
        int buscarNum = Integer.parseInt(datoABuscar);

        int indice = buscarEnArreglo(arreglo, buscarNum);

        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "El número " + buscarNum + " se encuentra en el índice " + indice + " del arreglo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + buscarNum + " no se encuentra en el arreglo.");
        }
    }

    public static int buscarEnArreglo(int[] arreglo, int numBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numBuscar) {
                return i;
            }
        }
        return -1;
    
    }
    
}
