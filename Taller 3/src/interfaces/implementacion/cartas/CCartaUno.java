package interfaces.implementacion.cartas;

import javax.swing.JOptionPane;

import interfaces.contratos.ICartas.ICartas;

public class CCartaUno implements ICartas{
    private String color;
    private int numero;

    public CCartaUno(String color, int numero) {
        this.color = color;
        this.numero = numero;
    }

    @Override
    public void mostrarCarta() {
            JOptionPane.showMessageDialog(null, numero + " " + color, "Carta de Uno",1);
    }

    @Override
    public int valorNumerico() {
        return 0;
    }
}
