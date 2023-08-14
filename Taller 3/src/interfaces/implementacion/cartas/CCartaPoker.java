package interfaces.implementacion.cartas;

import javax.swing.JOptionPane;

import interfaces.contratos.ICartas.ICartas;

public class CCartaPoker implements ICartas{
    private String palo;
    private String valor;

    public CCartaPoker(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        JOptionPane.showMessageDialog(null, valor + " de " + palo, "Carta de Poker",1);
    }

    @Override
    public int valorNumerico() {
        return 0;
    }
}
