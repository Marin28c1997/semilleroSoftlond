import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class eliminarArrayDupl {
    public static void eliminarDuplicados() {
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
        List<Integer> arregloSinDuplicados = new ArrayList<>();
        for (int num : arreglo) {
            if (!arregloSinDuplicados.contains(num)) {
                arregloSinDuplicados.add(num);
            }
        }
        int[] resultado = new int[arregloSinDuplicados.size()];
        for (int i = 0; i < arregloSinDuplicados.size(); i++) {
            resultado[i] = arregloSinDuplicados.get(i);
        }

        JOptionPane.showMessageDialog(null, "El arreglo original: \n" + arrayToString(arreglo) +
                "\nEl arreglo sin duplicados: \n" + arrayToString(resultado));
    }

    public static String arrayToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
