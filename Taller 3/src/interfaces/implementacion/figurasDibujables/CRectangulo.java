package interfaces.implementacion.figurasDibujables;

import javax.swing.JOptionPane;

import interfaces.implementacion.figurasDibujables.AFiguras.AFiguras;

public class CRectangulo extends AFiguras{

    @Override
    public void dibujar() {
       JOptionPane.showMessageDialog(null,"Dibujando un rectángulo \uD83D\uDFE4");
    }
}
