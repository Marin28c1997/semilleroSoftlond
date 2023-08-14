package interfaces.implementacion.figurasDibujables;

import javax.swing.JOptionPane;

import interfaces.implementacion.figurasDibujables.AFiguras.AFiguras;

public class CCirculo extends AFiguras{

    @Override
    public void dibujar() {
        JOptionPane.showMessageDialog(null,"Dibujando un círculo \uD83C\uDF0D");
    }
}
