package interfaces.implementacion.figurasDibujables;

import javax.swing.JOptionPane;

import interfaces.implementacion.figurasDibujables.AFiguras.AFiguras;

public class CCuadrado extends AFiguras{

    @Override
    public void dibujar() {
      JOptionPane.showMessageDialog(null,"Dibujando un cuadrado \u2B1B");
    }
}