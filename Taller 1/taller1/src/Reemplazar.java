import javax.swing.JOptionPane;

public class Reemplazar {
    public static void reemplazo() {
        String cadena;
        char letraCambiar;
        char letraNueva;
        do {
         cadena = JOptionPane.showInputDialog(null, "Por favor ingrese una cadena:");
         letraCambiar = JOptionPane.showInputDialog(null, "Por favor ingrese la letra que desea reemplazar en la cadena:").charAt(0);
         letraNueva = JOptionPane.showInputDialog(null, "Por favor ingrese una nueva letra:").charAt(0);
        } while (cadena.isEmpty() || Character.isWhitespace(letraCambiar)  || Character.isWhitespace(letraNueva));

        String cadenaReemplazada = reemplazarLetra(cadena, letraCambiar, letraNueva);

        JOptionPane.showMessageDialog(null, "Cadena Normal:\n '" + cadena +"'"+ "\nLetra a reemplazar\n '"+letraCambiar +"'\n"+ 
        "Letra nueva a colocar\n'"+ letraNueva+"'"+"\nCadena modificada: \n" + cadenaReemplazada);
    }

    public static String reemplazarLetra(String cadena, char letraAnterior, char letraNueva) {
        return cadena.replace(letraAnterior, letraNueva);

    }
}
