import javax.swing.JOptionPane;

public class palabraSeparada {
    public static void separada(){

        String frase;
        do {
         frase = JOptionPane.showInputDialog(null, "Por favor ingrese una frase:");
        } while (frase.isEmpty());
         String[] palabras = frase.split(" ");

        StringBuilder resultado = new StringBuilder("Palabras separadas de la frase:\n");

        for (String palabra : palabras) {
            resultado.append(palabra).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }

}
