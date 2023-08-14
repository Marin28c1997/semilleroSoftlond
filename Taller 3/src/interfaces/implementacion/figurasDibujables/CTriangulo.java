package interfaces.implementacion.figurasDibujables;

import javax.swing.JOptionPane;

import interfaces.implementacion.figurasDibujables.AFiguras.AFiguras;

public class CTriangulo extends AFiguras{

    @Override
    public void dibujar() {
     JOptionPane.showMessageDialog(null,"Dibujando un triángulo \u25B3");
    }
}