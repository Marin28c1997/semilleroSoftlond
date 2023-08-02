import javax.swing.JOptionPane;

public class contaSinEspac {

    public static void contarSinEspa(){

        String frase;
        do {
         frase = JOptionPane.showInputDialog(null, "Por favor ingrese una frase:");
         } while (frase.isEmpty());
           int fraseSinEsp = contarFraseSinEsp(frase);
        JOptionPane.showMessageDialog(null, "La frase\n'"+ frase +"'\n Tiene " + fraseSinEsp + " caracteres (sin espacios).");
     
        }

    public static int contarFraseSinEsp(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (!Character.isWhitespace(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
}
