import java.util.Arrays;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ordenAlfabetico {
     public static void ordenarAlfa(){

        String frase;
        do {
         frase = JOptionPane.showInputDialog(null, "Por favor ingrese una frase:");
         } while (frase.isEmpty());
         String[] palabras = frase.split(" ");
        
         Arrays.sort(palabras);

        StringBuilder resultado = new StringBuilder("Frase ordenada alfabéticamente por palabra:\n");

        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
        
        }
        

