import javax.swing.JOptionPane;

public class ordenarElements {

    public static void elementosOrdenados() {
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

        ordenarBurbuja(arreglo);

        String arregloOrdenado = imprimirArreglo(arreglo);
        JOptionPane.showMessageDialog(null, "El arreglo en 'Burbuja' "+ arregloOrdenado);
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }

            // Si no se realizó ningún intercambio en esta iteración, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }

    public static String imprimirArreglo(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

}
