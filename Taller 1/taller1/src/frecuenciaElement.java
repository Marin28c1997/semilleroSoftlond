import javax.swing.JOptionPane;

public class frecuenciaElement {

    public static void contarFrecuencia() {
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

        int[] elementosUnicos = obtenerElementosUnicos(arreglo);
        int[] frecuencia = contarFrecuenciaArreglo(arreglo, elementosUnicos);

        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < elementosUnicos.length; i++) {
            resultado.append("El número ").append(elementosUnicos[i]).append(" aparece ").append(frecuencia[i]).append(" veces.\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

    public static int[] obtenerElementosUnicos(int[] arreglo) {
        int count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                count++;
            }
        }

        int[] elementosUnicos = new int[count];
        count = 0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                elementosUnicos[count++] = arreglo[i];
            }
        }

        return elementosUnicos;
    }

    public static int[] contarFrecuenciaArreglo(int[] arreglo, int[] elementosUnicos) {
        int[] frecuencia = new int[elementosUnicos.length];

        for (int i = 0; i < elementosUnicos.length; i++) {
            for (int num : arreglo) {
                if (num == elementosUnicos[i]) {
                    frecuencia[i]++;
                }
            }
        }

        return frecuencia;
    }

}
